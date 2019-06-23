package seleniumPackage;

public class TryCatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			int c=2/0;
		}
		catch (Exception e) {
			e.printStackTrace();
			
		}
		System.out.println("after exception");
	}

}
// When we use "try catch " it will print line after the issue