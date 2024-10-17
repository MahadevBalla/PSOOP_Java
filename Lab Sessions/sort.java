import java.util.*;

interface Sortable{
 public void sort(int arr[]);
}

class BubbleSort implements Sortable{
 public void sort(int arr[]){
  for(int i=0; i<arr.length; i++){
   for(int j=0; j<arr.length-i-1; j++){
    if(arr[j]>arr[j+1]){
     int temp = arr[j];
     arr[j] = arr[j+1];
     arr[j+1] = temp;
    }
    }
    System.out.print("Sorted array after pass " + (i+1) + " : ");
    for(int z=0; z<arr.length; z++){
      System.out.print(arr[z] + "   ");
   }
   System.out.println();
  }
 }
}

class SelectionSort implements Sortable{
 public void sort(int arr[]){
  for(int i=0; i<arr.length-1; i++){  
   int temp=i;  
   for(int j=i+1; j<arr.length; j++){  
    if(arr[j]<arr[temp]){  
     temp=j; 
    }  
   }  
   int smaller = arr[temp];   
   arr[temp] = arr[i];  
   arr[i] = smaller;
   System.out.print("Sorted array after pass " + (i+1) + " : ");
    for(int z=0; z<arr.length; z++){
      System.out.print(arr[z] + "   ");  
  }  
 }
}

class sort{
 public static void main(String args[]){
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter the number of elements in the array : ");
  int x = sc.nextInt();
  int arr[] = new int[x];
  for(int i=0; i<x; i++){
  System.out.print("Enter element " + (i+1) + " : ");
  arr[i] = sc.nextInt();  
  }
  
  BubbleSort s1 = new BubbleSort();
  int arr2[] = arr;
  s1.sort(arr);
  System.out.print("Sorted Array(Bubble Sort) : ");
  print(arr);
  System.out.println();
  
  SelectionSort s2 = new SelectionSort();
  s2.sort(arr2);
  System.out.print("Sorted Array(Selection Sort) : ");
  print(arr2);
  System.out.println();
 }
 static void print(int arr[]){
  for(int i=0; i<arr.length; i++){
   System.out.print(arr[i] + "   ");
  }
 }
}
