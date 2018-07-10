package JavaProgramms;

public class StringReverse {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = " FaceBook LogIn and SignUp";

		// convert String to character array using toCharArray

		char[] try1 = input.toCharArray();

		for (int i = try1.length - 1; i >= 0; i--)
			System.out.print(try1[i]);

	}

}
