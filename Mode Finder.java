import java.util.Scanner;
public main{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Please enter the length of array 1:");
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            System.out.print("Enter a number:");
            arr[i]=sc.nextInt();
        }
        int prev_max=0;
        int new_max=0;
        int max=0;
        int max_num=0;
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    new_max++;
                }
            }
            if(new_max>prev_max){
                max=new_max;
                max_num=arr[i];
            }
            prev_max=new_max;
            new_max=0;
        }
        System.out.println("Number with maximum frequence:"+max_num);
    }
}
        
                
