public class Task2 {

    public static int[][] transition(int[][] sm) throws Exception {
        if (sm == null || sm.length == 0 || sm[0].length == 0){
            throw new Exception("Count of columns and rows must be greater 0");
        }
        int rows = sm.length;
        int cols = sm[0].length;
        int[][] arr = new int[cols][rows];
        int col_index = rows - 1;
        for (int[] nums : sm){
            for (int i = 0; i < nums.length; i++){
                arr[i][col_index] = nums[i];
            }
            col_index--;
        }
        return arr;
    }
}
