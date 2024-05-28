package com.basicProgram;
class Count{
	static int count = 0;
	Count(){
		count++;
		System.out.println(count);
		
	}

}



public class Static_key {
	public static void main(String[] args) {
	new Count();
	new Count();
	new Count();
	}
}
