public class Printer <T> {
    private T valToPrint;

    public Printer(T valToPrint) {
        this.valToPrint = valToPrint;
    }

    public T getValToPrint() {
        return valToPrint;
    }

    public void print() {
        System.out.println("Current value is : " + getValToPrint());
    }
}
