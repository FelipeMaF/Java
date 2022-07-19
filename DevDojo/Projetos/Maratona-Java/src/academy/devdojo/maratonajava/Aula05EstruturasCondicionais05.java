package academy.devdojo.maratonajava;

public class Aula05EstruturasCondicionais05 {
    public static void main(String[] args) {
    //Imprimindo dia da semana, considerando 1 domingo
        byte dia = 5;

        switch (dia) {

            default:
                System.out.println("Opção inválida");
                break;
            case 1:
                System.out.println("Domingo");
                break;
            case 2:
                System.out.println("Segunda");
                break;
            case 3:
                System.out.println("Terça");
                break;
            case 4:
                System.out.println("Quarta");
                break;
            case 5:
                System.out.println("Quinta");
                break;
            case 6:
                System.out.println("Sexta");
                break;
            case 7:
                System.out.println("Sábado");
                break;
        }
        //Aspas simples pois é char, se fosse String seria Aspas Duplas
        char genero = 'M';
        switch (genero){
            case 'M':
                System.out.println("Masculino");
                break;
            case 'F':
                System.out.println("Feminino");
                break;
            default:
                System.out.println("Inválido");
                break;
        }
    }
}
