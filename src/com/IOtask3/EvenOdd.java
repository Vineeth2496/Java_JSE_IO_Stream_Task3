package com.IOtask3;

import java.io.Serializable;

public class EvenOdd implements Serializable {
	public void Even1() {
		for(Integer no=1; no<=100; no++)
		{
			if(no%2==0)
			{
				System.out.print(no+",");
			}
			else
			{
				System.out.print(" ");
			}
		}
		
	}

}
