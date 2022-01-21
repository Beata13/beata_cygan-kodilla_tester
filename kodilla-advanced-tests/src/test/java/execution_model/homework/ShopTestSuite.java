package execution_model.homework;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.util.List;

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
  public void shouldReturnOrderInDatesRange() {
        shop.addOrder(order2);
        shop.addOrder(order1);
        shop.addOrder(order3);
        LocalDate startDate = LocalDate.of(2021,1,14);
        LocalDate stopDate = LocalDate.of(2021,2,02);
        List<Order> orders = shop.getOrder(startDate, stopDate);
        assertEquals(2, orders.size());

    }
    @Test
    public void shouldReturnOrderIfValuesISCorrect(){
        shop.addOrder(order2);
        shop.addOrder(order1);
        shop.addOrder(order3);

        List<Order> orders = shop.addOrderIfValueIsCorrect(100,500);
        assertEquals(2, orders.size());
    }

}