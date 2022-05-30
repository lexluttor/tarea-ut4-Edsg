package cuentas;
/**
 * 
 * @author usuariodebian
 * @version 1.3
 * @see <a href = file:///home/usuariodebian/Desktop/Nuevo/GitCuentaEjemplo/tareaut4/doc/cuentas/CCuenta.html/> descripcion enlace </a>
 */
public class CCuenta {

	// parametros de la clase
    private String nombre;
    private String cuenta;
    private double saldo;
    private double tipoInterés;

/**
 * @param CCuenta constructor sin parametros
 */
    
    
    public CCuenta()
    {
    }
/**
 * @param constructor con parametros
 * @param nom
 * @param cue
 * @param sal
 * @param tipo
 */
    public CCuenta(String nom, String cue, double sal, double tipo)
    {
        setNombre(nom);
        setCuenta(cue);
        setSaldo(sal);
    }

/**
 * @param get estado
 * @return getSaldo
 */
    
    public double estado()
    {
        return getSaldo();
    }

/**
 * @param metodo ingresar con condicional decide si manda error o sino suma ingreso a total
 * @param cantidad parametro double a ingraser
 * @throws Exception indica error de ingreso
 */
    
    public void ingresar(double cantidad) throws Exception
    {
        if (cantidad<0)
            throw new Exception("No se puede ingresar una cantidad negativa");
        else setSaldo(getSaldo() + cantidad);
        System.out.println(cantidad);

        System.out.println("tu saldo actual es: " + getSaldo());

    }
/**
 * @param metodo retirar con condicional, 
 * @param cantidad
 * @throws Exception lanza error 
 */
    public void retirar(double cantidad) throws Exception
    {
        if (cantidad <= 0)
            throw new Exception ("No se puede retirar una cantidad negativa");
        if (estado()< cantidad)
            throw new Exception ("No se hay suficiente saldo");
        setSaldo(getSaldo() - cantidad);
        System.out.println("acabas de retirar de la cuenta: " + cantidad +" \n" + "tu saldo actual es: " + getSaldo());
    }


/**
 * @param getters y setters de los atributos de la clase
 * @return
 */
	public String getCuenta() {
		return cuenta;
	}

	public void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getTipoInterés() {
		return tipoInterés;
	}

	public void setTipoInterés(double tipoInterés) {
		this.tipoInterés = tipoInterés;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
