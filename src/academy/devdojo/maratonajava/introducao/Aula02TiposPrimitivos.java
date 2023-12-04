package academy.devdojo.maratonajava.introducao;

public class Aula02TiposPrimitivos {
    public static void main(String[] args) {
        //int, double, float, char, byte, short, long, boolean
        int idade = (int) 10000000000L;
        long numeroGrande = (long) 155.00;
        double salarioDouble = 2000.0D;
        float salarioFloat = (float) 2500.0D;
        byte idadeByte = 127;
        short idadeShort = 32000;
        boolean verdadeiro = true;
        boolean falso = false;
        char caractere = '\u0041';
        String nome = "Goku";

        System.out.println("a idade é " + idade + " anos");
        System.out.println(false);
        System.out.println(caractere);
        System.out.println(idade);
        System.out.println("salario float: " + salarioFloat);
        System.out.println("numero grande: " + numeroGrande);
        System.out.println("Oi, meu nome é" + nome);
    }
}
