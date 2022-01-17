package execution_model.homework;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(200, LocalDate.of(2021, 01, 15), "John123");
    Order order2 = new Order(300, LocalDate.of(2021, 02, 01), "Kate1");
    Order order3 = new Order(1, LocalDate.of(2021, 03, 31), "Marry123");

    @Test
    public void shouldAddOrdersToShop() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(3, shop.getOrdersSize());
    }

    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        Order index = shop.getOrders(-1);
        assertNull(index);
    }

    @Test
    public void shouldReturnNullWhenPassingOutOffIndex() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        Order index = shop.getOrders(5);
        assertNull(index);
    }

    @Test
    public void gettingActualOrder() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        Order index = shop.getOrders(0);
        assertEquals(200, order1.getValue());
    }

    @Test
    public void shouldReturnOrderSize() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(3, shop.getOrdersSize());
    }

    @Test
    public void shouldNotAddOrderIfValueIsCorrect() {
        shop.addOrder(order1);
        assertEquals("Value is not correct", shop.addOrderIfValueIsCorrect());
    }

    @Test
    public void shouldAddOrderIfValueIsCorrect() {
        shop.addOrder(order2);
        assertEquals("Value is not correct", shop.addOrderIfValueIsCorrect());
    }

    @Test
    public void shouldNotReturnOrderIfDateISNotCorrect() {
        shop.addOrder(order2);
        assertEquals(null, shop.getOrder(order2.getDate()));
    }

}