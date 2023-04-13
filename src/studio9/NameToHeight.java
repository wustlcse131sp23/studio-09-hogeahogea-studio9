package studio9;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import support.cse131.NotYetImplementedException;

public class NameToHeight {
	/**
	 * Construct and fill a map with your studio group members' names, each
	 * associated with his or her height.
	 * 
	 * Construct an ArgsProcessor and loop asking the args processor for a name to
	 * lookup the height. When the user cancels (that is: when args processor
	 * returns null), break from the loop. Otherwise, loop up the name in the map
	 * and output the results. Be sure to handle the case where the map does not
	 * contain a specified name.
	 */
	public static void main(String[] args) {
		
		Map<String, Integer> hm = new HashMap <String, Integer>();
		
		System.out.println("How many people in group?");
		Scanner in = new Scanner(System.in);
		int N = in.nextInt();
		for(int i=0; i<N; i++) {
			System.out.println("Name?");
			String name = in.next();
			System.out.println("Height (In Inches)");
			int height = in.nextInt();
			hm.put(name, height);
		}
		
		//for-each loop
		 for (Map.Entry<String, Integer> me : hm.entrySet()) {
 
            // Printing keys
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
		 }

	}
}
