import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        List<Laptop> laptops = generateListLaptops();
        laptops = Sort.sort(laptops);
        displayLaptops(laptops);

    }

    private static Laptop createNotebook() {
        Random random = new Random();
        BigDecimal price = BigDecimal.valueOf(random.nextInt(50) * 50 + 500);
        int memory = (random.nextInt(4) + 1) * 6;
        int producersCount = Brand.values().length;
        Brand brand = Brand.values()[random.nextInt(producersCount)];
        return new Laptop(price, memory, brand);
    }

    private static ArrayList<Laptop> generateListLaptops() {
        ArrayList<Laptop> arrayList = new ArrayList<>();
        for (int i = 0; i < 5000; i++) {
            arrayList.add(createNotebook());
        }
        return arrayList;
    }
    private static void displayLaptops(List<Laptop> list) {
        for (Laptop n : list) {
            System.out.printf("Ноутбук:\tс\\н: %s,\tцена: %s,\tпамять: %s,\tпроизводитель: %s%n", n.getSerialId(),
                    n.getPrice(),
                    n.getMemory(), n.getBrand());
        }
    }
}
