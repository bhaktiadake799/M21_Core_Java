package statickeyword;

public class staticblock {
    static int num;
	static String str;
//	static block: if u want to intitialize the value without using constructor and obj.creation.
	static {
		num=12;
		str= "abc";
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(num);
		System.out.println(str);

	}

}
