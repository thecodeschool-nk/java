public class ArrayDemo {
    public static void main(String[] args) {
//        array1();

//        array2();
/*        ArrayDemo arrayDemo1 = new ArrayDemo();
        ArrayDemo arrayDemo2 = new ArrayDemo();

        ArrayDemo.twoDimensionalArray();
        ArrayDemo.twoDimensionalArray();*/

        twoDimensionalArray();

    }

    private static void twoDimensionalArray() {
//        int arr[][] = new int [3][3];
        int arr[][] = {
                        {1, 2, 3},
                        {4, 5, 6},
                        {7, 8, 9}
                    };

        for (int row=0; row < arr.length; row++) {
            for (int col=0; col<arr[0].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }
    }

    private static void twoDimensionalTransposeArray() {
        int arr[][] = {
                {1, 2, 3},
                {4, 5, 6},
                {7, 8, 9}
        };

        for (int row=0; row < arr.length; row++) {
            for (int col=0; col<arr[0].length; col++) {
                System.out.print(arr[row][col] + "\t");
            }
            System.out.println();
        }

        // TODO: convert row to col and col to rows
        /*
               1 4 7
               2 5 8
               3 6 9
         */
    }

    private static void array2() {

        int []arr = {1, 2, 3, 4, 5};

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }

    private static void array1() {
        int num[] = new int[5];
/*        num[0] = 1;
        num[1] = 2;
        num[2] = 3;
        num[3] = 4;
        num[4] = 5;*/
//        num[5] = 6; // this line will cause exception

        for (int i = 0; i < num.length; i++) {
            num[i] = i + 1;
        }

        System.out.println(num.length);

        for (int i = 0; i < num.length; i++) {
            System.out.println(num[i]);
        }
    }
}
