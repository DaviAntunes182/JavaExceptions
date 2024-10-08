public class Fluxo {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println("Inicio do método 1");
        metodo2();
        System.out.println("Fim do método 1");
    }

    public static void metodo2(){
        System.out.println("Inicio do método 2");
        for (int i = 0; i <= 5 ; i++) {
            System.out.println(i);
        }
        System.out.println("Fim do método 2");
    }
}
