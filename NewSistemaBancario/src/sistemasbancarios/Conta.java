/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sistemasbancarios;

/**
 *
 * @author flavi
 */

class Conta {
    String dono;                    //prorpiedades
    double saldo;
    String dono2;                    //prorpiedades
    double saldo2;
    
    
    
   public void saca(double x, double debito){
        if(x > debito){
            System.out.println("Saldo da conta insuficiente");
        }
        else if(x <= 0){
            System.out.println("Voce nao pode sacar um valor 0 ou abaixo de 0");
        }
        else{
            debito -= x;
            System.out.println("Voce sacou: $" + x);
            System.out.println("Novo saldo da sua conta: $" +debito);
        }
    }
    


    public void transferir(double valor,double conta1,double conta2){
        //Receber o valor a ser debitado da conta conta1 e ser tranferido para a conta2 
        if(conta1 < valor){
            System.out.println("Nao a saldosuficiente para que possa fazer a transacao");
        } 
        else if(valor <=0){
            System.out.println("Voce nao pode sacar um valor 0 ou abaixo de 0");
        }else{
            conta1 -= valor;
            conta2 += valor;  
            System.out.println("Conta " + conta1+ " Debitou :$" + valor);
            System.out.println("Conta " + conta2+ " recebeu :$" + valor);    

}
    }

    void transferir(int i, Conta minhaConta, double saldo) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
}
/*class Conta {

  public static double saca(double quantidade,double saldo){
    double novoSaldo = 0;
   
    novoSaldo = saldo - quantidade; 
    
    return novoSaldo;
    
}

    String dono;
    double saldo;
    
    
    void saca(double quantidade){
        double novoSaldo = this.saldo - quantidade; 
        this.saldo = novoSaldo;
        System.out.println("OKkkk");
    }
}*/
    

