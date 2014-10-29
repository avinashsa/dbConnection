package accountsprojmini;
import java.util.ArrayList;

public class RunAccounts {
	
	public static void main (String[] args) {

		ArrayList<Item>  accountItems = new ArrayList<Item>();

		CommonUtil  accUtil = new CommonUtil();

		while(1 == 1)
		{
			/*			System.out.println(" You Entered :" + nextItem ); */

			System.out.println("Please select what you want to do");
			System.out.println("1. Enter Item");
			System.out.println("2. Delete Item");
			System.out.println("3. View Current List");
			System.out.println("4. Exit");

			String choice = accUtil.getUserInput("Please enter you next item");

			switch (choice) {
				case "1": System.out.println("you chose enter");
				break;
				case "2": System.out.println("you chose delte");
				break;
				case "3": System.out.println("you chose print list");
				break;
				case "4": System.out.println("you chose exit");
					System.exit(0);
				break;
				default: System.out.println("Invalid Chocie");
				break;
			}

		}

	}
}
