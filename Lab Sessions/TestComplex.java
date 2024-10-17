class Complex{
	private double real,imag;
	Complex(){}
	Complex(double real,double imag){
		this.real=real;
		this.imag=imag;
	}
	Complex(Complex c){
		this.real=c.real;
		this.imag=c.imag;
	}
	void printComplex(){
		System.out.println(real + "+" + imag + "i");
	}
	void addComplex(Complex c1,Complex c2){
		real=c1.real+c2.real;
		imag=c1.imag+c2.imag;
	}
	Complex subComplex(Complex c){
		Complex res=new Complex();
		res.real=this.real-c.real;
		res.imag=this.imag-c.imag;
		return res;
	}
}
public class TestComplex{
	public static void main(String []args){
		Complex c1=new Complex(2.5,5.8);
		Complex c2=new Complex(3.5,4.7);
		Complex c3=new Complex(c2);
		c3.printComplex();
		Complex res=new Complex();
		res.addComplex(c1,c2);
		res.printComplex();
		res=c1.subComplex(c2);
		res.printComplex();
	}
}