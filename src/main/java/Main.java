import creator.electronic.ElectronicsCreator;
import creator.electronic.LaptopCreator;
import creator.electronic.TelephoneCreator;
import creator.electronic.TelevisionCreator;
import entity.Customer;
import entity.electronics.Electronics;
import entity.manufacturer.Manufacturer;
import entity.Order;
import entity.manufacturer.Apple;
import entity.manufacturer.Samsung;

import java.util.Arrays;

public class Main {
    private static final Manufacturer apple = new Apple();
    private static final Manufacturer samsung = new Samsung();
    private static final ElectronicsCreator laptopCreator = new LaptopCreator();
    private static final ElectronicsCreator telephoneCreator = new TelephoneCreator();
    private static final ElectronicsCreator televisionCreator = new TelevisionCreator();

    public static void main(String[] args) {

        Customer customer = new Customer("Artem", "Chizhov", 23);

        Electronics laptop = laptopCreator.create(1500, apple);
        Electronics telephone = televisionCreator.create(800, samsung);

        Order order = new Order("some id", customer, Arrays.asList(laptop.clone(), telephone.clone(), telephone));
        System.out.println(order.toString());
    }
}
