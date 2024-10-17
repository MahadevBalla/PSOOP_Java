import java.util.*;

class Product{
 private String name, barcode;
 Product(String name, String barcode){
  this.name = name; this.barcode = barcode;
 }

 public String getName(){
  return name;
 }

 public String getBarcode(){
  return barcode;
 }
 
 void print(){
  System.out.println("Name of the product : " + name + "\nBarcode : " + barcode);
 }
}

class PrepackedFood extends Product{
 private double uPrice;
 private int qty;
 PrepackedFood(String name, String barcode, double uPrice, int qty){
  super(name,barcode);
  this.qty = qty;
  this.uPrice = uPrice; 
 }

 public double getuPrice(){
    return uPrice;
 }
 
 void print(){
  System.out.println("Name of the product : " + super.getName() + "\nBarcode : " + super.getBarcode() + "\nPrice per unit : " + uPrice + "\nTotal Price : " + (qty*uPrice));
 }
}

class FreshFood extends Product{
 private double pricepk, wt;

 FreshFood(String name, String barcode, double pricepk, double wt){
  super(name,barcode);
  this.wt = wt;
  this.pricepk = pricepk; 
 }

 public double getPricepk(){
  return pricepk;
 }
 
 void print(){
  System.out.println("Name of the product : " + super.getName() + "\nBarcode : " + super.getBarcode() + "\nWeight : " + wt + "\nPrice per kg : " + pricepk + "\nTotal Price : " + (wt*pricepk));
 }
}


class food {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  System.out.print("Enter number of products : ");
  int n = sc.nextInt();
  sc.nextLine();
  PrepackedFood p1[] = new PrepackedFood[n];
  FreshFood p2[] = new FreshFood[n];
  for(int i=0; i<n; i++){
    System.out.print("Enter details of product " + (i+1) + " -\nName : ");
    String name = sc.nextLine();
    System.out.print("Barcode : ");
    String barcode = sc.nextLine();
    System.out.print("Categorise the product -\n1. Prepacked Food\n2. Fresh Food\nEnter your choice : ");
    int x = sc.nextInt();
    switch(x){
        case 1: System.out.println("Price per unit : ");
                double uPrice = sc.nextDouble();
                System.out.println("Number of units : ");
                int qty = sc.nextInt();
                p1[i] = new PrepackedFood(name,barcode,uPrice,qty);
                break;

        case 2: System.out.println("Price per kilo : ");
                double pricepk = sc.nextDouble();
                System.out.println("Weight : ");
                double wt = sc.nextDouble();
                p2[i] = new FreshFood(name,barcode,pricepk,wt);
                break;

        default: System.out.println("Invalid input!!");
    }
  }

  System.out.println("Details of the products -");
  for(int j=0; j<p1.length; j++){
  p1[j].print();
  p2[j].print();
  }

  double min1 = p1[0].getuPrice();
  int m1 = 0;
  for(int j=0; j<p1.length; j++){
   if(p1[j].getuPrice()<min1){
    min1 = p1[j].getuPrice();
    m1 = j;
   }
  }
  
  double min2 = p2[0].getPricepk();
  int m2 = 0;
  for(int k=0; k<p2.length; k++){
   if(p2[k].getPricepk()<min2){
    min2 = p2[k].getPricepk();
    m2 = k;
   }
  }

  System.out.println("Details of cheapest Fresh Food -");
  p2[m2].print();
 }   
}