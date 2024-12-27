import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		if(n < 0) {
			System.out.println("Error");
		}
		
		else if(n == 0) {
			System.out.println(1);
		}
		
		else {
			int i = n;
			int fact = 1;
			while(n / i != n) {
				fact = fact * i;
				i--;
			}
			
			System.out.println(fact);
		}
		
	}
}