package test;
import java.util.*;
public class Test {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		//added a scanner method to easily test the code on different string iterations more easily
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter your String elements:(Type X to quit)");
		String scanned =scan.nextLine();
		//as mentioned in the given the strings are to be stored in a list
		List<String> list = new ArrayList<>();
		while(!scanned.equals("X")) {
			list.add(scanned);
			scanned= scan.nextLine();
		}
		scan.close();
		// complexity of this code is O(n) where n is the number of Strings inserted into the List
		System.out.println("The outputed list: ");
		for(int i =0 ; i< list.size(); i++) {
			list.set(i, list.get(i).replaceAll("&", "and"));
			System.out.println(list.get(i));
		}
		
		

	}

}
