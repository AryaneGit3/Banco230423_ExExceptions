/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package banco;

/**
 *
 * @author aryan
 */
public class testeConstrutor {
    public static void main(String[] args) {
        Conta x = new ContaPoupanca();
        Conta y = new ContaCorrente(6000);
        Conta z = new ContaPoupanca(500, 9173);
        System.out.println("Saldo conta Z = "+z.getSaldo());
        System.out.println("Numero conta Z = "+z.getNumero());
        System.out.println("Total de contas:"+x.getTotalDeContas());
    }
    
}