package homework;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.HashMap;
import java.util.Map;

public class MainEntry {

	public static void main(String[] args) throws IOException, FileNotFoundException {
		try {
			BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
			OutputStream os = new FileOutputStream("BMI.txt");
			FileReader rw = new FileReader("BMI.txt");
			Map<String, String> map = new HashMap<String, String>() {
				@Override
				public String toString() {
			        StringBuilder stb = new StringBuilder();
			        for (Map.Entry<String, String> entry : this.entrySet()) {
			            stb.append(entry.getKey()).append(" ")
			                    .append(entry.getValue()).append("\n");
			        }
			        return stb.toString();
			    }
			};

			while(true) {
				System.out.println("1 : �߰� \t 2 : ����");
				System.out.println("3 : txt ���� \t 4 : txt ��� \t 0 : ����");
				String controller = br.readLine();
				switch(controller) {
					case "1": create(map); continue;
					case "2": delete(map); continue;
					case "3": os.write(map.toString().getBytes()); continue;
					case "4": read(); continue;
					case "0": break;
					default: System.out.println("�߸� �Է��ϼ̽��ϴ�."); continue;
				}
			}
			
	
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	public static void create(Map<String, String> map) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		BMI bmi = new BMI();
		
		System.out.print("�̸� : ");
		String str = br.readLine();
		System.out.print("Ű : ");
		bmi.setHeight(Integer.parseInt(br.readLine()));
		System.out.print("������ : ");
		bmi.setWeight(Integer.parseInt(br.readLine()));

		bmi.setBmi((float)(bmi.getWeight()/(bmi.getHeight()/100.0)*(bmi.getHeight()/100.0)));
		if(bmi.getBmi()<18.5) {
			bmi.setState("ü�ߺ���");
		} else if(bmi.getBmi()>=18.5 && bmi.getBmi()<23) {
			bmi.setState("����");
		} else if(bmi.getBmi()>=23 && bmi.getBmi()<25) {
			bmi.setState("��ü��");
		} else {
			bmi.setState("��");
		}
		
		map.put(str, bmi.toString());
	}
	
	public static void delete(Map<String, String> map) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		System.out.print("�̸� : ");
		String str = br.readLine();
		
		if(map.containsKey(str)) {
			map.remove(str);
		}
	}
	
	public static void read() throws IOException, FileNotFoundException {
		FileReader rw = new FileReader("bmi.txt");
        BufferedReader br = new BufferedReader( rw );

	    String readLine = null ;
	    while((readLine = br.readLine()) != null){
	        System.out.println(readLine);
	    }
	}
}