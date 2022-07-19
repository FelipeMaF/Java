package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais03 {
    public static void main(String[] args) {

        //Operador ternario

        double salario = 200;
        String mensagemDoar = "Eu vou doar 500 pro DevDojo sqn";
        String mensagemNaoDoar = "Ainda não tenho condições, mas vou ter";


        /*O Operador Ternário verifica uma condição e retorna um dentre dois valores pré-definidos em sua estrutura.
        Esta é uma notação chamada inline para as vezes em que seja necessário avaliar expressões e decidir por um dentre 2 valores.*/
        //Praticamente um if else na mesma linha.
        String resultado = salario > 500 ? mensagemDoar : mensagemNaoDoar;
        System.out.println(resultado);

        //Outro exemplo, com mais de 2 opções
        int idade = 16;
        String categoria;
        //É possivel fazer como abaixo, porém não indicado.
        categoria = idade < 15 ? "Categoria Infantil" : idade >= 15 && idade < 18 ? "Categoria Juvenil" : "Categoria Adulto";
        System.out.println(categoria);

    }
}
