package homework3;

public class Task1 {
    public static int search (int arr[]){
        int start = 0;
        int end = arr.length - 1;

        while (start<=end){
            int base = (start + end) /2;
            if (arr[base] - base == 1)
            start = base +1;
            else
                end = base -1;
        }
        return start+1;
    }

    public static void main(String[] args) {
        System.out.println(search(new int[]{1, 2, 3, 4, 6, 7, 8}));
        System.out.println(search(new int[]{1, 3, 4, 5, 6, 7, 8}));
        System.out.println(search(new int[]{2, 3, 4, 6, 7, 8}));
        System.out.println(search(new int[]{1,2, 3, 4,5, 6, 7, }));
    }
}
