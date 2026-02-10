

public class EstacionClimatica{
    public static void main(String[] args) {
        
    
    double [] temperaturas = new double[24];
    for (int i = 0;  i < temperaturas.length; i++) {
        temperaturas[i] = Math.random() * 40;
    }
    System.out.println("la temperatura del medio dia es:" + temperaturas[13] + "°c");

}

}