import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;

public class TestString {

	public static void main(String[] args) throws IOException {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String email = br.readLine();

		System.out.println("Email entered is: " + email);

//		if (!(email.contains("@") && email.contains("."))) {
//			System.out.println("Please enter a valid email address");
//		} else
		if (email.indexOf("@") != email.lastIndexOf("@") || email.indexOf(".") != email.lastIndexOf(".")) {
			System.out.println("Please enter a valid email address");
		} else if ((email.indexOf(".") - email.indexOf("@") - 1) < 3) {
			System.out.println("Please enter a valid email address");
		} else if (email.indexOf("@") < 4 || (email.length() - email.indexOf(".") - 1) < 2) {
			System.out.println("Please enter a valid email address");
		} else {
			System.out.println("Valid email address. Hooray!");
		}


	}
}