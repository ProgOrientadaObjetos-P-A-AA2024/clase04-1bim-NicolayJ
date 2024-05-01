package paquete1;

public class EjecutableTres {
        public static void main(String[] args) {
            
        Computadora personal = new Computadora();
        personal.establecerTipoProcesador("Intel vPro");
        
            System.out.printf("%s - %.2f\n", 
                    personal.obtenerTipoProcesador(),
                    personal.obtenerMemoria());
    }
}
