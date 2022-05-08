public class Main {
    public static void main(String[] args) {
        Printer<Cat>catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();
    }
}