/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproyecto1;

/**
 *
 * @author User
 */
public class Retiro extends ATM {

    public Retiro() {
    }
    
    @Override
    public void Transaccion(){
        System.out.println("-----------------------");
        System.out.println("Cuanto deseas retirar: ");
        System.out.println("$20  $40  $60  $100  $200");
        System.out.println("-----------------------");
        Retiro();
        if(Retiro <= getSaldo() ){
            Transaccion = getSaldo();
            setSaldo(Transaccion - Retiro);
            System.out.println("-----------------------------");
            System.out.println("Retiraste :" + Retiro);
            System.out.println("Tu saldo actual es: "+getSaldo());    
            System.out.println("-----------------------------");
        } else {
            System.out.println("-----------------------");
            System.out.println("Saldo insuficiente. ");
            System.out.println("-----------------------");
        }
    }
    
}
