package week3.day1;

public class learnreversestring {

	public static void main(String[] args) {
		
		String Value = "Vivian Vincent";
		
		char[] charArray = Value.toCharArray();
		for (int i = charArray.length-1; i >=0 ; i--) {
			System.out.print(charArray[i]);
			
		}

	}

}
