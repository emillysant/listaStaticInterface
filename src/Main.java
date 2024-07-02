
public class Main {
    public static void main(String[] args) {
        // 1.
        System.out.println("1 - Classe Counter");
        Counter counter = new Counter();
        Counter.getCount();
        System.out.println(Counter.getCount());
        System.out.println(counter.getCount());
        //2.
        System.out.println("\n2 - Classe TemperatureConverter");
        System.out.println(TemperatureConverter.celsiusToFahrenheit(32));
        System.out.println(TemperatureConverter.fahrenheitToCelso(70));
        //3
        System.out.println("\n3 - Classe Geometry");
        System.out.println("Área do quadrado: " +Geometry.quadrado(2));
        System.out.println("Área do retângulo: "+Geometry.retangulo(2,3));
        System.out.println("Área do triângulo"+Geometry.triangulo(4,3));
        System.out.println("Area do círculo: "+Geometry.circulo(3));
        System.out.println("Volume do paralelepípedo: "+Geometry.paralelepipedo(1,2,3));
        System.out.println("Volume do trapezio: "+Geometry.trapezio(1,2,3));
        System.out.println("Volume do esfera: "+Geometry.esfera(3));
        System.out.println("Volume do cubo: "+ Geometry.cubo(3));
        //4
        System.out.println("\n4 - Classe Product");
        Product p1 = new Product("Laptop", 1200.00);
        Product p2 = new Product("Mouse", 25.00);
        Product p3 = new Product("Keyboard", 45.00);
        ProductManager.addProduct(p1);
        ProductManager.addProduct(p2);
        ProductManager.addProduct(p3);
        System.out.println("Lista de produtos:");
        for (Product product : ProductManager.listProducts()) {
            System.out.println(product);
        }
        ProductManager.removeProduct("Mouse");
        System.out.println("\nLista de produtos após remoção:");
        for (Product product : ProductManager.listProducts()) {
            System.out.println(product);
        }
        //5
        System.out.println("\n5 - Classe Bank");
        BankAccount account1 = new BankAccount("1", "Alice", 500);
        BankAccount account2 = new BankAccount("2", "João", 340);
        Bank.openAccount(account1);
        Bank.openAccount(account2);
        System.out.println("Contas bancárias após abertura:");
        for (BankAccount account : Bank.listAccounts()) {
            System.out.println(account);
        }
        Bank.deposit("123", 200.00);
        Bank.withdraw("456", 50.00);
        //6
        System.out.println("\n6 - Interface ṕrintable");
        Printable img = new Image();
        Printable doc = new Document();
        doc.print();
        img.print();
        //7
        System.out.println("\n7 - Interface Speakable");
        Speakable cat = new Cat();
        Speakable dog = new Dog();
        cat.speak();
        dog.speak();
        //8
        System.out.println("\n7 - Interface Sortable");
        int[] array1 = {5, 3, 8, 4, 2};
        int[] array2 = {5, 3, 8, 4, 2};

        Sortable bubbleSort = new BubbleSort();
        Sortable quickSort = new QuickSort();

        bubbleSort.sort(array1);
        quickSort.sort(array2);

        System.out.println("Array ordenado com BubbleSort:");
        for (int num : array1) {
            System.out.print(num + " ");
        }
        System.out.println();

        System.out.println("Array ordenado com QuickSort:");
        for (int num : array2) {
            System.out.print(num + " ");
        }
        //9
        System.out.println("9 - Interface CurrencyConverter");
        CurrencyConverter usdToEur = new UsdToEurConverter();
        CurrencyConverter eurToThb = new EurToThbConverter();
        double amountInUsd = 120.00;
        double amountInEur = usdToEur.convert(amountInUsd, "USD", "EUR");
        double amountInThb = eurToThb.convert(amountInEur, "EUR", "THB");
        System.out.println(amountInUsd + " USD é igual a " + amountInEur + " EUR");
        System.out.println(amountInEur + " EUR é igual a " + amountInThb + " THB");


    }
}