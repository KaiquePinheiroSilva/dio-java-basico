public class PrimeiroApp {
    public static void main (String [] args) {
    
        String perimeiroNome = "Kaique";
        String segundoNome = "Pinheiro";

        String nomeCompleto = nomeCompleto(perimeiroNome, segundoNome);
        
        System.out.println(nomeCompleto);
    }

    public static String nomeCompleto (String primeiroNome, String segundoNome) {
        return "Resultado do método " + primeiroNome.concat(" ").concat(segundoNome);
    }
}
