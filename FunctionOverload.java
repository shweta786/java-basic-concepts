
public class FunctionOverload {

	//this can be done in two ways- either by changing the number of arguments or by changing the type of argument
	// Return type, access specifier or modifier have no role in this.
	
	static int func1(int a, int b, int c)
	{
		return a+b+c;
		
	}
	
	static int func1(int a,int b)
	{
		return a+b;
	}
	
	static void func1(float  f1, float f2)
	{
		System.out.println("Float function");
	}
	public static void main(String args[])
	{
		System.out.println(func1(2,3,4));
		func1(2.0f,3.5f);
		
	}
	
}
