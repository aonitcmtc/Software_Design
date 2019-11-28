
public class Main {
	public static void main(String[]args)
	{
		int a, b, c = 2 ;
		double gpa = 3.50 ;
		String firstName = "Patchara";
		
		System.out.println("Hello," + firstName + "," + gpa);
		System.out.println(c);
		
		for(int i = 0 ; i <= 10 ; i++)
			if( i % 2 == 0 )
				System.out.println(firstName + "," + i + "," + (i+1));
		
		int[] numbers = { 1, 1, 2, 3, 5};
		int[] even = new int [20];
		String[] fruits = {"banana" , "apple" , "melon"};
		

		for(int j = 0 ; j < fruits.length ; j++)
			System.out.println("Fruits : " + fruits[j] );
		
		//for-each loop
		System.out.println("--for-each loop--");
		for(String f : fruits)
			System.out.println(f);
		
		//String 
		System.out.println(firstName.charAt(0));
		
		String tel = "053-211-122";
		String[] sp = tel.split("-");
		System.out.println("("+sp[0]+")"+ sp[1]);
		
		
		
	}
}
