

package com.mycompany.atmproyecto1;
import java.util.Scanner;

public abstract class ATM {
    
    //Dispensador dispensadorObj = new Dispensador();
    //Pantalla pantallaObj = new Pantalla();
    //RanuraDeDeposito ranuraDeDepositoObj = new RanuraDeDeposito();
    //Teclado tecladoObj = new Teclado();
    private Dispensador dispensadorObj;
    private Pantalla pantallaObj;
    private RanuraDeDeposito ranuraDeDepositoObj;
    private Teclado tecladoObj;
    
    public ATM() {
        this.dispensadorObj = new Dispensador();
        this.pantallaObj = new Pantalla();
        this.ranuraDeDepositoObj = new RanuraDeDeposito();
        this.tecladoObj = new Teclado();

        //this.inicializar();
    
    }

    private void inicializar() {
        int numeroDeCuenta, nip;

        pantallaObj.mostrarMensaje("Bienvenido!");
        pantallaObj.mostrarMensaje("Ingrese su numero de cuenta: ");
        numeroDeCuenta = tecladoObj.recibirEntrada(); //resultado se le asig a la var num de cuenta

        pantallaObj.mostrarMensaje("Ingrese su NIP: ");
        nip = tecladoObj.recibirEntrada();
        //System.out.println("El numero de cuenta ingresado es : " + numeroDeCuenta);
        //Operaciones();
    
    }
    ///
    protected int Transaccion, Retiro, Deposito;
    private static int saldo;
    Scanner entrada = new Scanner(System.in);
    
    public void Operaciones() {
        int bandera = 0;
        int seleccion = 0;
        do{
        do {
            pantallaObj.mostrarMensaje("-------------------------------");
            pantallaObj.mostrarMensaje("MENU PRINCIPAL");
            pantallaObj.mostrarMensaje("1. Ver mi saldo");
            pantallaObj.mostrarMensaje("2. Retirar efectivo");
            pantallaObj.mostrarMensaje("3. Depositar efectivo");
            pantallaObj.mostrarMensaje("4. Salir");
            pantallaObj.mostrarMensaje("-------------------------------");
            seleccion = entrada.nextInt();

            if (seleccion >= 1 && seleccion <= 4) {
                bandera = 1;
            } else {
                pantallaObj.mostrarMensaje("---------------------------------------");
                pantallaObj.mostrarMensaje("Opcion no disponible, vuelva a intentar");  
                pantallaObj.mostrarMensaje("---------------------------------------");
            }
        } while (bandera == 0);
        
        if (seleccion == 1){
            ATM mensaje = new Consulta();
            mensaje.Transaccion();
           
        } else if(seleccion == 2){
            ATM mensaje = new Retiro();
            mensaje.Transaccion();
            
        } else if(seleccion == 3){
            ATM mensaje = new Deposito();
            mensaje.Transaccion();
        
        } else if(seleccion == 4){
                pantallaObj.mostrarMensaje("---------------------------------------");
                pantallaObj.mostrarMensaje("GRACIAS, VUELVA PRONTO ");
                pantallaObj.mostrarMensaje("---------------------------------------");
                bandera = 2;
            }
    } while(bandera !=2);

    }
    
    //Metodo para solicitar cant retiro
    public void Retiro(){
        Retiro = entrada.nextInt();
    }
    
    //Metodo para solicitar deposito
    public void Deposito(){
        Deposito = entrada.nextInt();
    }
    
    //metodo abstracto
    public abstract void Transaccion();
    
    //metodos setter y getter
    public int getSaldo(){
        return saldo;
    }
    
    public void setSaldo(int saldo){
    this.saldo = saldo;
    }

    ///
    public void depositar(int monto) {
    }

    public void acreditar(int monto) {
    }

    public void mostrarSaldo(int numeroDeCuenta) {
    }

    public void retirar(int monto) {
    }

    public void debitar(int monto) {
    }

    public boolean autenticar(int nip, int numeroDeCuenta) {
        return true;
    }
}



