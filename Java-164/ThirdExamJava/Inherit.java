package ThirdExamJava;

public class Inherit {
    public static class A {
        public int w=3, x=4;
        public int product() {
            return w*x;
        }
    }
    public static class B extends A {
        public int y=2;
        public int product() {
            return w*x*y;
        }
    }

    public static class C extends B {
        public int z=3;
        private int v=2;
        public int productZero() {
            return w*x*z*y;
        }
        public int productOne() {
            return super.product()*v;
        }
    }

    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        System.out.println(a.product());
        System.out.println(b.product());
        System.out.println(c.productZero());
        System.out.println(c.productOne());
    }
}