public class FluxoComErro {

    public static void main(String[] args) {
        System.out.println("Ini do main");
         // o try é utilizado para executar um código que pode resultar em uma exceção
         try{

        metodo1(); // só pode ser chamado a partir de uma referencia, por isso deve ser static
        
        //devemos definir qual a exceção que será encontrada no catch
    } catch(Exception ex){
        String msg = ex.getMessage();
        System.out.println("Exception " + msg);
            ex.printStackTrace(); //mostra o rastro da exceção
         } 

        System.out.println("Fim do main");
    }
   

    private static void metodo1() throws MinhaExcecao{
        System.out.println("Ini do metodo1");
       
        metodo2();
    
        System.out.println("Fim do metodo1");
    }

    private static void metodo2() throws MinhaExcecao{ //o uso do throws diretamente é um exemplo de categoria checked
        System.out.println("Ini do metodo2");
        
        throw new MinhaExcecao("Deu muito errado");

       // System.out.println("Fim do metodo2");
    }
}