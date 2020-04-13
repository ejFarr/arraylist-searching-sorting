import java.util.ArrayList;

public class Sort {
    public static void main(String[] args) {
        ArrayList <String> list = new ArrayList<String>(); 
        list.add("apple");
        list.add("banana");
        list.add("strawberry");
        list.add("cherry");
        list.add("pineapple");
        list.add("lemon");
        list.add("mango");
        list.add("cherry");
        list.add("watermelon");
        System.out.println(list);
        insertionSort(list);
        System.out.println(list);
    }

    static void bubbleSort(ArrayList <String> list) {
        boolean isSorted = false;

        while (!isSorted) {
            int sorted = 0;
            for (int i = 1; i < list.size(); i++) {
                String current = list.get(i);
                int j = i -1;
                String swap = list.get(j);
                if (current.compareTo(swap) < 0) {
                    list.set(i, swap);
                    list.set(j, current);
                }
                if (current.compareTo(swap) >= 0) {
                    sorted++;
                }
                if (sorted == list.size() - 1) {
                    isSorted = true;
                }

            }
        }
    }

    static void insertionSort(ArrayList <String> list){
            for (int i = 1; i < list.size(); i++) {
                String current= list.get(i);
                int j = i - 1;
                String swap = list.get(j); 
                while (j >= 0) {
                    swap = list.get(j);
                    if (current.compareTo(swap) < 0) {
                        list.set(j + 1, swap);
                        list.set(j, current);
                    }
                    j -= 1;
                }
            }
    }

    static void selectionSort(ArrayList<String> list){
        for (int i = 0 ; i < list.size(); i++) {
            String first = list.get(i);
            int firstLocation = i;
            String current= list.get(i); 
            for (int j = i + 1; j < list.size(); j++) {
                if (first.compareTo(list.get(j)) >= 0) {
                    first = list.get(j);
                    firstLocation = j;
                }
            }
            list.set(i, first);
            list.set(firstLocation, current);
        }
    }
}