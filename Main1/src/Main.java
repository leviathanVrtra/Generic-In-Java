public class Main {
    public static void main(String[] args) {
        Printer<Cat>catPrinter = new Printer<>(new Cat());
        catPrinter.print();

        Printer<Dog> dogPrinter = new Printer<>(new Dog());
        dogPrinter.print();
		
		shout("Sachin", 111);

        List l2 = new ArrayList();  // UnType Safe : Different type elements can be added
        l2.add(new Cat());
        l2.add(new Dog());
        printList(l2);
    }
	
	private static <T, V> void shout(T key, V val) {
        System.out.println(key + " -> " + val);
    }

    private static <T extends Animal> void printList(List<T>lst) {  // List<? extends Animal> lst
        for (T t : lst) {
            System.out.println(t.getName());
        }
    }
}