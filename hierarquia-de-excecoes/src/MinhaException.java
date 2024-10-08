public class MinhaException extends Exception{
    //Exceptions fazem parte da categoria Checked,
    //Onde o compilador verifica se você tratou o método no catch ou
    //colocou assinatura no método que chama a exceção
    public MinhaException(String message) {
        super(message);
    }
}
