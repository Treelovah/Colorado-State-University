public class RecursionQuiz
{

    public static void func5(int n) {
        if (n == 0 || n == 1)
        return;
        func5(n - 1);
        System.out.print(n + " ");
        func5(n - 2);
    }

    public static long func2(int n) {
        if (n == 0) return 0;
        if (n == 1) return 1;
        return func2(n-1) + func2(n-2);
    }

    
    public static void main(String[] args) {
        System.out.println("Begining Tests");
        System.out.print("Test 1: ");
        func5(5);
        System.out.println();
        System.out.print("Test 2: ");
        System.out.println(func2(3));
        System.out.println();
        System.out.print("Test 3: ");
    }
}
