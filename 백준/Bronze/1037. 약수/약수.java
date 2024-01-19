import java.util.*;

public class Main {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		HashSet<Integer> hash = new HashSet<>();
		int count = scanner.nextInt();
		int div = 0;
		
		
		for(int i=0; i<count; i++) {
			div = scanner.nextInt();
			hash.add(div);
		}
		
		List<Integer> set = new ArrayList<>(hash);
		Collections.sort(set);
		
		if(count==1)
			System.out.print((int)Math.pow(div, 2));
		else {
			System.out.print(set.get(0)*set.get(count-1));
		}
		
		scanner.close();
	}
}
