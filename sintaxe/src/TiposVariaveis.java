public class TiposVariaveis {
    public static void main(String[] args) throws Exception {
        // tipos primitivos
        //estudem a classe string que representa texto na aplicação

        String meuNome = "Kaique Pinheiro";
        System.out.println(meuNome);

        double salarioMinimo = 2500;
        System.out.println(salarioMinimo);

        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        System.out.println(numeroCurto2);

        int numero = 1;

        numero = 0;

        System.out.println(numero);
        
        final double VALOR_DE_PI = 3.14; 
        System.out.println(VALOR_DE_PI);

        // VALOR_DE_PI = 1;
    }
}
