/**
  * Java 3. HomeWork 3
  *
  * @author Nikita
  * @version 30.03.2022
  */
import java.util.Arrays;
  
class HomeWork3 {
    
    public static void main( String[] args) {
        integerArray();
        emptyIntegerArray();
        array();
        squareIntegerArray();
        System.out.println(twoArgumentMethod(5,5));
        
    }
    
    static void integerArray(){
        int[] arr = {0, 0, 1, 0, 0, 1};
        for (int i = 0; i < arr.length; i++) {
            if( arr[i] == 1) {
                arr[i] = 0;
            }
            else {
                arr[i] = 1;
            }
        }
        System.out.println(Arrays.toString(arr));
    }   
    
    static void emptyIntegerArray(){
        int[] arr = new int [100];
        for ( int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }     
    
    static void array() {
        int[] arr = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }
            System.out.println();
            System.out.print(Arrays.toString(arr));
        }
    }

    static void squareIntegerArray() {
        int[][] arr = new int[3][3];
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0, x = arr[i].length - 1; j < arr[i].length; j++, x--) {
                if (i == j || i == x) arr[i][j] = 1;
                else arr[i][j] = 0;
                System.out.print(arr[i][j] + " ");
            }
            System.out.print("\n");  
        }
    } 

    static int[] twoArgumentMethod(int len, int initialValue) {
        int[] arr = new int[len];
        for( int i = 0; i < len; i++) {
            arr[i] = initialValue;   
        }
        return arr;
    }        
}   

