
public class numbers {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int a=5;
		int b=3;
		a=a+b;
		b=a-b;
		a=a-b;
		System.out.println("B is:"+ b);
		System.out.println("A is:"+ a);
		
		String str = "Book";
        String reverse = "";
        
        
        for(int i = str.length() - 1; i >= 0; i--)
        {
            reverse = reverse + str.charAt(i);
        }
        
        System.out.println("Reversed string is:");
        System.out.println(reverse);

	}

}



