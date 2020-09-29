interface I1<T extends Number> {
    public T m1(T t);
}
interface I2 extends I1 <Integer>{
    public void m2();
}
interface I3 extends I2 {
    public Integer m1(Integer i);
}

public class GenericInterface implements I3 {
    public Integer m1(Integer i) {
        // TODO Auto-generated method stub
        return null;
    }

    public void m2() {
        // TODO Auto-generated method stub
    }
}
