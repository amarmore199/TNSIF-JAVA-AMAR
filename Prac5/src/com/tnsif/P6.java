package com.tnsif;
public class P6 {

	
	int vardefault =10;
	public int varpublic =20;
	private int varprivate = 30;
	protected int varprotect =40;
	
	
	//declare default, protected, public and private method
	
	
	void methodDefault() {
		System.out.println("default method base class");
		System.out.println("public variblle: "+ vardefault);
	}
	
	public void methodpublic() {
		System.out.println("public method base class");
		System.out.println("public method: "+ varpublic);
		
	}
	
	private void methodprivate() {
		System.out.println("private method");
		System.out.println("private method: "+ varprivate);
	}
	
	protected void methodprotect() {
		System.out.println("protected method");
		System.out.println("protected method: "+ varprotect);
	}
	
	
	
	
	
	
	
	
	
//	public static void main(String[] args) {
//		// TODO Auto-generated method stub
//
//	}

}
