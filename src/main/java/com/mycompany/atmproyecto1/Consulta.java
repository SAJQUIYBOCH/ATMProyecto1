/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproyecto1;

public class Consulta extends ATM {
   
    @Override
    public void Transaccion (){
        System.out.println("-----------------------------");
        System.out.println("Tu saldo actual es: "+getSaldo());
        System.out.println("-----------------------------");
    }
}
