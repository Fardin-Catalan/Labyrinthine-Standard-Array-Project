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
        boolean flag=false;
        int num_index=-1;
        int num=0;
        for(int i=0;i<=arr.length-1;i++){
                                         for(int j=i+1;j<=arr.length-1;j++){
            if(arr[i]==arr[j]){
                num_index=i;
                num=arr[i];
                flag=true;
                break;
            }
        }
                                         if(flag){
                                             break;
                                         }
        }
        if(num_index!=-1){
            System.out.println(num);
        }
        else{
            System.out.println("Not Found");
        }
    }
}
