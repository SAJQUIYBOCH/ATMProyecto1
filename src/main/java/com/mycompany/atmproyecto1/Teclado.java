/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atmproyecto1;

/**
 *
 * @author User
 */
import java.util.Scanner;


public class Teclado {
    private Scanner scan; //selec import para add import java.util.Scanner;
    
    public Teclado(){
        scan = new Scanner(System.in);
    }
    //declarando metodo:
    public int recibirEntrada() {
       return scan.nextInt(); //retorno capturando datos y convirtiendo a un entero
    
    }
}
