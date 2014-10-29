package accountsprojmini;
import java.util.Calendar; 
import java.util.Date;

public class Item {
	
		private Calendar inputDate;
		private float Amount;

		/*public Item( Calendar indate, float inamt ) {
			inputDate = indate;
			 Amount = inamt;  
		}*/

		

		public void addItemFromStdin() {
			
			CommonUtil  accUtil = new CommonUtil();

			String inp = accUtil.getUserInput("Please enter Day (date) of transaction as <dd>");
			int userDate = (Integer.valueOf(inp)).intValue();
			inp = accUtil.getUserInput("Please enter Month of transaction as <mm>");
			int userMonth = (Integer.valueOf(inp)).intValue();
			inp = accUtil.getUserInput("Please enter year of transaction as <yyyy>");
			int userYear = (Integer.valueOf(inp)).intValue();

			inputDate = Calendar.getInstance();
			inputDate.set(userYear,userMonth-1,userDate);

			inp = accUtil.getUserInput("Please enter amount of the transaction");
			Amount = (Float.valueOf(inp)).floatValue();

		}

		public float getAmount () { return Amount;}

		public Date getTransDate() {
			return inputDate.getTime();

		}
}
