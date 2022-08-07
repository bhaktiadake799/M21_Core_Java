package annoclass;
abstract class Annoymus
{
	public abstract void method();
}
public class demo {

	public static void main(String[] args) {
		Annoymus a=new Annoymus()
		{
			public void Method()
			{
				System.out.println("This is an example of Annoymus Class");
						
			}
			
	     };
	 a.method();
	}

}
