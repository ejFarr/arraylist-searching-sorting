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
        selectionSort(list);
        System.out.println(list);
    }

    static void selectionSort(ArrayList<String> list){
        for(int i = 0 ; i < list.size(); i++){
            String first = list.get(i);
            int firstLocation = i;
            String current= list.get(i); 
            for(int j = i + 1; j < list.size(); j++){
                if(first.compareTo(list.get(j)) >= 0){
                    first = list.get(j);
                    firstLocation = j;
                }
            }
            list.set(i, first);
            list.set(firstLocation, current);
        }
    }
}