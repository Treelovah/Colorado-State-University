package ThirdExamJava;

public class Polymorph {
    public static class CA {
        public void printHello() {
            System.out.println("Hiya");
        }
    }

    public static class W extends CA {
        public void printHello() {
            System.out.println("Howdy");
        }
    }

    public static class PB extends W {
        public void printHello() {
            System.out.println("Hello");
        }
    }

    public static void main(String[] args) {
        CA aa = new CA();
        CA ab = (CA) new W();
        CA ac = (CA) new PB();
        W bc = (W) new PB();
        aa.printHello();
        ab.printHello();
        ac.printHello();
        bc.printHello();
    }
}