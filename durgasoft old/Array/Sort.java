import java.util.Arrays;
//sort the elements in an array in asc order by using predefined methods
class Sort {
    public static void main(String[] args) {
        int a[] = {5,2,1,54,1};
        System.out.println(Arrays.toString(a));
        Arrays.sort(a, 0, 3) ;//[1, 2, 5, 54, 1]
        System.out.println(Arrays.toString(a));
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));//[1, 1, 2, 5, 54]
    }

}
