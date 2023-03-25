/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.atmproyecto1;

public class ATMProyecto1 {

    public static void main(String[] args) {
        
         // TODO code application logic here
        /*
        Teclado teclado1 = new Teclado();
        ATM atm = new ATM(teclado1);
        */
        /*
        Cuenta obj = new Cuenta();
        obj.consultar();
        obj.consultar(123);
        obj.consultar("Miguel", 123);
        */
        //obj.numeroDeCuenta = 234;
        //obj.setNumeroDeCuenta(100000);
        /*
        Deposito depositoObj = new Deposito();
        depositoObj.setMonto(12);
        depositoObj.getMonto();
        depositoObj.ejecutar();

        Retiro retiroObj = new Retiro();
        retiroObj.setMonto(12);
        retiroObj.getMonto();
        retiroObj.ejecutar();

        OtraTransaccion otraTransaccionObj = new OtraTransaccion();
        otraTransaccionObj.setMonto(12);
        otraTransaccionObj.getMonto();
        otraTransaccionObj.ejecutar();
*/
        /*
        Retiro retiroObj = new Retiro();
        //retiroObj.ejecutar();
        
        Transaccion transaccionObj1 = new Deposito();
        Transaccion transaccionObj2 = new Retiro();
        
        transaccionObj1.ejecutar();
        transaccionObj2.ejecutar();
        
        Retiro [] arregloRetiros = new Retiro[2];
        arregloRetiros[0] = new Retiro();
        arregloRetiros[1] = new Retiro();
        
        Transaccion [] arregloTransaccion = new Transaccion[2];
        arregloTransaccion[0] = new Retiro();
        arregloTransaccion[1] = new Deposito();
        
        Cuenta cuentaObj = new Cuenta();
        cuentaObj.consultar(new Retiro());
        cuentaObj.consultar(new Deposito());
        */
        
        //Pantalla pantallaObj = new Pantalla();
        //pantallaObj.mostrarMensaje("Hola mundo");
        
        
        ATM mensaje = new Consulta();
        mensaje.setSaldo(500);
        mensaje.Operaciones(); 
    }
}
