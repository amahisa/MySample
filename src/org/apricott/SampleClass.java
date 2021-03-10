package org.apricott;

public class SampleClass {
	public int method(int index){
		long l;
		switch(index){
		case 1:
			return 1;
		}
		
		return 0;
	}
	public int method2( String str ) {
		int count = 0;
		if ( str != null ) {
			count++;
		}
		
		count += str.length();
		
		return count;
	}
	public void call_method3( ) {
		String str = null;
		
		
		int ret = method2( str );
	}
}
