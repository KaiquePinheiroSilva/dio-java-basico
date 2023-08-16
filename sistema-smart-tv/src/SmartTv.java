public class SmartTv {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    
    public void mudarDeCanal (int novoCanal){
        canal = novoCanal;
    }
    public void trocarParaProximoCanal(){
        canal++;
    }
    public void trocarParaCanalAnterior(){
        canal--;
    }


    public void aumentarVolume(){
        volume ++;
        System.out.println("Aumentando volume para: " + volume);
    }
    public void reduzirVolume(){
        volume --;
        System.out.println("Reduzindo volume para: " + volume);
    }


    public void ligar(){
        ligada = true;
    }
    public void desligar(){
        ligada = false;
    }
}