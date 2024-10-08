public class FluxoCatchGenerico {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch (Exception ex){
            System.out.println(ex.getMessage());
            ex.printStackTrace();
        }
        System.out.println("Fim do main");
    }
    public static void metodo1() throws MinhaException{
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2() throws MinhaException{
        System.out.println("Método 2");
        throw new NullPointerException("Nul exception");
//        System.out.println("Fim");
    }
}
