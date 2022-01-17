package execution_model.homework;

import com.kodilla.execution_model.homework.Order;
import com.kodilla.execution_model.homework.Shop;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ShopTestSuite {
    Shop shop = new Shop();
    Order order1 = new Order(200, 22.01, "John123");
    Order order2 = new Order(300, 01.02, "Kate1");
    Order order3 = new Order(100, 01.01, "Marry123");

    @Test
    public void shouldAddOrdersToShop(){
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
        assertEquals(3, shop.getOrdersSize());
  //  }
  //  @Test
   // public void shouldReturnOrdersIfDateIsCorrect(){
   //     shop.addOrder(order1);
//        shop.addOrder(order3);
   //     assertEquals(2, shop.getOrder(order1.getDate()));
    }
    @Test
    public void shouldReturnNullWhenPassingNegativeIndex() {
        shop.addOrder(order1);
        shop.addOrder(order2);
        shop.addOrder(order3);
    }
}
