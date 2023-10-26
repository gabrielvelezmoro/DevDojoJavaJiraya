package academy.devdojo.maratonajava.introducao;

public class Aula04Operadores {
    public static void main(String[] args) {
        // + - / *
        int numero01 = 10;
        int numero02 = 20;
        double resultado = numero01 / (double) numero02;
        System.out.println("valor: "+resultado );

        // %
        int resto = 21 % 2;
        System.out.println(resto );

        // < > <= >=  == !=

        boolean isDezMaiorQueVinte = 10 > 20;
        boolean isDezMenorQueVinte = 10 < 20;
        boolean isDezMaiorIgualAVinte = 10 >= 20;
        boolean isDezMenorIgualAVinte = 10 <= 20;
        boolean isDezIgualVinte = 10 == 20;
        boolean isDezIgualDez = 10 == 20;
        boolean isDezDiferentelDez = 10 != 20;
        System.out.println("isDezMaiorQueVinte "+isDezMaiorQueVinte);
        System.out.println("isDezMenorQueVinte "+isDezMenorQueVinte);
        System.out.println("isDezIgualVinte "+isDezIgualVinte);
        System.out.println("isDezIgualDez "+isDezIgualDez);
        System.out.println("isDezDiferentelDez "+isDezDiferentelDez);
        System.out.println("isDezMaiorIgualAVinte "+isDezMaiorIgualAVinte);
        System.out.println("isDezMenorIgualAVinte "+isDezMenorIgualAVinte);
    }
}
