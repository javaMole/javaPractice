import java.util.ArrayList;

class Test
{
	public static void main(String[] args)
	{
		ArrayList o1=new ArrayList();
		o1.add("raj");
		o1.add(55);

		
		
		/*
		problem 1
		In arraylist I can add all object 
		we can store different objects in arraylist 

		but in some case I want to strictly store a particular object  then it is not possible 


		*/

		/*
			Problem 2
			example during retrieving  an Object in collection 
			It will give type casting problems 
				
				String s1=o1.get(0); // it will lead to CE

				Here the get method will give you an Object type object it is mandatory for us to downcast that object
			
				String s1=(String)o1.get(0); if we use this approach  let suppose a Object is present in the collection which is not String type we will get class get 
				ClassCastException  for 
				String s1=(String)o1.get(1);  // incompatible types integer cannot be converted to String
	
		
					

		*/

		/*
			Solution:
				due to the above following problems generics were introduced to solve 
					Type safety

					Type casting Problems


		*/



	}
}