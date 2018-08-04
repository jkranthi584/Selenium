
public class IsDigitorString {
	
	public static boolean isNumber(String s) {
		for (int i=0; i<s.length(); i++)
			
		 if(Character.isDigit(s.charAt(i)))
			 return true;
		
		return false;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String num="7945";
		if(isNumber(num)) 
			System.out.println("its an Integer");
		else
			System.out.println("its a string");
       
	}

}
