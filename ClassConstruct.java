
public class ClassConstruct {
	
	int a;                        //data member of class(they can be initialized here also in java)
	String b;
	void setValue(int one, String two)              // member function of class
	{
		a=one;
		b=two;
	}
	
	void printVal()
	{
		System.out.println(a);
		System.out.println(b);
		
	}
	
	public static void main(String args[])
	{
		ClassConstruct c=new ClassConstruct();        //making object of class
		c.setValue(2, "you");							//accessing member function of class
		c.printVal();
		
	}
	
}
