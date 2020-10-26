public class ArrayOps{
  public static int sum(int[]arr){
    int sumArr = 0;
    for (int i = 0; i < arr.length; i++){
      sumArr += arr[i];
    }
    return sumArr;
  }
  public static int largest(int[]arr){
    int max = 0;
    for (int i = 0; i < arr.length;i++){
      if (max < arr[i]){
        max = arr[i];
      }
    }
    return max;
  }
  public static int[] sumRows(int[][] matrix) {
    int[] sumArray = new int[matrix.length];
    for (int i = 0; i < matrix.length;i++){
      sumArray[i] = sum(matrix[i]);
    }
    return sumArray;
  }
  public static  int[] largestInRows(int[][] matrix){
    int[] large = new int[matrix.length];
    for (int i = 0; i < matrix.length;i++){
      large[i]= largest(matrix[i]);
  }
  return large;
}
public static  int sum(int[][] arr) {
  int sum = 0;
  for (int i = 0; i < arr.length;i++){
    for (int j = 0; j < arr[i].length;j++){
      sum += arr[i][j];
      }
    }
    return sum;
  }
  public static int[] sumCols(int[][] matrix) {
    int[] sum1 = new int[matrix.length];
    int[] sum2 = new int[matrix[0].length];
    if (matrix.length == 0){
      int[] sum3 = {};{
        return sum3;
      }
    }
    for (int i = 0; i < matrix[0].length;i++){
      for (int j = 0; j < matrix.length;j++){
        sum1[j] = matrix[j][i];
      }
        sum2[i] = sum(sum1);
    }
    return sum2;
  }
  public static boolean isRowMagic(int[][] matrix) {
    int[] max = sumRows(matrix);
    for (int i = 0; i < max.length-1;i++){
      if (max[i] != max[i+1]){
        return false;
      }
    }
    return true;
 }
public static boolean isColMagic(int[][] matrix) {
    int[] max = sumCols(matrix);
    for (int i = 0;i < max.length-1;i++){
      if (max[i] != max[i+1]){
        return false;
      }
    }
    return true;
  }
  public static boolean isLocationMagic(int[][] matrix, int row, int col) {
    if (sum(matrix[row])== (sumCols(matrix))[col]){
      return true;
    }
    return false;
    }
}
