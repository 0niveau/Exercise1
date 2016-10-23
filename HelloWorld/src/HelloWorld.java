import java.util.Scanner;
/**
 * @author Mohsen
 *
 */
public class HelloWorld {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Hello ASE2016 - how are you? :)");

		Scanner scanner = new Scanner(System.in);
		System.out.println("Please enter your name: ");
		
		HelloUser user = new HelloUser(scanner.next());
		System.out.println("Hello " + user.getName() + "!");
	}

}
