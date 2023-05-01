package com.IOtask3;

import java.io.ByteArrayOutputStream;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ListIterator;
import java.util.TreeMap;
import java.util.Vector;

public class IOStoretask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
		EvenOdd eo=new EvenOdd();
		// eo.Even1();
		table t=new table();
		// t.table1();
		Leapyear l=new Leapyear();
		// l.Leap();
		// Adding all object in CFW
		
		TreeMap ts=new TreeMap();
		ts.put(1, eo);
		ts.put(2, t);
		ts.put(3, l);

		
		FileOutputStream fo=new FileOutputStream("IOtask2.ser");
		ObjectOutputStream oo=new ObjectOutputStream(fo);
		oo.writeObject(ts);		
		
		}
		catch(Exception e1) 
		{
			// TODO: handle exception
		    e1.printStackTrace();
		}
	

	}

}
