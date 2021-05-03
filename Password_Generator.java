import java.util.Scanner;
public class Password_Generator {
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("How many passwords would you like to create?");
		int total = in.nextInt();
		System.out.print("How long do you want your passwords to be? ");
		int length = in.nextInt();
		String[] randomPasswords = new String[total];
		for(int i = 0; i < total; i++) {
		String randomPassword= "";
		for(int j = 0; j < length; j++) {
			randomPassword += randomCharacter();	
		}
		randomPasswords[i]=randomPassword;
		}
		printArray(randomPasswords);
		}
	public static void printArray(String[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.println(arr[i]);
		}
	}
	public static char randomCharacter() {
		int pass = (int)(Math.random()*62);
		if(pass <= 9) {
			int number = pass + 48;
			return (char)(number);
		} else if(pass <= 35) {
			int uppercase = pass + 55;
			return (char)(uppercase);
		} else {

			int lowercase = pass + 61;
			return (char)(lowercase);
		}
	}

}
	

