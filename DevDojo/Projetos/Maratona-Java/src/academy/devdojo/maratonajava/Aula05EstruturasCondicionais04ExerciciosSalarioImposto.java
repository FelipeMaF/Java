package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais04ExerciciosSalarioImposto {
    public static void main(String[] args) {

        /*Até R$1.903,98	Isento	Isento
        De R$1.903,99 até R$2.826,65	7,5%	R$ 142,80
        De R$2.826,66 até R$3.751,05	15%	    R$ 354,80
        De R$3.751,06 até R$4.664,68	22,5%	R$ 636,13
        Acima de R$4.664,68	            27,5%	R$ 869,36   */

        double salario = 4000;

        if (salario <= 1903.98) {
            System.out.println("Isento Paga Nada !");
        }else if (salario >= 1903.99 && salario <= 2826.65) {
            System.out.println("Voce irá pagar "+salario/100*7.5+" de imposto");
        } else if (salario >= 2826.66 && salario <= 3751.05) {
            System.out.println("Voce irá pagar "+salario/100*15+" de imposto");
        } else if (salario >= 3751.06 && salario <= 4664.68) {
            System.out.println("Voce irá pagar "+salario/100*22.54+" de imposto");
        } else if (salario > 4664.68) {
            System.out.println("Voce irá pagar "+salario/100*27.5+" de imposto"); }
}
}