import java.util.Scanner;

public class ARRAYS{
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

        for(int i=0;i<size;i++){
            if (number[i]==x) {
                System.out.println("matched at index"+i);   
            }  
    
        }    
    }
