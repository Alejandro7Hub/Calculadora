import java.util.Scanner;

public class Principal {

	public static void main(String[] args) {
		Scanner teclado= new Scanner(System.in);
		double a;
		double b;
		System.out.println("Introduce el primer número ");
		a=teclado.nextDouble();
		System.out.println("Introduce el segundo número");
		b=teclado.nextDouble();
		claseObjeto objeto= new claseObjeto(a, b);
		int respuesta=0;
		do {
			menu();
			System.out.println("Escoge una opci�n");
			respuesta=teclado.nextInt();
			switch (respuesta) {
			case 1:
				objeto.suma(a, b);
				break;
			case 2:
				objeto.resta(a, b);
				break;
			case 3:
				objeto.multiplicacion(a, b);
				break;
			case 4:
				objeto.division(a, b);
				break;
			case 5:
				objeto.potenciacion(a, b);
				break;
			case 6:
				objeto.raizz(a, b);
				break;
			case 0:
				System.out.println("Fin Programa");
				break;
			default:
				System.out.println("ERROR");
				break;
			}
		} while (respuesta!=0);

	}

	private static void menu() {
		System.out.println("1.suma");
		System.out.println("2.resta");
		System.out.println("3.multiplicacion");
		System.out.println("4.division");
		System.out.println("5.potenciacion");
		System.out.println("6.Raiz");
		System.out.println("0.salir");
		
	}

}
