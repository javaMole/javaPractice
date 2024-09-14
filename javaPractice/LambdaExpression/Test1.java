class Test1
{
	public static void main(String[] args)
	{
	I1 tv1=	()->{System.out.println("This is m1 method");};
		tv1.m1();

		System.out.println(tv1);
	}
}

@FunctionalInterface
interface I1
{
	
	void m1();

}