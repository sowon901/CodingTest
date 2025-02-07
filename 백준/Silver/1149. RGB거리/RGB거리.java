import java.util.*;
import java.io.*;

public class Main {
	
	public static int Red= 0;
	public static int Green= 1;
	public static int Blue= 2;

	public static void main(String[] args) throws IOException{
		Scanner sc = new Scanner(System.in);
		
		int home = sc.nextInt();
		
		int cost[][] = new int[home][3];		
		
		for(int i=0; i<home; i++) {
			for(int j=0; j<3; j++) {
				cost[i][j] = sc.nextInt();
			}
		}
		
		int arr[][] = new int[home][3];		
		arr[0][0] = cost[0][0];
		arr[0][1] = cost[0][1];
		arr[0][2] = cost[0][2];
		
		for(int i=1; i<home; i++) {
			
			arr[i][0] = Math.min(arr[i-1][1], arr[i-1][2]) + cost[i][0];
			arr[i][1] = Math.min(arr[i-1][0], arr[i-1][2]) + cost[i][1];
			arr[i][2] = Math.min(arr[i-1][0], arr[i-1][1]) + cost[i][2];
		}
		
		int min;
		min= Math.min(arr[home-1][0], arr[home-1][1]);
		min= Math.min(min, arr[home-1][2]);
		
		
		
		
		System.out.println(min);
	}
	
}
