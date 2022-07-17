package academy.devdojo.maratonajava;

public class Aula03TiposPrimitivosExercicios {
    public static void main(String[] args) {
        String nome = "Felipe";
        String endereco = "Montanhas de Mordor";
        double salario = 1750.55;
        String dataRecibimeto = "01/07/2022";
        String relatorio = "Eu "+nome+" morando no endereço "+endereco+" confirmo que recebi o salário de "+salario+", na data "+dataRecibimeto;

        System.out.println(relatorio);

        /* Eu poderia ter feito pelo sout como abaixo, porém criei uma String relatorio para ser mais exato
        System.out.println("Eu "+nome+" morando no endereço "+endereco+",");
        System.out.println("confirmo que recebi o salário de "+salario+", na data "+dataRecibimeto);
        */


    }

}
