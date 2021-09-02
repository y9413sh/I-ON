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
		return "--비디오 정보--"
				+ "\n 고유 id= " + id
				+ "\n 비디오 제목= " + title
				+ "\n 비디오 카테고리= " + category
				+ "\n 대여가능여부= " + rent
				+ "\n 대여자 성함= " + rentName
				+ "\n 대여일자= " + rentDate;
	}
}
