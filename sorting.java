import java.util.*;
public class sorting {
    public static void main(String arge[]){
        int arr[]={1,5,9,2,7};
        int n=arr.length;
        //Bubble Sort
        // for(int i=0;i<n-1;i++){
        //     for(int j=i;j<n-i-1;j++){
        //         if(arr[j] > arr[j+1]){
        //             int temp=arr[j+1];
        //             arr[j+1] = arr[j];
        //             arr[j]=temp;
        //         }
        //     }
        // }

        //Selection Sort
        for(int i=0;i<n-1;i++){
            int mn=i;
            for(int j=i+1;j<n;j++){
                if(arr[mn]>arr[j]){
                    mn=j;
                }
            }
            int temp=arr[mn];
            arr[mn]=arr[i];
            arr[i]=temp;
        }

        for(int i=0;i<n;i++){
            System.out.print(arr[i] + " ");
        }



    }
    
}
