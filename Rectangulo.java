public class Rectangulo {

	private double Largo;
	private double Ancho;

	public Rectangulo(double lar, double anc) {
		this.Largo = lar;
		this.Ancho = anc;
	}

	public double getLargo() {
		return Largo;
	}

	public double getAncho() {
		return Ancho;
	}

	public void setLargo(double Largo) {
		this.Largo = Largo;
	}

	public void setAncho(double Ancho) {
		this.Ancho = Ancho;
	}

	public double Area() {
		return Largo * Ancho;
	}

	public double Perimetro() {
		return 2 * Largo + 2 * Ancho;
	}
}