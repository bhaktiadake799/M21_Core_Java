package com.cg.generics;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
public class Genericexample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer,String>Obj = new HashMap<Integer,String>();
		Obj.put(1,"Pratik");
		Obj.put(2,"Ajinkya");
		System.out.println(Obj);
		
		Set<Map.Entry<Integer,String>>itr=Obj.entrySet();
		Iterator<Map.Entry<Integer,String>>itr1=itr.iterator();
		
		while(itr1.hasNext())
		{
//			 type -casting is not required
			Map.Entry e = itr1.next();
			System.out.println(e.getKey()+" "+e.getValue());
		}

	}

}
