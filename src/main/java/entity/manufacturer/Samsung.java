package entity.manufacturer;

import entity.Manufacturer;
import lombok.Getter;

@Getter
public class Samsung implements Manufacturer {
    private final String name = "Samsung";

    @Override
    public Manufacturer clone() {
        return this;
    }
}
