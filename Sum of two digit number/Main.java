import java.util.*;
class Main {
	public static void main (String[] args) {
		Scanner in = new Scanner(System.in);
        int num = in.nextInt();
        int fir = num/10;
        int last = num%10;
        int add = fir + last;
      System.out.println(add);
	}
}