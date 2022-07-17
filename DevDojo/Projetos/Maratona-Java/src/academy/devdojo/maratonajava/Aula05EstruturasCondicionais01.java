package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {

        // Estruturas Condicionais: IF "se"
        int idade = 18;
        boolean isAutorizadoComprarBebida = idade >= 18;

        if (isAutorizadoComprarBebida) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }

        //Usando o ! (NOT) que seria o contrário, pois ainda não vimos Else.
        if (!isAutorizadoComprarBebida) {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }

        //==========================================

        //Utilizando ELSE (senão)
        // Estruturas Condicionais: IF "se"
        int idade2 = 10;
        boolean isAutorizadoComprarBebida2 = idade2 >= 18;

        if (isAutorizadoComprarBebida2) {
            System.out.println("Autorizado a comprar bebida alcólica");
        }else {
            System.out.println("Não Autorizado a comprar bebida alcólica");
        }
        /*Por que usar ELSE ?: Resumindo brevemente, porque se usar mais de um IF, quando executar o código, independente
        atende ou não a condição, ele será lido, já o else não é lido se atender ao IF. */

    }
}
