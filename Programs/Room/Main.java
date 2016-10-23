import java.util.Scanner;

public class Main {
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
			BedRoom bedRoom = new BedRoom(length, width,height);

			System.out.printf("\nThe area of the room is " + room.getArea());
			System.out.printf("\nThe volume of the room is " + bedRoom.getVolume());
	}
}
