class Test1
{
	public static void main(String[] args)
	{
		// static method reference
		I1 ob1=A::m1;
		ob1.m1();
		
		// non static method reference
		A t1=new A();

		I1 ob2=t1::m2; // by using object reference variable
		ob2.m1();
		/*
		Here the return type is completely different 12 number line
		you even don't need to worry about modifiers also

		*/

		I2 ob3=A::new ;
		ob3.m4();

		I3 ob4=Student::new;
		ob4.m9();

		I4 ob5=Student::new;
		ob5.m10("raju");

	



	}


}

class Student
{

	Student(){
		System.out.println("This is no param constructor");

	}

	Student(String s)
	{
		System.out.println("This String constructor");
	}
}



class A
{

	A(){
		System.out.println("This is A constructor");
	}
	static void m1(){
		System.out.println("This m1 static method");
	}

	int m2()
	{
		System.out.println("This is m2 non static method");
		return 11; 
	}
}
interface I1
{
	void m1();
}

interface I2
{
	A m4();
}

interface I3
{
	void m9();
}

interface I4
{
	void m10(String s);
}