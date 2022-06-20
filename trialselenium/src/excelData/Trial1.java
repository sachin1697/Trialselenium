package excelData;

import java.io.IOException;

public class Trial1 {
	static String email;
	static String pass;
	public static String [][] getData() throws IOException {
		  
		  int a=1;
		  int b=2;
		  int c=2;
		  while(c<4) {
			  email=DataAquire.m1(c, a);
			  pass=DataAquire.m1(c,b);
		  }
		
		  String [][]data= {{email, pass}};
		  
		
		  
		  return data;
	  }
	public static void main(String[]args) throws IOException {
	System.out.println(getData());
	}
}
