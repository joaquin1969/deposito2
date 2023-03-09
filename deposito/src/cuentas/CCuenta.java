package cuentas;
public class CCuenta {
	/**
	 * Clase CCuenta como la del banco y permite hacer ingresos y retiradas de dinero
	 * 
	 * @author IES Avellaneda
	 * @version 1 
	 */

    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

    /**
     * Constructor vacio, crea una cuenta vacia
     */
    public CCuenta()
    {
    }

    /**
     * Contructor
     * @param nom Nombre de la cuenta
     * @param cue Número de la cuenta
     * @param sal Saldo
     * @param tipo Tipo de interés
     */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }
    
    /**
     * Getter del saldo de la cuenta
     * @return Saldo
     */
    public double estado()
    {
        return getSaldo();
    }

    /**
     * Método para hacer un ingreso
     * @param cantidad a ingresar
     * @throws Exception No se puede ingresar cantidades negativas
     */
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        setSaldo(getSaldo() + cantidad);
    }

    /**
     * Método para hacer una retirada
     * @param cantidad a retirar
     * @throws Exception No se pueden retirar cantidades negativas
     */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
    }

    /**
     * Getter del nombre de la cuenta
     * @return nombre
     */
	private String getNombre() {
		return nombre;
	}

	/**
	 * Setter del nombre de la cuenta
	 * @param nombre
	 */
	private void setNombre(String nombre) {
		this.nombre = nombre;
	}

	/**
	 * Getter del número de la cuenta
	 * @return cuenta
	 */
	private String getCuenta() {
		return cuenta;
	}

	/**
	 * Setter del número de la cuenta
	 * @param cuenta
	 */
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	/**
	 * Getter del saldo
	 * @return saldo
	 */
	private double getSaldo() {
		return saldo;
	}

	/**
	 * Setter del saldo
	 * @param saldo
	 */
	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	/**
	 * Getter del tipo de interés
	 * @return tipoInterés
	 */
	private double getTipoInterés() {
		return tipoInterés;
	}

	/**
	 * Setter del tipo de interés
	 * @param tipoInterés
	 */
	private void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}
}
