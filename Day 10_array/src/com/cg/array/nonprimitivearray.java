package com.cg.array;
class employe
{
	public int EmpId;
	public String Name;
	employe(int id, String name) {
		EmpId=id;
		Name=name;
	}
}
public class nonprimitivearray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		declear array of class type
		employe arr[]= new employe[3];
		arr[0]=new employe(12,"ross");
		arr[1]=new employe(162,"chandler");
		arr[2]=new employe(120,"joe");
		
		for (int i=0;i<arr.length;i++)
		{
			System.out.println("elemment at "+i+"th"+"index is"+arr[i].EmpId+" ");
		}
		

	}

}
