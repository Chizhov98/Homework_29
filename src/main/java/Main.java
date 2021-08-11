import creator.electronic.LaptopCreator;
import creator.electronic.TelephoneCreator;
import entity.Customer;
import entity.Electronics;
import entity.Manufacturer;
import entity.Order;
import entity.manufacturer.Apple;
import entity.manufacturer.Samsung;
import java.util.Arrays;

public class Main {
private static final Manufacturer apple = new Apple();
private static final Manufacturer samsung = new Samsung();
    public static void main(String[] args) {

        Customer customer = new Customer("Artem", "Chizhov", 23);

        Electronics laptop = new LaptopCreator().create(1500,apple);
        Electronics telephone = new TelephoneCreator().create(800,samsung);

        Order order = new Order("some id", customer, Arrays.asList(laptop.clone(),telephone.clone(),telephone));
        System.out.println(order.toString());
    }
}
