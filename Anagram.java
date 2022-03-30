import java.util.Arrays;

public class Anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str = "Silent";
		String str1= "Listen";
		
		boolean result;
		str= str.toLowerCase();
		str1=str1.toLowerCase();
		char[] ch = str.toCharArray();
		char[] ch1 = str1.toCharArray();
	if(str.length()==str1.length()) {
		Arrays.sort(ch);
		Arrays.sort(ch1);
		result = Arrays.equals(ch, ch1);
		if(result) {
			System.out.println("This is Anagram");
		}else 
			
			System.out.println("This is not anagram");
	
	}else 
		System.out.println("This is not Anagram");

	}

}
