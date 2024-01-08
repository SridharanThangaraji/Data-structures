public class Binary {

    /*
     * Binary search is an searching algorithms
     * 
     * -> it  is used in sorted array
     * -> 
     * How works ?
     * -> first find middle element 
     *      -> if middle element > target
     *           search left hand side
     *      -> if middle element  < target
     *          search right hand side
     *      -> else
     *          return the mid;
     * 
     * 
     * Time complexity
     * -> Best case - O(1)
     * -> worst case - 
     * 
     * => search space 
     * 
     * -> 1st - n
     * -> 2end - n/2
     * -> 3rd -n / 4
     * -> 4th - n / 8
     * -> in the last one element will remain or else no other number 
     * 
     *  -> in math last level is n / 2pow(k)
     * 
     * 
     * Total comparision
     *  -> 2logN = log(n)
     */

    public static int binary(int[] arr, int target){
        int start = 0;
        int end = arr.length-1;

        

        while(start <= end){
            int mid = start + (end - start )/2;

            if(arr[mid] == target){
            return mid;
             }
            if(target < arr[mid]){
                start = mid + 1;
            }else if(target > arr[mid]){
                end = mid -1;
            }else{
                return mid;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        int index = binary(new int[] {10,9,8,7,6,5,4,3,2,1}, 9);
        System.out.println("Index : " + index);
    }    
}
