package sistemasmarttv;
public class SmartTv {
    private boolean ligada = false;
    private int canal = 1;
    private int volume = 25;
    
   public void Ligar(){
       this.setLigada(true);
   }
   public void Desligar(){
       this.setLigada(false);
       this.setCanal(0);
       this.setVolume(0);
   }
   
   public void mudarCanal(int novoCanal){
       canal = novoCanal;
   }
   
   public void aumentarCanal(){
       if (this.getCanal() < 49) {
           this.setCanal(this.getCanal() + 1);
       } else {
           canal = 1;
       }
   }
   public void diminuirCanal(){
       if (this.getCanal() == 1) {
           this.setCanal(this.getCanal() - 1);
       } else {
           canal = 49;
       }
   }
   
   public void aumentarVolume(){
       if (this.getVolume() < 100) {
           this.setVolume(this.getVolume() + 1);
       } else {
           System.out.println("Volume máximo");
       }
       
   }
   
   public void diminuirVolume(){
       if (this.getVolume() > 0) {
           this.setVolume(this.getVolume() - 1);
       } else {
           System.out.println("Volume mínimo");
       }
       
   }

    public boolean getLigada() {
        return ligada;
    }

    public void setLigada(boolean ligada) {
        this.ligada = ligada;
    }

    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
   
   
    
}
