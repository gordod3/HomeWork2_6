public class Main {

	public static void main(String[] args) {
		Cat<Integer> snejok = new  Cat<>(5);
		Cat<Float> murzik = new  Cat(4.5);
		Cat<Double> garfield = new  Cat(3.6);
		System.out.println(snejok.print() + murzik.print() + garfield.print());
	}
}
