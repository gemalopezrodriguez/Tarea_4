/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package daw_ed04_actividad;


public class Main {
    
    public static void main(String[] args) throws Exception {
        CCuenta cuentaUno;
        double saldoActual;

        cuentaUno = new CCuenta("Antonio López","1000-2365-85-1230456789",2500,0);
        saldoActual = cuentaUno.estado();
        System.out.println("El saldo actual es"+ saldoActual );

    
            operacuenta(cuentaUno);
        
    }

    private static void operacuenta(CCuenta cuentaUno) throws Exception {
        cuentaUno.retirar(2300);
        
        cuentaUno.ingresar(695);
    }
}
