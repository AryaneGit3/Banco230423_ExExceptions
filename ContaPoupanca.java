
package banco;

public class ContaPoupanca extends Conta{

    ContaPoupanca(int i, int i0) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ContaPoupanca() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ContaPoupanca(double d) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   @Override
    public void atualiza(double taxaSelic) {
       deposita(getSaldo()*(taxaSelic*3));
    }
    
    @Override
    public void deposita(double valor){
        
         if(valor < 0){
            //throw new IllegalArgumentException();
            throw new IllegalArgumentException("Voce tentou depositar um valor negativo!");
            
        }else{
            this.saldo += valor - 0.10;
           
        
    }
}
}


    

