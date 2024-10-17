import java.util.*;

public class Main {
	public static int zero;
	public static int one;
	
	public static int[] zeroFibonacci = new int[41];
	public static int[] oneFibonacci = new int[41];
	
	public static void fibonacci() {
		
		zeroFibonacci[0] = 1;
		zeroFibonacci[1] = 0;
		oneFibonacci[0] = 0;
		oneFibonacci[1] = 1;
		
		for(int i=2; i<41; i++) {
			zeroFibonacci[i] = zeroFibonacci[i-1] + zeroFibonacci[i-2];
			oneFibonacci[i] = oneFibonacci[i-1] + oneFibonacci[i-2];
		}
	}
	
	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		
		int count = scanner.nextInt();
		fibonacci();

		for(int i=0; i<count; i++) {
			int number = scanner.nextInt();
			System.out.println(zeroFibonacci[number] + " " + oneFibonacci[number]);
		}
		
	}
}
