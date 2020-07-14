package FinalExam;

public class Branching {
    public static void main(String[] args) {
        int i1 = 9, i2 = 4;
        char c0 = '%', c1 = 'c', c2 = 'y', c3 = '7';
        boolean b0 = (i2 >= i1);

        if (b0)
            c3 = '3';
        else
            c3 = '5';
        i1--;

        switch (c3)
        {
            case '3': c0 = '$'; c1='m'; i1 = i1/2; break;
            case '5': c0 = '#'; c1='q'; i2 = i2/2; break;
            case '7': c0 = '*'; c1='r'; break;
        }

        System.out.println(b0);
        System.out.println(c0);
        System.out.println(c2);
        System.out.println(i2);
        System.out.println(i1);
    }
}