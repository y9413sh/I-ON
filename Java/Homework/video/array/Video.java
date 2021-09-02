package video.array;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Video {
	private int id;
	private String title;
	private String category;
	private boolean rent;
	private String rentName = "";
	String rentDate = "";

	Video() {
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public boolean isRent() {
		return rent;
	}

	public void setRent(boolean rent) {
		this.rent = rent;
	}
	
	public String getRentName() {
		return rentName;
	}

	public void setRentName(String rentName) {
		this.rentName = rentName;
	}

	public String getRentDate() {
		return rentDate;
	}

	public void setRentDate() {
		String formatter = new SimpleDateFormat ( "yyyy//MM/dd-HH:mm").format(new Date());
		this.rentDate=formatter;
	}

	@Override
	public String toString() {
		return "--���� ����--"
				+ "\n ���� id= " + id
				+ "\n ���� ����= " + title
				+ "\n ���� ī�װ�= " + category
				+ "\n �뿩���ɿ���= " + rent
				+ "\n �뿩�� ����= " + rentName
				+ "\n �뿩����= " + rentDate;
	}
}
