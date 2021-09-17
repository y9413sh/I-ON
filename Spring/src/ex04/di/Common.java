package ex04.di;

public abstract class Common {
	private String name;
	private String job;
	
	public Common() { }
	
	public Common(String name, String job) {
		this.name=name;
		this.job=job;
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getJob() {
		return job;
	}
	public void setJob(String job) {
		this.job = job;
	}
	
}
