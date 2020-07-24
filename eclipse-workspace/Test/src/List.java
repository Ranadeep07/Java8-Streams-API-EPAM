
import java.util.ArrayList;
import java.util.*;
import java.util.Scanner;

public class List {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<Integer> list =new ArrayList<>();
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of List: ");
		int n = sc.nextInt();
		for(int i=0;i<n;i++) {
			int ele = sc.nextInt();
			list.add(ele);
		}
		System.out.println("Average of List is "+average(list));
		sc.close();
	}
	static int average(ArrayList<Integer> al) {
		int sum = 0, avg = 0;
		for (int i = 0;i<al.size();i++) {
			sum += al.get(i);
		}
		avg = sum/al.size();
		return avg;
		
	}
}

