package entity.electronics;

import entity.Electronics;
import entity.Manufacturer;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Telephone implements Electronics {
    private double price;
    private Manufacturer manufacturer;

    @Override
    public void doWork() {
        System.out.println("you can phone to someone");
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

        public Telephone build() {
            if (price <= 0) {
                price = 300;
            }
            return new Telephone(price, manufacturer);
        }
    }
}
