
package banco;

public class ContaCorrente extends Conta {

    ContaCorrente(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    ContaCorrente() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    @Override // A conta corrtente tem a taxa dobrada da taxa conta
    
    public void atualiza(double taxa){
        
        deposita(this.getSaldo() * (taxa*2));

} // fim atualiza
    
    public void deposita(double valor){
        
        super.deposita(valor - 1.00); // super chama o método da class mãe
   
    } // fm deposita    
}
