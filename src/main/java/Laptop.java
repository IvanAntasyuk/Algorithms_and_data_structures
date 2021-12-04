import java.math.BigDecimal;
import java.util.UUID;

public class Laptop implements Comparable<Laptop> {
    BigDecimal price;
    int memory;
    Brand brand;
    UUID serialId = UUID.randomUUID();


    @Override
    public int compareTo(Laptop l) {
        int result = price.compareTo(l.getPrice());
        if (result == 0) {
            result =  Integer.compare(memory, l.getMemory());
            if (result == 0) {
                return brand.compareTo(l.getBrand());
            }
            return result;
        }
        return result;
    }

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }

    public int getMemory() {
        return memory;
    }

    public void setMemory(int memory) {
        this.memory = memory;
    }

    public Brand getBrand() {
        return brand;
    }

    public void setBrand(Brand brand) {
        this.brand = brand;
    }

    public UUID getSerialId() {
        return serialId;
    }

    public void setSerialId(UUID serialId) {
        this.serialId = serialId;
    }

    public Laptop(BigDecimal price, int memory, Brand brand) {
        this.price = price;
        this.memory = memory;
        this.brand = brand;
    }
}
