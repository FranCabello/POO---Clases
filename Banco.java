public class Banco {

	public class Cliente {
		private String nombre;
		private String apellidos;
		private String dni;

		public String nombreCompleto() {
			return nombre + " " + apellidos + " " + dni;
		}

		public void nombreCompleto2() {
			System.out.println(nombre + " " + apellidos + " " + dni);
		}
	}

	public class CuentaBancaria {
		private String numero;
		private double saldo;
		private Cliente titular;

		public void ingreso(double cantidad) {
			if (cantidad > 0) {
				saldo += cantidad;
			}
		}

		public void reintegro(double cantidad) {
			if (saldo > cantidad) {
				saldo -= cantidad;
			}
		}
	}

}