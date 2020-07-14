package FinalExam;
public class FirstProgram
{
	public static void main(String[] args) {
		String s3 = "0123456789";
		String s2 = "!@#$%&";
		String s1 = "Java Programming Rocks!";
		int iSum = s1.indexOf('P') + s3.indexOf('5');
		int size = s3.length() - s2.length() + 4;
		String sSubstr = s1.substring(2,4) + s3.substring(0,5);

		System.out.println(s3.length() - s2.length() + 4);
		System.out.println(s3.charAt(7));
		System.out.println(iSum);
		System.out.println(sSubstr);
		System.out.println(s2.substring(3));
	}
}