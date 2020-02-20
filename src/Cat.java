public class Cat<A extends Number> implements Runnable<A> {
    A age;

    public Cat(A age) {
        this.age = age;
    }


    @Override
    public String run() {
        return "Бежит";
    }
}
