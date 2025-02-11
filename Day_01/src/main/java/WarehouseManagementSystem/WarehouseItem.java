package WarehouseManagementSystem;

abstract class WarehouseItem {
    private String name;

    public WarehouseItem(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() + ": " + name;
    }
}
 class Electronics extends WarehouseItem{
    public Electronics(String name) {
        super(name);
    }
}
class Groceries extends WarehouseItem{
    public Groceries(String name) {
        super(name);
    }
}
class Furniture extends WarehouseItem{
    public Furniture(String name) {
        super(name);
    }
}

















