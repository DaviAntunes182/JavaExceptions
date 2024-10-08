//RuntimeException faz parte da categoria Unchecked
public class MinhaRuntimeException extends RuntimeException{

    //Herda o contrutor com message da Classe super
    public MinhaRuntimeException(String message) {
        super(message);
    }
    /*
    Por que não extender diretamente a classe Exception ou Trowable?

    Exceptions requerem que deixemos explicíto na assinatura do método
    utilizaremos a exceção que estamos lançando esta exceção
        public void metod() throw Exception(){
        }
     */
}
