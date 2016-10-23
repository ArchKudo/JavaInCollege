public class Room {
	int length, width;
	public Room() {}
	public Room(int height, int width) {
		this.length = height;
		this.width = width;
	}

	public int getArea() {
		return length * width;
	}
}
