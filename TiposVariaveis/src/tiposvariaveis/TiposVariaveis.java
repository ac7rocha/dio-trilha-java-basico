package tiposvariaveis;
public class TiposVariaveis {
    public static void main(String[] args) {
        double salarioMinimo = 2500;
        
        short numeroCurto = 1;
        int numeroNormal = numeroCurto;
        short numeroCurto2 = (short) numeroNormal;
        
        int numero = 1;
        System.out.println("Número vale " +numero);
        numero = 2;
        System.out.println("Agora número vale " +numero);
        
        double valorDePi = 3.14;
        System.out.println("PI vale " +valorDePi);
        valorDePi = 3.15;
        System.out.println("Agora PI vale " +valorDePi);
        
        final double VALOR_DE_PI = 3.14;
        System.out.println("PI vale " +VALOR_DE_PI);
        
        
        
        
        
        
    }
}
