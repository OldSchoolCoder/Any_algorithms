package twoSum;

public class DubleSum {

    public static void main(String[] args) {
        System.out.println("Start");
    }

    public static int[] resultIndex(int[] arr, int needSum){
        int sum;
//        for (int i = 0; i < arr.length-1; i++) {
//            sum=arr[0]+arr[i+1];
//            System.out.println("Sum = " + sum);
//        }
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                sum = arr[i] + arr[j];
                if (sum == needSum) {
                    return new int[]{i,j};
                }
            }
        }
//        for (int element: arr) {
//            sum = element+element[element.]
//        }
        return new int[]{};
    }
}
