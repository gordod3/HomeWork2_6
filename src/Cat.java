public class Cat<A extends Number> implements Runnable {
    A age;

    public Cat(A age) {
        this.age = age;
    }
}
