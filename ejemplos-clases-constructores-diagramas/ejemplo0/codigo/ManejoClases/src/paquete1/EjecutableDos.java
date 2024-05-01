package paquete1;

public class EjecutableDos {
        public static void main(String[] args) {
            
        Computadora personal = new Computadora(24.0);
        personal.establecerTipoProcesador("R1");
        
            System.out.printf("%s - %.2f\n", 
                    personal.obtenerTipoProcesador(),
                    personal.obtenerMemoria());
    }
}
