package practiceJava;

public class MethodOverloading 
{
	public void Method1(int a, String b)
	{
		System.out.println("method with int, char");
	}
	public void Method1(char c)
	{
		System.out.println("method with char");
	}
	static void Method1(String a)
	{
		System.out.println("Static method");
	}
    public static void main(String[] args) 
	{
    	MethodOverloading .Method1("Shiv");
    	MethodOverloading mo= new MethodOverloading ();
    	mo.Method1(10,"Harish");
    	mo.Method1('H');
    	Method1("Hari");
    }



}
