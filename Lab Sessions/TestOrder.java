import java.util.*;
class Order{
	static int cnt;
	int order_id;
	String item[];
	float price[];
	int qty[];
	Order(int o,String i[],float p[],int q[]){
		order_id=o;
		item=i;
		price=p;
		qty=q;
	}
	float calculateBill(){
		float o_total=0.0f;
		for(int i=0;i<item.length;i++){
			o_total+=price[i]*qty[i];
		}
		return o_total;
	}
	void test(){
		cnt++;
	}
	static void analyseOrders(Order orders[],float total){
			System.out.println("Order ids:");
			for(Order o:orders){
				if(o.calculateBill()>=total)
					System.out.println(o.order_id);
			}
		}
}
class TestOrder{
	public static void main(String []arg){
		int n;
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter no. of orders:");
		n=sc.nextInt();
		Order orders[]=new Order[n];
		for(int i=0;i<orders.length;i++){
			System.out.println("Enter no. of items:");
			int no=sc.nextInt();
			
			String it[]=new String[no];
			float p[]=new float[no];
			int q[]=new int[no];
			System.out.println("Order id:");
			int o_id=sc.nextInt();
			sc.nextLine();
			for(int j=0;j<no;j++){
				System.out.println("Item:");
				it[j]=sc.nextLine();
				System.out.println("Price:");
				p[j]=sc.nextFloat();
				System.out.println("Qty:");
				q[j]=sc.nextInt();
				sc.nextLine();
			}
			//create order
			orders[i]=new Order(o_id,it,p,q);
		}//i loop
		System.out.println("Enter total to check:");
		float total=sc.nextFloat();
		Order.analyseOrders(orders,total);//static method call	
	}
}