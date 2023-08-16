public class Usuario {
    public static void main(String[] args) throws Exception {
        
        SmartTv smartTv = new SmartTv();

        smartTv.reduzirVolume();
        smartTv.reduzirVolume();
        smartTv.reduzirVolume();
        smartTv.aumentarVolume();
        System.out.println("Volume: " + smartTv.volume);

        System.out.println("Canal Atual: " + smartTv.canal);
        smartTv.mudarDeCanal(13);
        System.out.println("Canal Atual: " + smartTv.canal);

        System.out.println("TV Ligada? " + smartTv.ligada);
        System.out.println("Canal Atual: " + smartTv.canal);
        System.out.println("Volume: " + smartTv.volume);

        smartTv.ligar ();
        System.out.println("Novo Status: TV Ligada? " + smartTv.ligada);
    }
}
