/*Problem statement
Take the length(L) and breadth(B) of the rectangle as input and find its area.
Constraints:
1 <= L, B <= 10power2*/



import java.util.Scanner;

public class Solution {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        int length = scanner.nextInt();
        
        int breadth = scanner.nextInt();

        // Validate constraints
        if (length >= 1 && length <= 100 && breadth >= 1 && breadth <= 100) {
            
            int area = length * breadth;

            
            System.out.println( area);
        }
		else{
			int area = length * breadth;
			System.out.println( area);
		}
        scanner.close();
    }
}
