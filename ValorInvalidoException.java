
package banco;

public class ValorInvalidoException extends Exception {
    
    

    public ValorInvalidoException(double valor) throws ValorInvalidoException{
        
        if(valor<0){
            throw new ValorInvalidoException(valor);
        }
        
}

}