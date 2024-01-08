import java.util.Arrays;
public class Linear{

    /*
     * Linear search 
     * 
     * -> linear search meaning searching in the array [ why linear because it search one by one in sequential manner ]
     * 
     * 
     * Time complexity
     *  -> Linear time complexity
     *  -> for searching O(n) -> as the input grows search will grow 
     *  -> best time -> element at index 0 
     *  -> wrost time -> element at index [last]
     * 
     * space complexity
     *  -> no space required 
     */

     public static int linear(int[] array , int target){
        for(int i = 0; i < array.length; i++){
            if(array[i] == target){
                return i;
            }
        }
        return-1;
     }

     public static int range(int[] array, int start, int end,int target){
        for(int i = start; i < end; i++){
            if(array[i] == target){
                return i;
            }
        }
        return-1;
     }

     public static void Search2D(int[][] array,int target){
        for(int i = 0; i < array.length; i++){
            for(int j = 0; j < array[i].length; j++){
                if(array[i][j] == target){
                    System.out.println("row " + i + ": coloumn " + j);
                }
            }
        }
     }

     public static void evenDigits(){
        int[] array = {12,345,2,6,7896};
        int count = 0;
        for(int num : array){
            if(isEven(num)){
                count++;
            }
        }
        System.out.println("Output : " + count);
     }

     public static boolean isEven(int nums){
        int count = 0;
        while(nums > 0){
            nums = nums / 10;
            count++;
        }

        if(count % 2 == 0){
            return true;
        }

        return false;
     }

     public static void wealth(){
        int[][] array = {
            {1,2,3},
            {1,2,3},
            {4,5,6}
        };
        int sum = 0;
        int ans[] = new int[array.length];
        for(int i = 0; i < array.length; i++){
            sum = 0;
            for(int j = 0; j < array[i].length; j++){
                sum = sum + array[i][j];
            }
            ans[i] = sum;
        }
        System.out.println(Arrays.toString(ans));

        int max = ans[0];

        for(int i = 0; i < ans.length; i++ ){
            if(ans[i] > max){
                max = ans[i];
            }
        }
        System.out.println("Max : " + max);

     }


    public static void main(String[] args) {
        wealth();
    }


}