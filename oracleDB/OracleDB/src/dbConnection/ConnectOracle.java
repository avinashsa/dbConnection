/**
 * 
 */
package dbConnection;

/**
 * @author xavisar
 *
 */
public class ConnectOracle {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Here we try to connect to java");
		
		DBHandle aviDBHandle = new DBHandle();
		
		aviDBHandle.connect("","",""); 
		aviDBHandle.disConnect();
		aviDBHandle.runSql("Select * from avidb.handsetbatch");
	}

}
