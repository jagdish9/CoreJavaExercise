package com.java.basic;

public class InhertMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Inhert01 i1  = new Inhert01();
		i1.disp02();
		i1.disp03();
		System.out.println();
		
		Inhert02 i2  = new Inhert02();
		i2.disp02();
		i2.disp03();
		System.out.println();
		
		Inhert01 i3  = new Inhert02();
		i2.disp02();
		i2.disp03();
		System.out.println(i3.x);
		System.out.println();
		
		Inhert03 i4  = new Inhert04();
		i4.disp01();
		i4.disp02();
		i4.disp03();
		System.out.println();
		
		Inhert02 i5  = new Inhert04();
		i5.disp02();
		i5.disp03();
		System.out.println();
		
		Inhert01 i6  = new Inhert04();
		i6.disp02();
		i6.disp03();
		i6.msg01();
		
		
	}

}
