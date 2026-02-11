import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            arr[i]=sc.nextInt();
        }
        boolean valid=true;
        for(int i=0;i<=arr.length-1;i++){
            if(!(arr[i]==arr[arr.length-i-1])){
                valid=false;
                break;
            }
        }
        if(valid){
            System.out.println("Palindromic Array");
        }
        else{
            System.out.println("Non-palindromic Array");
        }
    }
}
        
