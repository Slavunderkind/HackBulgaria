public class Box<T> {
	Integer integer;
	String string;

	public Box() {

	}

	public Box(int integer, String string) {
		super();
		this.integer = integer;
		this.string = string;
	}

	public Integer getInteger() {
		return integer;
	}

	public <T> String getString() {
		return string;
	}

	public void set(int integer) {
		this.integer = integer;
	}

	public void set(String string) {
		this.string = string;
	}

}
