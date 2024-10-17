import java.util.*;

interface Volume {
	public double getVolume(double h, double r);    
}

interface SurfaceArea {
	public double getSurfaceArea(double h, double r);    
}

class Cylinder implements Volume, SurfaceArea{
 
	@Override
	public double getVolume(double h, double r){
    	return Math.PI*r*r*h;
	}

	@Override
	public double getSurfaceArea(double h, double r){
    	return 2*(Math.PI*r*h + Math.PI*r*r);
	}
}

class Cone implements Volume, SurfaceArea{

	@Override
	public double getVolume(double h, double r){
    	return (Math.PI*r*r*h)/3;
	}

	@Override
	public double getSurfaceArea(double h, double r){
    	return (Math.PI*r*r) + (Math.PI*r*Math.sqrt(r*r + h*h));
	}

}

class Sphere implements Volume, SurfaceArea{

	@Override
	public double getVolume(double h, double r){
    	return 4*Math.PI*r*r;
	}

	@Override
	public double getSurfaceArea(double h, double r){
    	return (4*Math.PI*r*r*r)/3;
	}

}

class shapes{
	public static void main(String[] args){
    	Scanner sc = new Scanner(System.in);
    	double h, r; int x=0;
    	do{
        	System.out.print("1. Cylinder\n2. Cone\n3. Sphere\n4. Exit\nEnter your choice : ");
        	x = sc.nextInt();
        	switch(x){
            	case 1: System.out.println("Enter the dimensions of the cylinder -");
                    	do{
                        	System.out.print("Height : ");
                        	h = sc.nextDouble();
                        	if(h<0){
                            	System.out.println("Enter a valid input!!");
                        	}
                    	}
                    	while(h<0);
                    	do{
                        	System.out.print("Radius : ");
                        	r = sc.nextDouble();
                        	if(r<0){
                            	System.out.println("Enter a valid input!!");
                        	}
                    	}
                    	while(r<0);
           	 
                    	Cylinder s1 = new Cylinder();
                    	System.out.printf("Surface area : %.2f\n", s1.getSurfaceArea(h,r));
                    	System.out.printf("Volume : %.2f\n", s1.getVolume(h, r));
                    	break;

            	case 2: System.out.println("Enter the dimensions of the cone -");
                    	do{
                        	System.out.print("Height : ");
                        	h = sc.nextDouble();
                        	if(h<0){
                            	System.out.println("Enter a valid input!!");
                        	}
                    	}
                    	while(h<0);
                    	do{
                        	System.out.print("Radius : ");
                        	r = sc.nextDouble();
                        	if(r<0){
                            	System.out.println("Enter a valid input!!");
                        	}
                    	}
                    	while(r<0);
           	 
                    	Cone s2 = new Cone();
                    	System.out.printf("Surface area : %.2f\n", s2.getSurfaceArea(h,r));
                    	System.out.printf("Volume : %.2f\n", s2.getVolume(h, r));
                    	break;

            	case 3: System.out.println("Enter the dimensions of the sphere -");
                    	do{
                        	System.out.print("Radius : ");
                        	r = sc.nextDouble();
                        	if(r<0){
                            	System.out.println("Enter a valid input!!");
                        	}
                    	}
                    	while(r<0);
           	 
                    	Sphere s3 = new Sphere();
                    	System.out.printf("Surface area : %.2f\n", s3.getSurfaceArea(0,r));
                    	System.out.printf("Volume : %.2f\n", s3.getVolume(0, r));
                    	break;

            	case 4: System.out.println("Thank you!!");
                    	break;

            	default: System.out.println("Enter a valid input!!");
        	}
    	}
    	while(x!=4);  
	}    
}