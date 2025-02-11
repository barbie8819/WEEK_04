package DynamicOnlineMarketPlace;

public class DiscountManager {
    public static <T extends Product> void Discount(T item , double percentage){
        double discount = item.getPrice()*(percentage/100);
        item.setPrice(item.getPrice()-discount);
    }
}
