package academy.devdojo.maratonajava.introducao;

public class Aula05EstruturasCondicionais01 {
    public static void main(String[] args) {
        int idade = 12;
        boolean isAutorizadoComprarBebidas = idade >= 18;

        if (isAutorizadoComprarBebidas != false) {
            System.out.println("Autorizado a comprar bebida alcoolica");
        } else {
            System.out.println("Não Autorizado a comprar bebida alcoolica");
        }

        //if(!isAutorizadoComprarBebidas){
        //}
    }
}
