

public class EstacionClimatica{
    public static void main(String[] args) {
        
    
    double [] temperaturas = new double[24];
    for (int i = 0;  i < temperaturas.length; i++) {
        temperaturas[i] = Math.random() * 40;
    }
    System.out.println("la temperatura del medio dia es:" + temperaturas[13] + "°c");
    
    try {
        System.out.println("la temperatura en la hora 25 es:"+ temperaturas[24]+ "°c");
    } catch (Exception e) {
        // TODO: handle exception
        
    }
}

}