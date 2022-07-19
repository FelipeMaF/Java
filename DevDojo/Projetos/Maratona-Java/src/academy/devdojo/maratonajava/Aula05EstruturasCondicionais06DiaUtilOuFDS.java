package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais06DiaUtilOuFDS {
    public static void main(String[] args) {
// Utilizando switch e dados os valores de 1 a 7, imprima se é dia util ou final de semana
// Considerando 1 como domingo

        byte dia = 7;

        switch (dia){
            case 1:
                System.out.println("Hoje é Domingo, Final de semana");
                break;
            case 2, 3, 4, 5, 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Hoje é Sábado, Final de semana");
                break;
            default:
                System.out.println("Número Inválido");
                break;
        }


/* //Abaixo realizei o metodo que também dá certo
        byte dia = 7;

        switch (dia){
            case 1:
                System.out.println("Hoje é Domingo, Final de semana");
                break;
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
                System.out.println("Dia útil");
                break;
            case 7:
                System.out.println("Hoje é Sábado, Final de semana");
                break;
            default:
                System.out.println("Número Inválido");
                break;
        }
*/

    }
}
