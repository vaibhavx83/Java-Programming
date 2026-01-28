import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(10);
        arr.add(20);
        arr.add(30);

        int i = 0, j = arr.size() - 1;

        while (i < j) {
            int temp = arr.get(i);
            arr.set(i, arr.get(j));
            arr.set(j, temp);

            i++;
            j--;
        }

        System.out.println(arr);
    }
}
