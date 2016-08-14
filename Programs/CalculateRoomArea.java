/**
 * @brief Write a Java program to get area of a room using a class.
 * @note Practical No. 001
 * @author  ArchKudo
 */
class CalculateRoomArea {
	public static void main(String[] args) {
		Room aSpaciousRoom = new Room(120.0, 200.0);
		Room aCompactRoom = new Room(10.0, 10.0);
		double areaOfSpaciousRoom = aSpaciousRoom.getArea();
		double areaOfCompactRoom = aCompactRoom.getArea();
		System.out.println("The area of the Spacious Room is: " + areaOfSpaciousRoom);
		System.out.println("The area of the Compact Room is: " + areaOfCompactRoom);
	}
}

class Room {
	double lengthOfRoom, breadthOfRoom; /* Variable Declaration 1 */
	double areaOfRoom;
	/**
	 * A constructor for class Room.
	 * @param  lengthOfRoom  Stores the value to lengthOfRoom declared at Variable Declaration 1.
	 * @param  breadthOfRoom Stores the value to bredthOfRoom declared at Variable Declaration 1.
	 * @return               A new object of type Room.
	 */
	public Room(double lengthOfRoom, double breadthOfRoom) {
		this.lengthOfRoom = lengthOfRoom;
		this.breadthOfRoom = breadthOfRoom;
	}


	/**
	 * Get the area of the room.
	 * @return Area of the room
	 */
	public double getArea() {
		/* Calculate area of the room here instead of in main() */
		areaOfRoom = lengthOfRoom * breadthOfRoom;
		return areaOfRoom;
	}
}
