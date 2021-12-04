import java.util.List;

public class Sort {
    public static List<Laptop> sort(List<Laptop> laptopList) {
        int min = 0;
        for (int i = 0; i < laptopList.size() - 1; i++) {
            min = i;

            for (int j = i + 1; j < laptopList.size(); j++) {
                if (laptopList.get(j).compareTo(laptopList.get(min)) < 0) {
                    min = j;
                }
            }
            if (i == min) {
                continue;
            }
            Laptop temp = laptopList.get(i);
            laptopList.set(i, laptopList.get(min));
            laptopList.set(min, temp);
        }

        return laptopList;
    }

}
