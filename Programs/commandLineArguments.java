/**
 * @brief Write a Java program to print commandline arguments.
 * @note Practical No. 001 
 * @author ArchKudo
 */
class commandLineArguments {
	public static void main(String args[]) {
		int i = 0;
		int countOfArguments = args.length;
		System.out.println("Number of Arguments = " + countOfArguments);
		while (i < countOfArguments) {
			i++; /* For the list to start from 1 rather than 0. */
			System.out.println(i + "." + " Java is " + args[i - 1] + ".");
		}	
	}
}