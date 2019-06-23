package seleniumPackage;

public class ThrowsException {

	public static void main(String[] args) throws Exception{
	
		int c=2/0;
		System.out.println("after exception");
	}
}
// when we use "throws Exception" it will not print the line after the error