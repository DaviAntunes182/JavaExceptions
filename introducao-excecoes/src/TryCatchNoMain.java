public class TryCatchNoMain {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        try {
            metodo1();
        }catch (ArithmeticException ex){
            String msg = ex.getMessage();
//            System.out.println("Arithmetic Exception " + msg);
            ex.printStackTrace(); // Pode-se chamar o stack trace
        }//Desta forma o código é interrompido no momento do erro
        //e volta ao fluxo natural a partir do tratamento da exceção
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
            //Quando ocorrem exceções, essas mudam o fluxo
            //de nossas aplicações, devemos tratá-las
            int a = i / 0;
        }
        System.out.println("Fim do método 2");
    }
}
