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
public class Supervisor extends Funcionario {
    
    @Override
    
        public double getBonificacao(){ // copiando o metodo abstrato da classe mae funcionario 
        return super.getSalario()+500;
    }
}
