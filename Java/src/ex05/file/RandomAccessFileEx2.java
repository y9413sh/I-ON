package ex05.file;

import java.io.IOException;
import java.io.RandomAccessFile;

public class RandomAccessFileEx2 {
	public static void main(String[] args) throws IOException {
		// �о���� ������
		int seekSize = 5;

		// �б� �������� ������ ����.
		RandomAccessFile rdma = new RandomAccessFile("example.txt", "r");
		String line = "";

		// ��ü ���ڿ��� ���
		while ((line = rdma.readLine()) != null) {
			System.out.println(line);
		}

		// ���ڿ� �� ����
		System.out.println("total length : " + rdma.length() + "\n");

		byte[] data = null;

		// ���� ������ = �ѱ���/seekSize + (�ѱ���%seekSize�� �������� 0�̸� 0�� ��ȯ 0�̾ƴϸ� 1�� ��ȯ)
		long size = rdma.length() / seekSize + (rdma.length() % seekSize == 0 ? 0 : 1);
		
		for (int i = 0; i < size; i++) {
			data = new byte[seekSize];

			// seekSize ��ŭ ����
			rdma.seek(i * seekSize);
			rdma.read(data);

			// ����Ʈ �����͸� ���ڿ��� ��ȯ(trim()�� ����� ������ ����)
			System.out.printf("pointer : %02d  str : %s \n", rdma.getFilePointer(), new String(data).trim());
		}

		// ���� �ݱ�
		rdma.close();
	}
}
