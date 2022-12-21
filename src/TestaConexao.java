public class TestaConexao {
    
    public static void main(String[] args) {

        try(Conexao conexao  = new Conexao()){
                 conexao.LeDados();
        } catch(IllegalStateException ex){
            System.out.println("Deu erro na conexao");
        }

 // Testando alterações no GitHub '1

        //----------------------------------------------------

        //Conexao con = null;
        
        //try{
            //con = new Conexao();
          //  con.LeDados();
           
        //} catch(IllegalStateException ex){
          //  System.out.println("Deu erro na conexao");
        //} finally{
            //System.out.println("finnaly");

          //  if(con != null){
        //    con.fecha();
      //  }
    //}

    }

}
