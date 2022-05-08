public class Printer <T extends Animal> {
    private T valToPrint;

    public Printer(T valToPrint) {
        this.valToPrint = valToPrint;
    }

    public T getValToPrint() {
        return valToPrint;
    }

    public void print() {
        valToPrint.eat();
        System.out.println("Name of animal is : " + valToPrint.getName());
        System.out.println("Age of animal is : " + valToPrint.getAge());
    }
}
