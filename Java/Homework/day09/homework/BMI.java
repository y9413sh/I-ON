package homework;

public class BMI {

	int height;
	int weight;
	String state;
	float bmi;

	public int getHeight() {
		return height;
	}

	public void setHeight(int height) {
		this.height = height;
	}

	public int getWeight() {
		return weight;
	}

	public void setWeight(int weight) {
		this.weight = weight;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public float getBmi() {
		return bmi;
	}

	public void setBmi(float bmi) {
		this.bmi = bmi;
	}

	@Override
	public String toString() {
		return "BMI ����Դϴ�." +
				"\nŰ=" + height +
				"\n������=" + weight +
				"\n����=" + state +
				"\nbmi=" + bmi + "\n";
	}

}
