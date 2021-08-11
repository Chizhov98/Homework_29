package entity.electronics;

import entity.Electronics;
import entity.Manufacturer;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
public class Laptop implements Electronics {
    private double price;
    private Manufacturer manufacturer;

    @Override
    public void doWork() {
        System.out.println("You can use it everywhere");
    }

    public Electronics clone() {
        return new Television.Builder()
                .setPrice(price)
                .setManufacturer(manufacturer.clone()).
                        build();
    }

    public static class Builder {
        private double price;
        private Manufacturer manufacturer;

        public Builder setPrice(double price) {
            this.price = price;
            return this;
        }

        public Builder setManufacturer(Manufacturer manufacturer) {
            this.manufacturer = manufacturer;
            return this;
        }

        public Laptop build() {
            if (price <= 0) {
                price = 300;
            }
            return new Laptop(price, manufacturer);
        }
    }
}
