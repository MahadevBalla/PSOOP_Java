import java.util.*;

class shoppingCart{

 void calc(double arr[][][]){
  
  double ptotal=0, total=0, temp=0, costliest=0; int x=0;
  for(int i=0; i<arr.length; i++){
  double p=0, np=0;
   for(int j=0; j<arr[i].length; j++){
    for(int k=0; k<arr[i][j].length; k++){
     if(j==0){ 
      p += arr[i][j][k];
      ptotal += arr[i][j][k];
      }
     if(j==1){
      if(temp<arr[i][j][k]){
       temp = arr[i][j][k];
       x=i+1;
      }
      np += arr[i][j][k];
      }
     total += arr[i][j][k];
    }
    if(j==0){System.out.println("Total cost of perishable items in cart " + (i+1) + " : " + p);}
    if(j==1){System.out.println("Total cost of non-perishable items in cart " + (i+1) + " : " + np);}
   }
   System.out.println("Total cost of cart " + (i+1) + ": " + total);
   //System.out.println("Value of costliest non-perishable item sold in cart " + (i+1) + " : " + temp);  
  }
  System.out.println("Total cost of perishable items in all carts : " + ptotal);
  System.out.println("Costliest non-perishable item was sold in cart " + x + ".Its value is : " + temp + "");
 }
}

class shop {
public static void main(String []args){
 
 Scanner sc = new Scanner(System.in);
 System.out.print("Enter number of carts : ");
 int c = sc.nextInt();
 double cart[][][] = new double[c][2][];
 for(int i=0; i<cart.length; i++){
  for(int j=0; j<cart[i].length; j++){
   if(j==0){    
    System.out.print("Enter no. of perishable items in cart " + (i+1) + " : ");
    int x = sc.nextInt();
    cart[i][j] = new double[x];
    //System.out.println("Enter cost of items purchased : ");
  for(int k=0; k<cart[i][j].length; k++){
    System.out.print("Enter cost of item " + (k+1) + " : ");
    cart[i][j][k] = sc.nextDouble();
   }
   }
  if(j==1){
   System.out.print("Enter no. of non-perishable items in cart " + (i+1) + " : ");
   int y = sc.nextInt();
   cart[i][j] = new double[y];
   //System.out.println("Enter cost of items purchased : ");
   for(int l=0; l<cart[i][j].length; l++){
     System.out.print("Enter cost of item " + (l+1) + " : ");
     cart[i][j][l] = sc.nextDouble();
    }
   }
  }
 }
 
 shoppingCart a = new shoppingCart();
 a.calc(cart);
}
}
