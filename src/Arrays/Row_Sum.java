package Arrays;

/*
Instructions from your teacher:
Complete the method so that it takes in a 2-D array and returns the sums of the rows as an integer array.

For example, the if we run rowSums for the following 2D array:
{
  {1,1,2}, //sum = 4
  {3,1,2}, //sum = 6
  {3,5,3}, //sum = 11
  {0,1,2}  //sum = 3
}


Then we should get the following array back:
{4,6,11,3}
 */
public class Row_Sum {
    public static void main(String[] args) {
        int[][] a = {
                {1, 1, 2}, //sum = 4
                {3, 1, 2}, //sum = 6
                {3, 5, 3}, //sum = 11
                {0, 1, 2}  //sum = 3
        };
        int[] sums = rowSums(a);
        for (int sum : sums)
            System.out.println(sum);
        //this should print 4 6 11 3
    }

    public static int[] rowSums(int[][] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                result[i] += nums[i][j];
            }
        }
        return result;
    }
}


   /* public static int[] rowSums(int[][] nums) {
        int[] arr = new int[nums.length];
        for (int k = 0; k < nums.length; k++) {
            for (int i = 0; i < nums[k].length; i++) {
                arr[k] += nums[k][i];  //[k[ is for the index of the 2D array, and  [i] is for the index of the
                                         1D arrays inside the 2D array
            }
        }
        return arr;

    }
}

    */
