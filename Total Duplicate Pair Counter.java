import java.util.Scanner;
public class main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");
        int n=sc.nextInt();
        int[] arr1=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            arr1[i]=sc.nextInt();
        }
        int count=0;
        for(int i=1;i<=arr1.length-1;i++){
            for(int j=i-1;j>=0;j--){
                if(arr1[i]==arr1[j]){
                    count++;
                }
            }
        }
        System.out.println(count);
    }
}
