
public class MemFunc {
    int a=5;
    static int b=10;
    void func1()
    {
    	System.out.println(a);
    	System.out.println(b);
    	
    }
    
    static void func2()
    {
    	System.out.println(b);
    	MemFunc obj=new MemFunc();
    	System.out.println(obj.a);     //static function can use non static member only after making objcet for that member and reference id is to be associated.
    	
    }
    
    public static void main(String args[])
    {
    	MemFunc.func2();
    	new MemFunc().func1();
    }
	
}
