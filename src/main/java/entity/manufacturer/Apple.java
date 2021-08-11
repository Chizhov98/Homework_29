package entity.manufacturer;

import entity.Manufacturer;
import lombok.Getter;

@Getter
public class Apple implements Manufacturer {
    private final String name = "Apple";

    @Override
    public Manufacturer clone(){
        return this;
    }
}
