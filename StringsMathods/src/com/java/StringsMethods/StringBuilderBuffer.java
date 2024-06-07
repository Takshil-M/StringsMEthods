package com.java.StringsMethods;

public class StringBuilderBuffer {

	public static void main(String[] args) {
		
		long StartTime= System.currentTimeMillis();
		
		StringBuffer sbf=new StringBuffer("Hello");
		for(int i=0; i<100000; i++) {
			sbf.append("Takshil");
		}
		System.out.println("Time taken By StringBuffer :" + (System.currentTimeMillis()-StartTime));
	
	
	long StartTime1= System.currentTimeMillis();
	
	StringBuilder sbd=new StringBuilder("Hello");
	
	for(int i=0; i<100000; i++) {
		sbd.append("Takshil");
	}
	System.out.println("Time taken By StringBuilder :" + (System.currentTimeMillis()-StartTime1));
	
}

}
