
public class claseObjeto {
private double a;
private double b;
public claseObjeto(double a, double b) {
	super();
	this.a = a;
	this.b = b;
}
public double getA() {
	return a;
}
public void setA(double a) {
	this.a = a;
}
public double getB() {
	return b;
}
public void setB(double b) {
	this.b = b;
}
public void suma(double a, double b) {
	double suma;
	suma=a+b;
	System.out.println("La suma es "+suma);
}
public void resta(double a, double b) {
	double resta;
	resta=a-b;
	System.out.println("La resta es: "+resta);
	
}
public void multiplicacion(double a, double b) {
	double multiplicacion;
	multiplicacion=a*b;
	System.out.println("La multiplicacion es: "+multiplicacion);
}
public void division(double a, double b) {
	double division;
	division=a/b;
	System.out.println("La division es: "+division);
}
public void potenciacion(double a, double b) {
	System.out.println("La potencia de estos números es: "+Math. pow(a,b));
	Math. pow(a,b);
}
public void raizz(double a, double b) {
	System.out.println("La raiz de a: "+Math.sqrt(a));
	System.out.println("La raiz de b: "+Math.sqrt(b));
}
}
