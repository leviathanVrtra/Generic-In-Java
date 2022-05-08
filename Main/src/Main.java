public class Main {
    public static void main(String[] args) {
        Printer<Integer> val1 = new Printer<>(10);
        val1.print();

        Printer<Double> val2 = new Printer<>(33.22);
        val2.print();

        Printer<String> val3 = new Printer<>("Sachin");
        val3.print();
    }
}