/**
 * @brief Write a Java program to demonstrate various StringBuffer methods.
 * @note Practical No. 006
 */
public class StringManipulation {
	public static void main(String[] args) {
		StringBuffer buf = new StringBuffer("Object Language");
		System.out.println("Original String: " + buf);
		System.out.println("Length of String: " + buf.length());
		for (int i = 0; i < buf.length(); i++) {
			System.out.println("Character at position " +
			                   Integer.toString(i + 1)
			                   + " is "
			                   + buf.charAt(i));
		}

		String bufToString = new String(buf.toString());
		int pos = bufToString.indexOf("Language");
		buf.insert(pos, "Oriented ");
		System.out.println("Modified string is: " + buf);
		buf.setCharAt(6, '-');
		System.out.println("Modified String is: " + buf);
		buf.append(" Providing Improved Security.");
		System.out.println("Modified String is: " + buf);
	}
}
