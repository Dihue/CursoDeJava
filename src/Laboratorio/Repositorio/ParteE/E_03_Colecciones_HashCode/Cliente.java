package Laboratorio.Repositorio.ParteE.E_03_Colecciones_HashCode;

public class Cliente {
	private String nombre;
	private String nroCuenta; // Como no vamos a realizar operaciones, es del tipo texto
	private double saldo;
	private int dni;


	// Constructor
	public Cliente(String nombre, String nroCuenta, double saldo, int dni) {
		this.nombre = nombre;
		this.nroCuenta = nroCuenta;
		this.saldo = saldo;
		this.dni = dni;
	}

	// Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getNroCuenta() {
		return nroCuenta;
	}

	public void setNroCuenta(String nroCuenta) {
		this.nroCuenta = nroCuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getDni() {
		return dni;
	}

	public void setDni(int dni) {
		this.dni = dni;
	}

	@Override
	public String toString() {
		return "Cliente [nombre= " + nombre +
			", nroCuenta= " + nroCuenta +
			", saldo= " + saldo +
			", dni= " + dni +']';
	}

	/*
	Método creado con el generador de código, el hashCode nos permitirá determinar si el
	objeto agregado a la colección es igual o repetido. Por ello en este tipo de colecciones
	HashSet no se permitirá elementos duplicados
	 */

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + dni;
		return result;
	}

	/*
	Método creado con el generador de código
	 */
	@Override
	public boolean equals(Object o) {
		if (this == o) {
			return true;
		}
		if (o == null || getClass() != o.getClass()) {
			return false;
		}
		Cliente cliente = (Cliente) o;
		return dni == cliente.dni;
	}
}
