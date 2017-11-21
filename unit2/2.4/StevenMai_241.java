public class StevenMai_241 {
	public static void main(String[] args){
		String a = "Hello" ;
		String b = "Hello" ;
		String c = "Hell" + "o" ;
		String d = new String( "Hello" ) ;
		System.out.println( "" + ( a == b ) ) ;
		System.out.println( "" + ( a == c ) ) ;
		System.out.println( "" + ( b == d ) ) ;
		System.out.println( "" + ( c == d ) ) ;
	}
}

/* The output from this program is

true
true
false
false

The first is true because a and b are referencing the same memory location 
because they were constructed with the same string.
The second is true because they were constructed with the same string as well.

However, d is a new string so it is not equal to both b and c.
*/
