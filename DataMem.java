
public class DataMem {
	String name;                    //non static data member, used for having different value for different objcts
	int id;
	static String c="MindFire";    //Static mem used when all objects should have same value of a member like company name for emplyee of that company
	void setValue(int one, String two)              
	{
		id=one;
		name=two;
	}
	
	void printVal()
	{
		System.out.println(id);
		System.out.println(name);
		System.out.println(c);
	}
	
	public static void main(String args[])
	{
		System.out.println(c);            //static member can be accessed even before making object as they are given memory at compile time
										 //static members can also be accessed via class name and via object name
		DataMem d1= new DataMem();
		d1.setValue(1, "shweta");
		d1.printVal();
		
		DataMem d2= new DataMem();
		d2.setValue(2, "abc");
		d2.printVal();
	}
	
}
