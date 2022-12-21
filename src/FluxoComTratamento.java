public class FluxoComTratamento {

    public static void main(String[] args) {
        System.out.println("Ini do main");
         // o try é utilizado para executar um código que pode resultar em uma exceção
         try{

        metodo1(); // só pode ser chamado a partir de uma referencia, por isso deve ser static
        
        //devemos definir qual a exceção que será encontrada no catch
    } catch(ArithmeticException | NullPointerException ex){
        String msg = ex.getMessage();
        System.out.println("Exception " + msg);
            ex.printStackTrace(); //mostra o rastro da exceção
         } 

        System.out.println("Fim do main");
    }
   

    private static void metodo1() {
        System.out.println("Ini do metodo1");
       
        metodo2();
    
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() {
        System.out.println("Ini do metodo2");
        
        throw new ArithmeticException("deu errado"); // criando um objeto da classe e jogando em cima da pilha ao mesmo tempo
       
        // throw ex; //jogando a bomba em cima da pilha de metodos e so funciona com exceções 

       // System.out.println("Fim do metodo2");
    }
}