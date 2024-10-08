public class Fluxo {
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
        System.out.println("Inicio do método 2");
        throw new MinhaRuntimeException("Minha nossa senhora deu errado!");
//        System.out.println("Fim do método 2");
    }
}
