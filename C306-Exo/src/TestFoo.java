import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

public class TestFoo {
	 @Test
	    public void testMin() {
	        assertEquals(4,Foo.min(4,5));
	    }   
	  
	   @Test
	    public void testMin2() {
	        assertEquals(2,Foo.min(4,5)); 
	    }
	   
////    public class Foo {	
//    	public static int min(int a,int b){
//            if ( a < b ) 
//              return a;
//            return b;
////        } 
//    }
}

