package com.cg.lambda;
interface E
{
	String show(String s, String t);
}
public class twoparameter {

	public static void main(String[] args) {
//		lambda Expression
		E obj =(String s, String t)->
		{
			return s+t;
		};
		System.out.println(obj.show("bhakti"," "+"Adake"));

	}

}
