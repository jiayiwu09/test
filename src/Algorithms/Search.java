package Algorithms;

public class Search {
    public static int linearSearch(int[] dataSet, int target) {
        for (int i=0; i < dataSet.length;i++){
            if(dataSet[i] == target){
               return  i;
            }
        }
        return -1;
        }
     public static int binarySearch(int[] dataSet, int target, int start, int end){
        System.out.println("Searching between " + dataSet[start] + "and " + dataSet[end]);
        int middle = (int) Math.floor(((start+end)/2));
        int value = dataSet[middle];

        if (value < target){
            System.out.println(target +">" + value);
            return binarySearch(dataSet,target,middle+1,end);
        }
        else if (value > target){
            System.out.println(target +"<" + value);
            return binarySearch(dataSet,target, start,middle-1);

        }
        return middle;

     }
    }
