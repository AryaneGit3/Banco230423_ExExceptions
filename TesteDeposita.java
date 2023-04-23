
package banco;

public class TesteDeposita {
    
    public static void main(String[] args) {
        
        Conta cp = new ContaPoupanca(200.00);
        
       try{
            cp.deposita(100);
            
        }catch 
            (IllegalArgumentException excep){
             System.out.println(excep.getMessage());
    }
        
    }
    
}
    
