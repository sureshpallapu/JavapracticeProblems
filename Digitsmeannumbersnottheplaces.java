import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		int evenSum = 0;
		int oddSum = 0;
		
		while(n > 0) {
			int last = n % 10;
			if(last % 2 == 0) {
				evenSum += last;
			}
			else {
				oddSum += last;
			}
			
			n = n / 10;
		}
		
		System.out.println(evenSum + " " + oddSum);
		
	}
}
		
	