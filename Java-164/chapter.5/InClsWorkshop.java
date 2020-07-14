import java.util.Scanner;

public class InClsWorkshop {
// get inputs from user.
    public static void getInput() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Please enter a weight:");
        int weight  = scnr.nextInt();
        System.out.println("Please enter a planet:");
        System.out.printf("\t%s\n \t%s\n \t%s\n \t%s\n","Voltar","Krypton","Fertos","Servontos");
        String planet = scnr.next();
        scnr.close();
        doStuff(weight, planet);
    }
    public static void doStuff(int a, String b) {
        switch (b) {
            case "Voltar":
                System.out.printf("Your weight on planet %s is: %.2f\n",b, (a * .091));
                break;
            case "Krypton":
                System.out.printf("Your weight on planet %s is: %.2f\n",b, (a * .720));
                break;
            case "Fertos":
                System.out.printf("Your weight on planet %s is: %.2f\n",b, (a * .865));
                break;
            case "Servontos":
                System.out.printf("Your weight on planet %s is: %.2f\n",b, (a * 4.612));
                break;
            default:
                System.out.printf("Please enter valid planet!\n");
        }   
    }
    public static void main(String[] args) {
        getInput();
    }
}