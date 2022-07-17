package academy.devdojo.maratonajava;

public class Aula04Operadores {
    public static void main(String[] args) {

        //===============================================

        // Operadores aritmeticos: + - / * e %
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;

        System.out.println(resultado);
    /*neste caso o resultado correto seria 0.5
    porém quando as duas variaveis da operação são declaradas como "int"
    então a variavel de retorno entende que o resultado será int tmb
    Para corrigir isso, deveria trocar uma das duas variaveis "int" para "double"
    ou fazer um cast forçando a variavel virar outra dentro dela mesmo assim como fiz no
    exercicio acima inserindo (double) numero02; na variavel int.
     */

        // %   Mostra o resto da divisão, 0 ou 1
        int resto = 21 % 7;
        System.out.println(resto);

        //===============================================

        // Operadores Relacionais: < > <= >= == !=
        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 10;
        boolean isDezDiferenteDez = 10 != 10;

        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferenteDez "+isDezDiferenteDez);

        //===============================================

        // Operadores Lógicos: && (AND), || (or), ! (NOT)

        // Exemplo de && (AND)
        int idade = 29;
        float salario = 3500F;
        boolean isDentroDaLeiMaiorQueTrinta = idade >= 30 && salario >= 4612;
        boolean isDentroDaLeiMenorQueTrinta = idade < 30 && salario >= 3381;

        System.out.println("isDentroDaLeiMaiorQueTrinta "+isDentroDaLeiMaiorQueTrinta);
        System.out.println("isDentroDaLeiMenorQueTrinta "+isDentroDaLeiMenorQueTrinta);


        // Exemplo de || (OR)
        double valorTotalContaCorrente = 200;
        double valorTotalContaPoupanca = 10000;
        float valorPlaystation = 5000F;
        boolean isPlaystationCincoCompravel = valorTotalContaCorrente > valorPlaystation || valorTotalContaPoupanca > valorPlaystation;
        System.out.println("isPlaystationCincoCompravel "+isPlaystationCincoCompravel);

        //===============================================

        // Operadores de Atribuição: = += -= *= /= %= ++ --

        // Exemplo de = += -= *= /= %=
        double bonus = 1800; // 1800
        bonus += 1000; // 2800
        bonus -= 1000; // 800
        bonus *= 2; // 3600
        bonus /= 2; // 900
        bonus %= 2; // 0.0
        System.out.println(bonus);

        // Exemplo de ++ --
        int contador = 0;
        contador += 1; // contador = contador +1
        contador++; // contador = contador +1
        contador--; // contador = contador +1
        ++contador; // contador = contador +1
        --contador; // contador = contador +1
        System.out.println(contador);

        //Diferença de por o operador ++ ou -- antes ou depois da variavel.
        int contador2 = 0;
        int contador3 = 0;
        System.out.println(contador2++);//o resultado será 0 pois primeiro ele imprime conforme a instrução que é dar print e depois ele adicionar +1
        System.out.println(contador2);//o resultado será 1 pois ele já imprimiu e após foi adicionado o +1.

        System.out.println(++contador3);//o resultado será 1, pois primeiro ele adicionou o operador para depois imprimir


    }
}
