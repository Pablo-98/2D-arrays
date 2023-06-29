public class arrays {

    public static void main (String[] args) {
        //<data type> [] [] <id> = new <data type> [<row capacity>] [<col capacity>];




        // 4 x 3 int[] with random numbers from 0-15
        int [][] c = new int [4] [3];

        // i is the row number in this example
        //remember c.length gives us the total size of that particular array

        //first two for loops are to populate the array
        for(int row=0; row< c.length; row++){
            for(int col=0; col< c[row].length; col++){
                     int r = (int)(Math.random()*16);
                     c[row][col] = r;

            }
        }
        //second two for loops are
             for(int row=0; row< c.length; row++){
            for(int col=0; col< c[row].length; col++){
                   System.out.print(c[row][col] + "\t");
            }
            System.out.println();

            }
        }

        


    




    }
