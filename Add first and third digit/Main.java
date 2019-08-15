import java.util.Scanner;
class Main{
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int first_digit = num/100;
        int Third_digit = num%10;
        int sum = first_digit + Third_digit;
      System.out.println(sum);
	}
}