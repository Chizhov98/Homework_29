package creator;

import entity.Electronics;
import entity.Manufacturer;

public interface ElectronicsCreator {
    Electronics create(double price, Manufacturer manufacturer);
}
