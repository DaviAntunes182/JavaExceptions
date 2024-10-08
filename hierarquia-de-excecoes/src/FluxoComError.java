public class FluxoComError {
    //Testando um Erros(que não são exceções) da JVM
    //Erro StackOverFlow -> A pilha tem um limite de métodos que podem ser
    //executados
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaRuntimeException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2(){
        System.out.println("Método 2");
        metodo2();
        System.out.println("Fim método 2");
    }
}
