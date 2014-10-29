package accountsprojmini;
import java.util.ArrayList;
import java.util.Date;

public class RunAccounts {
	
	public static void main (String[] args) {

		ArrayList<Item>  accountItems = new ArrayList<Item>();

		CommonUtil  accUtil = new CommonUtil();

		while(1 == 1)
		{
			/*			System.out.println(" You Entered :" + nextItem ); */
			System.out.println();
			System.out.println("MAIN MENU");
			System.out.println("Please select what you want to do");
			System.out.println("1. Enter Item");
			System.out.println("2. Delete Item");
			System.out.println("3. View Current List");
			System.out.println("4. Exit");

			String choice = accUtil.getUserInput("Please enter you next item");

			switch (choice) {
				case "1": 
					Item newTransaction = new Item();
					accountItems.add(newTransaction);
					newTransaction.addItemFromStdin();
				break;


				case "2": System.out.println("Cant delete yet");
				break;


				case "3":  int listSize = 0;
							System.out.println("currently holding " + accountItems.size()+ " items");
						while (listSize  < accountItems.size())	{
							Item currItem = accountItems.get(listSize);
							System.out.println("******************************");
							System.out.println( "Trans Date   = " + Integer.toString(listSize + 1) + currItem.getTransDate());
							System.out.println( "Trans Amount = " + Integer.toString(listSize + 1) + currItem.getAmount());	
							System.out.println("******************************");
							listSize++;
						}

				System.out.println();
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
