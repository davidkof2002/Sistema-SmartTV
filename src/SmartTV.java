
public class SmartTV {
    boolean ligada = false;
    int canal = 1;
    int volume = 25;

    public void mudarCanal (int novoCanal){
        canal = novoCanal;
    }

    public void aumentarCanal(){
        canal ++;

    }
    
    public void diminuirCanal(){
        canal --;
    }

    public void aumentarVolume(){
        volume ++;
        // volume = volume + 1;
        System.out.println("Aumentando Volume para: " + volume);
     
    }

    public void diminuirVolume(){
        volume --;
        // volume = volume - 1;
        System.out.println("Diminuindo o Volume para: " + volume);
        
    }

    public void ligar(){
        ligada = true;

    }
    
    public void desligar(){
        ligada = false;
     }
}
