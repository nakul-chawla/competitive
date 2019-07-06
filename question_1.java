import java.util.Scanner;

import java.util.*;
class question_1{
    static int minnumofSwaps(int arr[]){
        int num = 0;
        int c=0;
        int n=arr.length;
        for(int i=n-1;i>=0;i--){
            if(arr[i]==(i+1)){
                continue;
            }
            else if(arr[i-1]==(i+1)){
                num++;
                arr[i-1]=arr[i];
                arr[i] = i+1;
            }
            else if(arr[i-2]==(i+1)){
                num = num+2;
                arr[i-2]=arr[i-1];
                arr[i-1]=arr[i];
                arr[i]=(i+1);
            }else
                System.out.println("Too Chaotic");
        }
        return num;
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of inputs");
        int a=sc.nextInt();
        int b;
        int arr[][]=new int[a][];
        for(int i=0;i<a;i++)
        {
            System.out.println("Enter length of "+a+" array");
            b=sc.nextInt();
            arr[i] = new int[b];
            System.out.println("Enter the values");
            for(int j=0;j<b;j++){
                arr[i][j]=sc.nextInt();
            }
            System.out.println(minnumofSwaps(arr[i]));
        }
    }
}