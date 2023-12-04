package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasCondicionais06 {
    public static void main(String[] args) {
        // Utilizando switch e dados os valores de 1 a 7, imprima se é dia útil ou final de semana
        // Considerando 1 como domingo

        int dia = 0;

        switch (dia) {
            case 1:
                System.out.println("Final de semana");
                break;
            case 2:
                System.out.println("Dia de semana");
                break;
            case 3:
                System.out.println("Dia de semana");
                break;
            case 4:
                System.out.println("Dia de semana");
                break;
            case 5:
                System.out.println("Dia de semana");
                break;
            case 6:
                System.out.println("Dia de semana");
                break;
            case 7:
                System.out.println("Final de semana");
                break;
            default:
                System.out.println("input error");
                break;
        }
    }
}
