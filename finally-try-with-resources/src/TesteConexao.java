public class TesteConexao {
    public static void main(String[] args) {

        try(Conexao conexao = new Conexao()){
            conexao.leDados();
        } catch (IllegalStateException ex){
            System.out.println(ex.getMessage());
            System.out.println("Deu erro");
        }

        //----------------------------------
//
//        Conexao con = null;
//        try {
//            con = new Conexao();
//            con.leDados();
//            con.close();
//        } catch (IllegalStateException ex){
//            System.out.println("Deu ruim na conexão");
//        } finally { //Sempre será executado
//            con.close();
//        }
    }
}
