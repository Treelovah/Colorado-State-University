package FinalExam;
public class FinalSwitch {
    public static void main(String[] args) {
		int i1 = 10, i2 = 5;
		char c0 = '*', c1 = 'd', c2 = 'z', c3 = '8';
		boolean b0 = ((int)i2>=(int)i1);
		if(b0)
			c3 = '4';
		else
			c3 = '6';
		i1--;
		switch(c3) {
			case '4': c0 = '%'; c1 = 'n'; i1 = i1/2; break;
			case '6': c0 = '$'; c1 = 'm'; i2 = i2/2; break;
			case '8': c0 = '#'; c1 = 'q'; break;
		}
		
		System.out.println(b0);//Line 1
		System.out.println(c0);//Line 2
		System.out.println(c2);//Line 3
		System.out.println(i2);//Line 4
		System.out.println(i1);//Line 5
	}
}