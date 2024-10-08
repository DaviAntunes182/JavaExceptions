public class MovendoTryCatch {
    public static void main(String[] args) {
        System.out.println("Inicio do main");
        metodo1();
        System.out.println("Fim do main");
    }
    public static void metodo1(){
        System.out.println("Inicio do método 1");
        try { //tente esse código
            metodo2();
        }catch (ArithmeticException ex){//Capture essas possíveis exceções
            System.out.println("Arithmetic Exception");
        }//Desta forma o fluxo é interrompido no momento do erro
        //e interrompe também o método que lançou o erro
        //pois volta ao fluxo normal apenas com o tratamento do erro

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
