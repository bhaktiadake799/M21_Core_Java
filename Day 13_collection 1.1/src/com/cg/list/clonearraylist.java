package com.cg.list;
import java.util.ArrayList;
public class clonearraylist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList obj =new ArrayList();
		obj.add("Bhakti");
		obj.add(98);
		obj.add(78.9);
		System.out.println(obj);
		Object cloneList;
		cloneList = obj.clone();
		System.out.println(cloneList);

	}

}
