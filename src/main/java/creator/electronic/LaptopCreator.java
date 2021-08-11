package creator.electronic;

import creator.ElectronicsCreator;
import entity.Electronics;
import entity.Manufacturer;
import entity.electronics.Laptop;
import entity.manufacturer.Apple;

public class LaptopCreator implements ElectronicsCreator {



    @Override
    public  Electronics create(double price, Manufacturer manufacturer) {
        return new Laptop.Builder()
                .setManufacturer(manufacturer)
                .setPrice(price)
                .build();
    }
}
