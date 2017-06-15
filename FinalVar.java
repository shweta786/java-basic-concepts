/*The final keyword can be applied with the variables, a final variable that have no value,
 it is called blank final variable or uninitialized final variable.
 It can be initialized in the constructor only. 
 The blank final variable can be static also which will be initialized in the static block only.
 */

//Final method can't be overridden
//final class can't be inherited
public class FinalVar {
	 
		 final int speedlimit=90;//final variable  
		 void run(){  
			 System.out.println(speedlimit);
		  //speedlimit=400;  this can't be done
		 }  
		 public static void main(String args[]){  
		 FinalVar obj=new  FinalVar();  
		 obj.run();  
		 }  
		
	
}
