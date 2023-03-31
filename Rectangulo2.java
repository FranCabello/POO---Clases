import java.util.Scanner;

public class Rectangulo2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Rectangulo R;
		double L;
		double A;

		System.out.println("Suministre a continuación los valores para el largo y el ancho: ");
		L = sc.nextDouble();
		A = sc.nextDouble();
		R = new Rectangulo(L, A);

		System.out.println("Resultados de los cálculos: ");
		System.out.println("Área: " + R.Area() + " - Perímetro: " + R.Perimetro());

		sc.close();

	}
}