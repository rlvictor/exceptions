package ru.netology.Product;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ProductTest {

    @Test
    public void testRemoveWhenProductExist() {
        ShopRepository repo = new ShopRepository();
        Product products1 = new Product(11, "bread", 50);
        Product products2 = new Product(15, "butter", 150);
        Product products3 = new Product(21, "milk", 30);

        repo.add(products1);
        repo.add(products2);
        repo.add(products3);
        repo.remove(21);
        Product[] actual = repo.findAll();
        Product[] expected = {products1, products2};
        Assertions.assertArrayEquals(expected, actual);

    }

    @Test
    public void testRemoveWhenProductNotExist() {
        ShopRepository repo = new ShopRepository();
        Product products1 = new Product(11, "bread", 50);
        Product products2 = new Product(15, "butter", 150);
        Product products3 = new Product(21, "milk", 30);

        repo.add(products1);
        repo.add(products2);
        repo.add(products3);

        Assertions.assertThrows(NotFoundException.class,
                () -> repo.remove(50)
        );
    }


}
