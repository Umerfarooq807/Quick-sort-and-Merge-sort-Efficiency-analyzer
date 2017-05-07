package algo11;

import java.util.Scanner;
import java.util.Random;

/**
 *
 * @author Umer Farooq
 */
public class Algo11 {

   static int m4=0,q=0;
  public static void main(String args[]) {
      
 {
     Random rand = new Random();


     
     Scanner scan = new Scanner( System.in );        
        System.out.println("Quick Sort / Merge sort Test\n");
        int n=5, i;
 
        System.out.println("Enter number of integer elements");
        n = scan.nextInt();
 
        int arr[] = new int[ n ];
 
  //      System.out.println("\nEnter "+ n +" integer elements");
          // System.out.println("\nElements after sorting usng Quick sort  ");        
        for (i = 0; i < n; i++)
            arr[i] = rand.nextInt(50) + 1;  
 
          System.out.println("\nunsorted generated numbers  ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+ " ");  
 
        float startTime = System.currentTimeMillis();
        sort(arr);
        float endTime   = System.currentTimeMillis();
float totalTime1 = endTime - startTime;
//System.out.println(totalTime);
       // System.out.print("\nQuick:"+q);
 
        System.out.println("\nElements after sorting usng Quick sort  ");        
        for (i = 0; i < n; i++)
            System.out.print(arr[i]+" \t");            
        System.out.println(); 
        
        float startTime2 = System.currentTimeMillis();
        Msort(arr, 0, n);
        float endTime2   = System.currentTimeMillis();
float totalTime2 = endTime2 - startTime2;
        
        System.out.println("\nElements after Merge sorting ");        
        for (i = 0; i < n; i++)
           
            System.out.print(arr[i]+" \t");            
        System.out.println(); 
        System.out.print("\nQuick sort Iterations:"+q+"\n");
        System.out.println("Quick sort Time:"+totalTime1+"\n");
        System.out.print("\nMerge sort  Iterations:"+m4+"\n");
        
        System.out.println("Merge Sort Time:"+totalTime2+"\n");
        
        if (q<m4)
        {
           System.out.println("Quick sort is better than Merge sort here"); 
        }
        else 
            System.out.println("Merge sort is better than Quick sort here"); 
            
            
    }   
    
        
       
    }

         
    public static void sort(int[] arr)
    {
        quickSort(arr, 0, arr.length - 1);
    }
 
    public static void quickSort(int arr[], int low, int high) 
    {
        int q1=0,q2=0;
        int i = low, j = high;
        int temp;
        int pivot = arr[(low + high) / 2];
 
 
        while (i <= j) 
        {
            while (arr[i] < pivot)
                i++;
                q2+=1;
            while (arr[j] > pivot)
                j--;
                q2+=1;
            if (i <= j) 
            {
 
                temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
 
                i++;
                j--;
                 q2+=1;   
//q1=i+j;
            }
            q2+=1;
            
        }
        q=q1+q2+q;
       // System.out.print("\nquicksort in this step: "+q1+"\n");
 
 
        if (low < j)
            quickSort(arr, low, j);
 
        if (i < high)
            quickSort(arr, i, high);
    }
 
   // public static void main(String[] args) 
   
    public static void Msort(int[] a, int low, int high) 
    {//int m4=0;
        int m1=0,m2=0;
        int N = high - low;         
        if (N <= 1) 
            return; 
        int mid = low + N/2; 
 
        Msort(a, low, mid); 
        Msort(a, mid, high); 
 
        int[] temp = new int[N];
        int i = low, j = mid;
        for (int k = 0; k < N; k++) 
        {
            m1+=1;
                    
            if (i == mid)  
                temp[k] = a[j++];
            else if (j == high) 
                temp[k] = a[i++];
            else if (a[j]<a[i]) 
                temp[k] = a[j++];
            else 
                temp[k] = a[i++];
        }    
        for (int k = 0; k < N; k++) 
        {a[low + k] = temp[k];
 
        }
        int m3=m1+m2;
         m4=m4+m3;
       // System.out.print("\nMerge in this step :"+m3+"\n");
    }
    
     //   System.out.print("\nMerge="+m4);
    /**
     * @param args the command line arguments
     */
             
}
