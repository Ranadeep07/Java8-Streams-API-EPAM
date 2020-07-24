import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the length of list:: ");
		int n=sc.nextInt();
		String a[] = new String[n];
		for(int i = 0;i<n;i++)
		{
			System.out.print("Enter the elements:: ");
			a[i] = sc.next();
			
		}
		StringBuilder sb =new StringBuilder();
		for (int i = 0; i < a.length; i++) {
			if(isPalindrome(a[i])==true)
			{
				System.out.println("Palindromes present in the List are:: "+a[i]);
			}
			else {
				continue;
			}
		}
		// Testing the isPalindrome() method
    /*if(isPalindrome("abc")==true)
		{
			System.out.println("Palindrome");
		}
		else {
			System.out.println("Not Palindrome");
		}
		*/
}
	static boolean isPalindrome(String str)
	{
		StringBuilder sb = new StringBuilder(str);
		String rev = sb.reverse().toString();
		if(rev.equals(str)) {
			return true;
		}
		else {
			return false;
		}
	}
}
