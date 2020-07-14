package FinalExam;
public class FinalRecursion {
    public static void main(String[] args) {
		munge("0"); //The number Zero
	}
	
	public static String munge(String s) {
		if(s.length() >= 10) //base case
			return s;
		else {
			if(s.length() > 1) {
				System.out.println(s);
			}
			char c = s.charAt(s.length()-1);
			c++;
			return munge(c + s + c);
		}
	}
}