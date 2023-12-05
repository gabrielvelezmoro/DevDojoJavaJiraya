package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 3;

        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 7:
                System.out.println("Dia de semana");
                break;
            case 3:

            case 4:

            case 5:

            case 6:
                System.out.println("Dia de semana");
                break;
            default:
                System.out.println("input error");
                break;
        }
    }
}
