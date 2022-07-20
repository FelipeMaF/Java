package academy.devdojo.maratonajava;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int count = 0;

        //while só executa se a condição for verdadeira
        while (count < 10) {
            System.out.println(count++);
        }

        // do while, executa uma vez, e depois confere a condição
        count = 7;
        do {
            System.out.println("dentro do do-while" + ++count);
        } while (count < 10);

        // for, serve para conferir indices, listas etc, laço de repetição
        for (int i = 0; i < 10; i++) {
            System.out.println("For " + i);
        }


    }
}
