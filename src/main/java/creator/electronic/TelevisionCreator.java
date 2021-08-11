package creator.electronic;

import creator.ElectronicsCreator;
import entity.Electronics;
import entity.Manufacturer;
import entity.electronics.Television;

public class TelevisionCreator implements ElectronicsCreator {
    @Override
    public Electronics create(double price, Manufacturer manufacturer) {
        return new Television.Builder()
                .setManufacturer(manufacturer)
                .setPrice(price).build();
    }
}
