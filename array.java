// Take an array as input from the user
// search for a given number x 
// and  print the index at which  it occurs.
// LINEAR SEARCH(DSA QUESTION)

import java.util.Scanner;

class abhi{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();

        // input the size of the array

        int number[]= new int[size];

        // input of the variables of array

        for(int i = 0;i<size;i++ ){
            number[i] = sc.nextInt();
        }

        // input of the number to match

        int x = sc.nextInt();

        // match the number and throw the result

        for(int i=0;i<=size;i++){
            if (number[i]==x) {
                System.out.println("matched at index"+i);   
            }  
    
        }    
    }
}
