import java.util.ArrayList;

public class Search {
    public static void main(String[] args) {
        ArrayList<String> haystack = new ArrayList<String>();
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("needle");
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("hay");
        haystack.add("hay");
        String needle = "needle";
        System.out.println(binarySearch(haystack, needle));
    }

    

    static int binarySearch(ArrayList<String> haystack, String needle){
        int left = 0;
        int right = haystack.size() - 1;
        int mid = (int) (left + right) / 2;

        while(left <= right && haystack.get(mid).equalsIgnoreCase(needle)){
            if(haystack.get(mid).compareTo(needle) < 0){
                left = mid + 1;
            } else if (haystack.get(mid).compareTo(needle) == 0) { 
                return mid;
            } else {
                right = mid + 1;
            }
            mid = (left + right) / 2;
        }
        if(left > right){
            mid = -1; 
        }
        return mid; 
    }
}