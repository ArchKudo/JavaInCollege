/**
 * @brief Write a Java program to implement the following inheritance:
 *      1.  +----+
 *          |Room|
 *          +--+-+
 *             |
 *             v
 *         +---+---+
 *         |Bedroom|
 *         +-------+
 * @note Practical No. 007
 */
import java.util.Scanner;

class Room {
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

class BedRoom extends Room {
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

class RoomMain {
	public static void main(String[] args) {
		int length, height, width;

		Scanner sc = new Scanner(System.in);

		System.out.printf("\nEnter Length: ");
		length = sc.nextInt();
		System.out.printf("\nEnter Breadth: ");
		width = sc.nextInt();
		System.out.printf("\nEnter Height: ");
		height = sc.nextInt();

		Room room = new Room(length, width);
		BedRoom bedRoom = new BedRoom(length, width, height);

		System.out.printf("\nThe area of the room is " + room.getArea());
		System.out.printf("\nThe volume of the room is " + bedRoom.getVolume());
	}
}
