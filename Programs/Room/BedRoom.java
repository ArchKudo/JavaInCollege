public class BedRoom extends Room{
	int height;
	public BedRoom() {}
	public BedRoom(int length, int width, int height) {
		super(length, width);
		this.height = height;
	}
	public int getVolume() {
		return length * height * width;
	}
}
