package com.IOtask3;

import java.io.Serializable;

public class table implements Serializable {
	public void table1() {
		Integer a=9, b=1, c;
		while(b<=20)
		{
			c=a*b;
			System.out.println(a+" * "+b+" = "+c);
			b++;
		}
		
	}

}
