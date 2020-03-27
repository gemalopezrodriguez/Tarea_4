/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {
    
    public static void main(String[] args) {
        CCuenta cuentaUno;
        double saldoActual;

        cuentaUno = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaUno.estado();
        System.out.println("El saldo actual es"+ saldoActual );

        try {
            operacuenta(cuentaUno);
        } catch (Exception e) {
            System.out.print("Fallo al ingresar");
        }
    }

    private static void operacuenta(CCuenta cuentaUno) throws Exception {
        operacuenta(cuentaUno,2000);
    }

    private static void operacuenta(CCuenta cuentaUno, float cantidad) throws Exception {
        cuentaUno.retirar(300);
        cuentaUno.ingresar(300);
    }
}
