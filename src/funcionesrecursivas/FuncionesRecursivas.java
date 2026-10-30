package funcionesrecursivas;

public class FuncionesRecursivas {

    public static void main(String[] args) {
        System.out.println("------------------PRUEBAS DE FUNCIONES RECURSIVAS------------------");
        
        System.out.println("Suma de 1 hasta n:");
        System.out.println("Recibes 5");
        System.out.println("Resultado: " + sumarHastaN(5));
        System.out.println("");
        
        System.out.println("Invertir un string:");
        System.out.println("Recibes Murcielago");
        System.out.println("Resultado: " + invertirString("Murcielago"));
        System.out.println("");
        
        System.out.println("Contar los digitos de un numero:");
        System.out.println("Recibes 78951");
        System.out.println("Resultado: " + contarDigitos(78951));
    }

    public static int sumarHastaN(int n) {
        if (n <= 1) {
            return n;
        }
        return n + sumarHastaN(n - 1);
    }

    public static String invertirString(String texto) {
        if (texto.isEmpty()) {
            return texto;
        }
        
        return invertirString(texto.substring(1)) + texto.charAt(0);
    }

    public static int contarDigitos(int numero) {
        numero = Math.abs(numero);
        
        if (numero < 10) {
            return 1;
        }
        
        return 1 + contarDigitos(numero / 10);
    }
}
    

