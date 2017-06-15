
public class ThisK {
      int a;
      int b;
      void setValue(int a, int b)
      {
    	  this.a=a;               //this refers to the reference id of currently used object
    	  this.b=b;
      }
	  public static void main()
	  {
		  ThisK obj1= new ThisK();
		  obj1.setValue(5,10);
		  System.out.println(obj1.a);   //* 'this' can't be used in static method
		  System.out.println(obj1.b);
	  }
	
}
