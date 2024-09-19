class Test2
{
	public static void main(String[] args)
	{
		I1 ob=A.m2()::abc;
		ob.m1();
		


	}
}


class A
{
	void  abc()
	{
		System.out.println("This is I1 class method");
	}
	static A m2(){
		return new A();
	}
}

interface I1
{
	void m1();
}
