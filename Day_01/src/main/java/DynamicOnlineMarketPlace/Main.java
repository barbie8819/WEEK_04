package DynamicOnlineMarketPlace;

public class Main {
    public static void main(String[] args) {
        ProductCatalog<Books> booksProductCatalog = new ProductCatalog<>();
        booksProductCatalog.add(new Books("let us C",100));
        booksProductCatalog.add(new Books("let us C++",1000));
        ProductCatalog<Clothing> clothingProductCatalog = new ProductCatalog<>();
        clothingProductCatalog.add(new Clothing("jeans",500));
        clothingProductCatalog.add(new Clothing("Skirt",200));
        ProductCatalog<Gadgets> gadgetsProductCatalog = new ProductCatalog<>();
        gadgetsProductCatalog.add(new Gadgets("JoyStick",5000));
        gadgetsProductCatalog.add(new Gadgets("Monitor",10000));
        System.out.println("Before Discount:");
        booksProductCatalog.getList().forEach(System.out::println);
        clothingProductCatalog.getList().forEach(System.out::println);
        gadgetsProductCatalog.getList().forEach(System.out::println);
        DiscountManager.Discount(booksProductCatalog.getList().get(0),10);
        DiscountManager.Discount(clothingProductCatalog.getList().get(0),10);
        DiscountManager.Discount(gadgetsProductCatalog.getList().get(0),10);
        System.out.println("\nAfter Discount:");
        booksProductCatalog.getList().forEach(System.out::println);
        clothingProductCatalog.getList().forEach(System.out::println);
        gadgetsProductCatalog.getList().forEach(System.out::println);

    }
}
