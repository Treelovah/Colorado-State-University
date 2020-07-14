package FinalExam;
public class FinalExamStrings {
    public static void main(String[] args) {
		String s = "Java Programming!";
		
		//First line
		String sChars = Character.toString(s.charAt(1))+
				Character.toString(s.charAt(2)) + 
				Character.toString(s.charAt(s.length()-1));
		System.out.println(sChars);
		
		//Second line
		int iSum = s.indexOf('v') + s.indexOf('r');
		System.out.println(iSum);
		
		//Third line
		String sSubstr = s.substring(5,10) + s.substring(10,16);
		System.out.println(sSubstr);
		
		//Fourth line
		System.out.printf("%.1f\n", 6.0 + (15/12));
		
		//Fifth line
		System.out.println(6 + 12/4 - 2*5);
	}
}