import com.kodilla.exception.homework.Order;
import com.kodilla.exception.homework.OrderDoesntExistException;
import com.kodilla.exception.homework.Warehouse;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class WarehouseAppTestSuite {


    @Test
    public void shouldGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        Order order = warehouse.getOrder("2");
        Assertions.assertEquals("2", order.getNumber());
    }

    @Test
    public void shouldntGetOrder() throws OrderDoesntExistException {
        Warehouse warehouse = new Warehouse();
        warehouse.addOrder(new Order("1"));
        warehouse.addOrder(new Order("2"));
        warehouse.addOrder(new Order("3"));
        Assertions.assertThrows(OrderDoesntExistException.class, () -> warehouse.getOrder("4"));


    }
}