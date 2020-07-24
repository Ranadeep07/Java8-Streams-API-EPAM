import java.util.Scanner;

public class String_starts_With_a {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		int n=sc.nextInt();
		String a[] = new String[n];
		for(int i = 0;i<n;i++)
		{
			a[i] = sc.next();
			
		}
		for (int i = 0; i < a.length; i++) {
			if(a[i].charAt(0)=='a' && a[i].length()==3)
			{
				System.out.println(a[i]);
			}
			else {
				continue;
			}
		}
		
}
}
