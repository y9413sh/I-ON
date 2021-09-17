package ex04.di;

import java.util.Scanner;

public class WorkerShowImpl implements PersonShow {
	private Worker worker;

	public void setWorker(Worker worker) {
		this.worker = worker;
	}
	
	public void workerShow(Worker worker) {
		this.worker=worker;
	}

	@Override
	public void input() {
		Scanner sc = new Scanner(System.in);
		System.out.println("--------Worker--------");
		System.out.print("이름: ");
		worker.setName(sc.next()); sc.nextLine();
		System.out.print("직업: ");
		worker.setJob(sc.next()); sc.nextLine();
		System.out.print("회사: ");
		worker.setCompany(sc.next()); sc.nextLine();

	}

	@Override
	public void output() {
		System.out.println("--------Worker Info--------");
		worker.workerInfo();
	}
}
