public class print2 {
    public static void main (String[] args) {

        int row = 4;
        int col = 4;
        int [] [] A = new int [row] [col];

        int value = 1;
        
        // off the top of my memory, this should plug in values for my two dimensional array, it should look like
        /*
        1 2 3 4
        5 6 7 8
        9 10 11 12
        13 14 15 16
         */


         System.out.println("---------------ARRAY 1-----------------------------------------");
        for (int i =0; i< row; i++) {
            for (int j = 0; j<col; j++){
                A[i][j] = value;
                value++;
            }
        }

        for (int i = 0; i<row; i++){
            for (int j = 0; j<col; j++) {
                System.out.print(A[i][j] + " ");
            }
            System.out.println();

        }

                 System.out.println("---------------ARRAY 2 USING COPY METHOD-----------------------------------------");
                 int[][] b = copy(A);

                 for (int i =0; i<b.length; i++){
                    for (int j =0; j<b[i].length;j++) {
                        System.out.print(b[i][j] +" ");
                    }
                    System.out.println();
                 }

     System.out.println("---------------TESTING THE COPY METHOD -----------------------------------------");
     System.out.println("equals? : " + equals(A, b));


              
    }
    /*
                 create a copy method
                 copy()
                 This method takes a two dimensional array of ints as a parameter. The purpose of this method is to 
                 return an exact copy of the array passed in the parameter 

                 
                 */
public static int[][] copy(int [][] a){
int[][] b = new int[a.length][a[0].length];

for (int i =0; i<a.length; i++) {
    for (int j =0; j<b[i].length;j++) {
        b[i][j] = a[i][j];
    }
}
return b;
}

/*
 equals()
 The method takes two parameters, both are two dimensional arrays of ints
 the method shall return true if both arrays are identical,
 this means that the number of rows, cols, and the content of both arrays are the same, and should return false otherwise. 
 */
public static boolean equals (int[][]a, int[][]b) {
    if (a.length != b.length || a[0].length != b[0].length ) 
        return false;
        for (int i =0; i<a.length; i++) {
            for (int j = 0; j<a[0].length; j++) {
                if( a[i][j] != b[i][j]) 
                return false ;
            }
        }
        return true;
    }
}
    

