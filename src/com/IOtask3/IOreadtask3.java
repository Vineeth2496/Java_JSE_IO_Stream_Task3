package com.IOtask3;

import java.io.FileInputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeMap;
import java.util.Vector;


public class IOreadtask3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
			FileInputStream fi=new FileInputStream("IOtask2.ser");
			ObjectInputStream oi=new ObjectInputStream(fi);
			
			TreeMap ts=(TreeMap)oi.readObject();
			
			Set s=ts.entrySet();
			Iterator i=s.iterator();
			for(;i.hasNext();)
			{
				System.out.println(i.next());
			}
			
			
		}
		catch (Exception v) {
			// TODO: handle exception
			v.printStackTrace();
		}
	}

}
