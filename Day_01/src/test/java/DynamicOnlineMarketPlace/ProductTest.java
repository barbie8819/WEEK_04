package DynamicOnlineMarketPlace;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.awt.print.Book;

import static org.junit.jupiter.api.Assertions.*;

class ProductTest {
    private ProductCatalog<Books> bookCatalog;
    private ProductCatalog<Clothing> clothingCatalog;
    private ProductCatalog<Gadgets> gadgetCatalog;

    @BeforeEach
    void setUp() {
        bookCatalog = new ProductCatalog<>();
        clothingCatalog = new ProductCatalog<>();
        gadgetCatalog = new ProductCatalog<>();
    }

    @Test
    void testAddProduct() {
        Books book = new Books("Java Basics", 40.0);
        bookCatalog.add(book);
        assertEquals(1, bookCatalog.getList().size());
        assertEquals("Java Basics", bookCatalog.getList().get(0).getName());
    }

    @Test
    void testApplyDiscount() {
        Gadgets gadget = new Gadgets("Tablet", 300.0);
        gadgetCatalog.add(gadget);
        DiscountManager.Discount(gadget, 10);
        assertEquals(270.0, gadget.getPrice(), 0.01);
    }
}