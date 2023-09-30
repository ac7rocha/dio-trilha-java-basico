package sistemasmarttv;
public class SistemaSmartTv {
    public static void main(String[] args) {
        SmartTv smartTv = new SmartTv();
        
        System.out.println("TV está ligada? " +smartTv.getLigada());
        System.out.println("Canal Atual " +smartTv.getCanal());
        System.out.println("Volume Atual? " +smartTv.getVolume());
        System.out.println("");
        
        smartTv.Ligar();
        smartTv.aumentarVolume();
        smartTv.mudarCanal(49);
        
        System.out.println("TV está ligada? " +smartTv.getLigada());
        System.out.println("Canal Atual " +smartTv.getCanal());
        System.out.println("Volume Atual? " +smartTv.getVolume());
        System.out.println("");
        
        smartTv.aumentarCanal();
        
        System.out.println("TV está ligada? " +smartTv.getLigada());
        System.out.println("Canal Atual " +smartTv.getCanal());
        System.out.println("Volume Atual? " +smartTv.getVolume());
        System.out.println("");
        
        smartTv.Desligar();
        
        System.out.println("TV está ligada? " +smartTv.getLigada());
        System.out.println("Canal Atual " +smartTv.getCanal());
        System.out.println("Volume Atual? " +smartTv.getVolume());
        System.out.println("");
    }
    
}
