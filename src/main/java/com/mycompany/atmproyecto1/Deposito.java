/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproyecto1;


public class Deposito extends ATM {
    
    @Override
    public void Transaccion(){
        System.out.println("-------------------------");
        System.out.println("Cuanto deseas depositar: ");
        System.out.println("-------------------------");
        Deposito();
        
        Transaccion = getSaldo();
        setSaldo(Transaccion + Deposito);
        System.out.println("--------------------");
        System.out.println("Depositaste: "+Deposito);
        System.out.println("Tu saldo actual es: " +getSaldo());
        System.out.println("--------------------");
    }
}
