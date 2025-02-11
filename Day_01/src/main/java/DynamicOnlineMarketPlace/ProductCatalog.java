package DynamicOnlineMarketPlace;

import java.util.ArrayList;
import java.util.List;

public class ProductCatalog<T extends Product> {
    List <T> list = new ArrayList<>();
   public void add(T item){
        list.add(item);
    }

    public List<T> getList() {
        return list;
    }

}
