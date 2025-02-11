package WarehouseManagementSystem;

import java.util.List;

public class WildCard {
    public  static void WildcardMethod(List<? extends WarehouseItem> items){
        for(Object o : items){
            System.out.println(o);
        }

    }
}
