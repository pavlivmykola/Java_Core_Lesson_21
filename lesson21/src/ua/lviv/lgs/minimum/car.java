package ua.lviv.lgs.minimum;

public class car {

	@CarModels("Good choice")
	private String model;
	@CarModels("Very powerfull")
	private int hp;
	@CarModels("So long")
	private int length;
	@CarModels("Too wide")
	private int width;
	
	public car(String model, int hp, int length, int width) {
		super();
		this.model = model;
		this.hp = hp;
		this.length = length;
		this.width = width;
	}

	public String getModel() {
		return model;
	}

	public void setModel(String model) {
		this.model = model;
	}

	public int getHp() {
		return hp;
	}

	public void setHp(int hp) {
		this.hp = hp;
	}

	public int getLength() {
		return length;
	}

	public void setLength(int length) {
		this.length = length;
	}

	public int getWidth() {
		return width;
	}

	public void setWidth(int width) {
		this.width = width;
	}

	@Override
	public String toString() {
		return "car [model=" + model + ", hp=" + hp + ", length=" + length + ", width=" + width + "]";
	}
	
	
	
}
