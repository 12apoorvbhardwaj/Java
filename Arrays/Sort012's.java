import java.util.*;
public class Sort012
{ 
    /* 
    public static void sort012(int a[], int n)
    {
        int c0=0,c1=0,c2=0;
        for(int i = 0; i < n; i++)
        {
            if(a[i] == 0){
                c0++;
            }
            if(a[i] == 1){
                c1++;
            }
            if(a[i] == 2){
                c2++;
            }
        }
        for(int i=0;i<c0;i++){
            System.out.print(0+" ");
        }
        
        for(int i=0;i<c1;i++){
            System.out.print(1+" ");
        }
        
        for(int i=0;i<c2;i++){
            System.out.print(2+" ");
        }
    }
    */

    static void printArr(int arr[], int n)
    {
        for (int i = 0; i < n; i++)
            System.out.print(arr[i] + " ");
    }
  
   
    static void sortArr(int arr[], int n)
    {
        int i, c0 = 0, c1 = 0, c2 = 0;
        for (i = 0; i < n; i++) {
            switch (arr[i]) {
            case 0:
                c0++;
                break;
            case 1:
                c1++;
                break;
            case 2:
                c2++;
                break;
            }
        }
        i = 0;
        while (c0 > 0) {
            arr[i++] = 0;
            c0--;
        }
        while (c1 > 0) {
            arr[i++] = 1;
            c1--;
        }
        while (c2 > 0) {
            arr[i++] = 2;
            c2--;
        }

        printArr(arr, n);
    }

    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        int []a = new int[20];
        int l = sc.nextInt();
        for(int i=0;i<l;i++){
            a[i]=sc.nextInt();
        }
        sortArr(a, l);
        sc.close();
    }
}
