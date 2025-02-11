package WarehouseManagementSystem;

public class Main {
    public static void main(String[] args) {
        Storage<Electronics> electronicsStorage =new Storage<>();
        electronicsStorage.add(new Electronics("kettle"));
        electronicsStorage.add(new Electronics("mobile"));
        Storage<Groceries> groceriesStorage= new Storage<>();
        groceriesStorage.add(new Groceries("Bhindi"));
        groceriesStorage.add(new Groceries("Tomato"));
        Storage<Furniture> furnitureStorage= new Storage<>();
        furnitureStorage.add(new Furniture("Table"));
        furnitureStorage.add(new Furniture("Chair"));
        WildCard.WildcardMethod(electronicsStorage.getList());
        WildCard.WildcardMethod(groceriesStorage.getList());
        WildCard.WildcardMethod(furnitureStorage.getList());

    }
}
