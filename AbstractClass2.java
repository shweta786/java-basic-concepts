
public class AbstractClass2 extends AbstractClass {

	void method()
	{
		System.out.println("Defining abstract method");
		
	}
	public static void main(String args[]){  
		 AbstractClass obj = new AbstractClass2();     //upcasting(reference variable of a class having ref. id of child)
		 obj.method();  
		}  
	
}
