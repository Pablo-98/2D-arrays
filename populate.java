public class populate {
    public static void main (String[] args) {
        //2d array called a with array 1 (rows) set to 4 and array 2 (Cols) set at 3
        int [][] a = new int[4][3];

        for(int row=0; row < a.length; row ++) {
            for (int col =0; col < a[row].length; col++){
                int r = (int)(Math.random() *16);
                a[row][col] = r;
            }
        }
        print(a);
    }
    /* #1
     * create a method called print() 
     * the method will take a two dimensional array as a parameter and will print the content in matrix form 
     */
    public static void print(int[][] a) {
        for (int row = 0; row < a.length; row ++) {
            for (int col =0; col < a[row].length; col++){
                System.out.print(a[row][col] + "\t");

            }
            System.out.println();
             
        }
    }

   /* #2
    * create a method called populateArray()
    the method shall take two ints as parameters (rows and cols). Based on the number of rows and cols, 
    the method shall create and return  a two dimensional array populated with random numbers  
    */
    public static int[][] populateArray(int rows, int cols) {
        int[][] a = new int[rows][cols];
        for(int row=0; row <a.length; row++) {
            for (int col= 0; col<a[row].length; col++){
                
            }
        }

        //for (int row =0; row < )

        return a;
    }

}
