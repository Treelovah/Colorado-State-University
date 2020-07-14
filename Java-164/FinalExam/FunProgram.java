package FinalExam;
public class FunProgram {
    public static void main(String [] args) {
		//Line 1
		for(int i = 0; i <= 4; i++)
			System.out.print(i);
		System.out.println();
		
		//Line 2
		for(int j = 10; j >= 0; j = j-2)
			System.out.print(j);
		System.out.println();
		
		//Line 3
		int s = 1;
		int number = 4;
		while(number > 0) {
			s = s*number;
			number = number - 1;
		}
		System.out.println(s);
		
		//Line 4
		int check = 0;
		do {
			System.out.print(check);
			check++;
		}while(check<=2);
		System.out.println();
		
		//Line 5
		int pass = -1;
		while(pass >= 0)
			pass = pass+1;
		System.out.println(pass);
	}
}