public class arrays {
    public static void main(String[]args){
        // Single dimentional array
        int [] arr = { 1,5,6,8,6};
        System.out.println(arr[3] + arr[2]);
        System.out.println("Before change : " + arr[1]);
        arr[1]= 22;
        System.out.println("After Change : " + arr[1]);

        //cheaking the length of the array
        int length = arr.length;
        System.out.println("The length of the array is : " +  length);

        //accessing every element in the array
        for(int i=0; i<arr.length;i++){
            System.out.println("The element at index " + i + " is : " + arr[i]);
        }
        // two dimentional array method 1
        int arr1 [][] = new int[3][3];
        arr1 [0][0] = 9;
        arr1 [0][1] = 8;
        arr1 [0][2] = 7;
        arr1 [1][0] = 6;
        arr1 [1][1] = 5;
        arr1 [1][2] = 4;
        arr1 [2][0] = 3;
        arr1 [2][1] = 2;
        arr1 [2][2] = 1;


        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                System.out.print(arr1[i][j] + " ");
            }
            System.out.println();
        }

        System.out.println("Using another method :");
        // two dimentional array method 2
        int arr2[][] = {{1,2,3} , {4,5,6} , {7,8,9}};

        for(int i =0; i< 3; i++){
            for(int j=0; j<3; j++){
                System.out.print(arr2[i][j] + " ");
            }
            System.out.println();
        }

    }
}
