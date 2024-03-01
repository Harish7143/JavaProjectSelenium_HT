package practiceJava;

public class OverridingChildClass extends MethodOverriding
{
	public void method1()
	{
		System.out.println("testing overiding");
	}

	public static void main(String[] args)
	{
		OverridingChildClass oc= new OverridingChildClass ();
		oc.method1();
	 }
	

}
