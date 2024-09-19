class Test2
{

	public static void main(String[] args)
	{
		// first Interface 
		I1 o1=()->{System.out.println("This is I1 interface m1 method");};
		o1.m1();

		I2 o2=(int p)->{System.out.println("This is I2 interface m1 method"+p);};
		o2.m1(22);

		I3 o3=(int p,int q)->{System.out.println("This is i3 interface m1 method"+p+q);};
		o3.m1(233,44);

		I4 o4=()->{System.out.println("This is I4 interface with m1 method");return 10; };

		System.out.println(o4.m1());

		//if lambda expression constains only one statement we can remove the body
		I1 o7=()->System.out.println("Hello world");
		o7.m1();
	}
}

@FunctionalInterface
interface I1
{
	void m1();

}

@FunctionalInterface
interface I2
{
	void m1(int p);

}

@FunctionalInterface
interface I3
{
	void m1(int p,int q);

}

@FunctionalInterface
interface I4
{
	int m1(); 
}
