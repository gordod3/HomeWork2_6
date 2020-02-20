public class Cat<A extends Number> implements Printable<A> {
    A age;

    public Cat(A age) {
        this.age = age;
    }


    @Override
    public A print() {
        return age;
    }
}
