package com.IOtask3;

import java.io.Serializable;

public class Leapyear implements Serializable{
	public void Leap() {
		System.out.println("Leap years from 1947 to 2022");
		for(Integer year=1947; year<=2022; year++)
		{
			if(((year%4==0)&&(year%100!=0))||(year%400==0))
			{
				System.out.print(year+", ");
			}
			else
			{
				System.out.print("");
			}
		}
	}

}
