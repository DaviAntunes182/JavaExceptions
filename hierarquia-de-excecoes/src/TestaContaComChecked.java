public class TestaContaComChecked {
    public static void main(String[] args) {
        Conta c = new Conta();

        try{//o método abaixo é perigoso, possui exceção
            c.deposita();
        }catch (MinhaException ex){
            System.out.println("Tratando...");
        }
    }
}
