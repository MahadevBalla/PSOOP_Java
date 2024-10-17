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

 public double getAmt(){
  return qty*uPrice;
}
 
 @Override
 void print(){
  System.out.printf("%-25s %-25s %-25s %-25s %-25s\n" ,super.getName(), super.getBarcode(), uPrice, qty, (qty*uPrice));
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

 public double getAmt(){
  return wt*pricepk;
}

 @Override
 void print(){
  System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", super.getName(), super.getBarcode(), pricepk, wt, (wt*pricepk));
 }
}

class food1 {
 public static void main(String[] args) {
  Scanner sc = new Scanner(System.in);
  int x, qty, n1, n2, m1=0, m2=0; double uPrice, pricepk, wt, min1=0, min2=0;

  do{
    System.out.print("Enter number of prepacked food products : ");
    n1 = sc.nextInt();
    if(n1<0){
     System.out.println("Enter a valid input!!");
    }
  }
  while(n1<0);
  sc.nextLine();
  PrepackedFood p1[] = new PrepackedFood[n1];
  for(int i=0; i<n1; i++){
    System.out.print("Enter details of product " + (i+1) + " -\nName : ");
    String name = sc.nextLine();
    System.out.print("Barcode : ");
    String barcode = sc.nextLine();
    do{
     System.out.print("Price per unit : ");
     uPrice = sc.nextDouble();
     if(uPrice<=0){ System.out.println("Enter a valid input!!"); }
    }
    while(uPrice<=0);
    do{
     System.out.print("Number of units : ");
     qty = sc.nextInt();
     if(qty<=0){ System.out.println("Enter a valid input!!"); }
    }
    while(qty<=0);                
    p1[i] = new PrepackedFood(name,barcode,uPrice,qty);
    sc.nextLine();
  }

  do{
   System.out.print("Enter number of fresh food products : ");
   n2 = sc.nextInt();
   if(n2<0){
    System.out.println("Enter a valid input!!");
   }
  }
  while(n2<0);
  sc.nextLine();
  FreshFood p2[] = new FreshFood[n2];
  for(int i=0; i<n2; i++){
        System.out.print("Enter details of product " + (i+1) + " -\nName : ");
        String name = sc.nextLine();
        System.out.print("Barcode : ");
        String barcode = sc.nextLine();
        do{
         System.out.print("Price per kilo : ");
         pricepk = sc.nextDouble();
         if(pricepk<=0){ System.out.println("Enter a valid input!!"); }
        }
        while(pricepk<=0);
        do{
         System.out.print("Weight : ");
         wt = sc.nextDouble();
         if(wt<=0){ System.out.println("Enter a valid input!!"); }
        }
        while(wt<=0);
        p2[i] = new FreshFood(name,barcode,pricepk,wt);
        sc.nextLine();
      }

   if(n1>0){
    min1 = p1[0].getuPrice();  
    for(int j=0; j<n1; j++){
     if(p1[j].getuPrice()<min1){
      min1 = p1[j].getuPrice();
      m1 = j;
     }
    }
   }
   
   if(n2>0){
    min2 = p2[0].getPricepk();
    for(int k=0; k<n2; k++){
     if(p2[k].getPricepk()<min2){
      min2 = p2[k].getPricepk();
      m2 = k;
     }
    }
   }
   
   if(n1+n2>0){
    System.out.println("Details of the products -");
    System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per unit/kilo", "Number of units/Weight", "Total Price");
    for(int j=0; j<p1.length; j++){
    p1[j].print();  
    }
    for(int j=0; j<p2.length; j++){
     p2[j].print();  
    }
    
    if(n1>0){
      System.out.println("Details of cheapest prepacked food product -");
      System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per unit", "Number of units", "Total Price");
      p1[m1].print();
    }

    if(n2>0){
     System.out.println("Details of cheapest fresh food product -");
     System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per kilo", "Weight", "Total Price");
     p2[m2].print();
    }

    System.out.println("Details of cheapest food product product -");
    if(n1==0){
      System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per kilo", "Weight", "Total Price");
      p2[m2].print();     
    }
    else if(n2==0){
      System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per unit", "Number of units", "Total Price"); 
      p1[m1].print();
    }
    else{
      if(min1<min2){
        System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per unit", "Number of units", "Total Price"); 
        p1[m1].print();  
       }
       else if(min1==min2){
        System.out.println("Details of cheapest products are same as that of the above two!!");
       }
       else{
        System.out.printf("%-25s %-25s %-25s %-25s %-25s\n", "Name", "Barcode", "Price per kilo", "Weight", "Total Price");
        p2[m2].print();
       }
    }
   }  
 }
}