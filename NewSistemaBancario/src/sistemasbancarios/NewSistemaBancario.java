/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package sistemasbancarios;
import java.util.Scanner;
/**
 *
 * @author flavi
 */
public class NewSistemaBancario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        Conta minhaConta = new Conta();             //Criando Contas com propriedade dono e saldo
        Conta amigoConta = new Conta();
        
        minhaConta.dono = "Duke";                   // Declarando prorpiedades 
        minhaConta.saldo = 1000.0;
        amigoConta.dono2 = "Frank";
        amigoConta.saldo2 = 50.0;
        double sacar;  
        
                                
        //Conta de Duke
        System.out.println("Dono da conta: " + minhaConta.dono);
        System.out.println("Saldo atual: " + minhaConta.saldo);
        //Conta de Frank
        System.out.println("Dono da conta: " + amigoConta.dono2);
        System.out.println("Saldo atual: " + amigoConta.saldo2);
       
        System.out.println("Quanto voce deseja sacar");
        sacar = sc.nextDouble();
        minhaConta.saca(sacar, minhaConta.saldo);     
        
        System.out.println("Quanto amigo deseja sacar");
        sacar = sc.nextDouble();
        amigoConta.saca(sacar,amigoConta.saldo2);
        
        minhaConta.transferir(100,minhaConta.saldo,amigoConta.saldo2);
        
        //Criar depositar e receber
        
    
        
        //Conta.saca("Uma string qualquer");
       // System.out.println(Conta.saca(700.0,minhaConta.saldo ));

        
        
    }


    
}
