public class FluxoException {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch (ArithmeticException | NullPointerException | MinhaException ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    public static void metodo1() throws MinhaException {
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    //Se formos usar uma Exception devemos colocar na assinatura do método
    public static void metodo2() throws MinhaException {
        System.out.println("Inicio do método 2");
        throw new MinhaException("Minha nossa senhora deu errado!");
//        System.out.println("Fim do método 2");
    }
}
