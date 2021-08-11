package creator.electronic;

import creator.ElectronicsCreator;
import entity.Electronics;
import entity.Manufacturer;
import entity.electronics.Telephone;

public class TelephoneCreator implements ElectronicsCreator {

    @Override
    public Electronics create(double price, Manufacturer manufacturer) {
        return new Telephone.Builder()
                .setPrice(price)
                .setManufacturer(manufacturer)
                .build();
    }
}
