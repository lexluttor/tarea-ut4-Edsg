package cuentas;

public class Main {

    public static void main(String[] args) {
		main(args, 0.0f);
	}

	public static void main(String[] args, float cantidad) {
        CCuenta cuenta1;
        double saldoActual;

        cuenta1 = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        
        operativa_cuenta(cuenta1);

        try {
            cuenta1.retirar(2.0f);
        } catch (Exception e) {
            System.out.print("Fallo al retirar \n");
        }
        try {
            System.out.println("Ingreso en cuenta ");
            cuenta1.ingresar(695);
            
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

	public static void operativa_cuenta(CCuenta cuenta1) {
		operativa_cuenta(cuenta1, 0.0f);
	}

	public static void operativa_cuenta(CCuenta cuenta1, float cantidad) {
		double saldoActual;
		saldoActual = cuenta1.estado();
        System.out.println("El saldo actual es "+ saldoActual );
	}

	



	
}
