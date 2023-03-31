public class CuentaBancaria {

	private double Saldo;
	private String NroCuenta;
	private String Titular;

	public CuentaBancaria(double montoInicial, String num, String nombre) {
		this.Saldo = montoInicial;
		this.NroCuenta = num;
		this.Titular = nombre;
	}

	public double getSaldo() {
		return Saldo;
	}

	public String getNroCuenta() {
		return NroCuenta;
	}

	public String getTitular() {
		return Titular;
	}

	public void setSaldo(double Saldo) {
		this.Saldo = Saldo;
	}

	public void setNroCuenta(String NroCuenta) {
		this.NroCuenta = NroCuenta;
	}

	public void setTitular(String Titular) {
		this.Titular = Titular;
	}

	public void depositar(double cantidad) {
		if (cantidad > 0) {
			Saldo += cantidad;
		}
	}

	public void retirar(double cantidad) {
		if (Saldo > cantidad) {
			Saldo -= cantidad;
		}
	}

	public double obtenerSaldo() {
		return Saldo;
	}
}
