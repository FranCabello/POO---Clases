import java.util.Scanner;

public class Rectangulo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangulo R;
		double L;
		double A;

		System.out.println("Suministre a continuaci�n los valores para el largo y el ancho: ");
		L = sc.nextDouble();
		A = sc.nextDouble();
		R = new Rectangulo(L, A);

		System.out.println("Resultados de los c�lculos: ");
		System.out.println("�rea: " + R.Area() + " - Per�metro: " + R.Perimetro());

		sc.close();

	}
}