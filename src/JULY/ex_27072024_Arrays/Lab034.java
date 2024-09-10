package JULY.ex_27072024_Arrays;

public class Lab034 {
    public static void main(String[] args) {
        //Single - dimension Array
        // Having only one dimension, represented in a list of elements
//        int[] ages = {1, 2, 5, 18, 28};
//        int[] age2 = new int[3];

        //Multi dimension arrays
        // Have two or more dimension, represented in a list of table or grid of elements
        //Ex = 2D, 3D, 4D


        //2D
//        int[][] array_2d_2 = new int[3][3];
        // |0|0|0|
        // |0|0|0|
        // |0|0|0|

//        array_2d_2[0][0] = 34;
        // |34,0,0|
        // |0,0,0|
        // |0,0,0|
//        array_2d_2[0][1] = 12;
        // |34,12,0|
        // |0,0,0|
        // |0,0,0|


        int[][] array_2d = {
                {34, 12, 11},
                {34, 12, 34},
                {11, 23, 98}
        };
        for (int i = 0; i <array_2d.length; i++) { // Row  0,1,2
            for (int j = 0; j <array_2d[i].length; j++) { // Column , 0,1,2
                System.out.print(array_2d[i][j]);
                System.out.print("\t");
            }
            System.out.println();
        }
    }
}
