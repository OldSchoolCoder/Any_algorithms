package twoSum;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class TwoSumHash {

    public static void main(String[] args) {
    }

    public static int[] calculate(int[] arr, int needSum){
        //HashSet<Integer> hashSet = new HashSet<>();
        Map <Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i],i);
        }
        int needNumber;
        for (int i = 0; i < arr.length; i++) {
            needNumber=needSum-arr[i];
            if (map.containsValue(needNumber)){
                return new int[]{i,map.get(needNumber)};
            }
//            if (hashSet.contains(needNumber){
//                arr.
//                return new int[]{i,};
//            }
        }
        return new int[0];
    }
}
