package funcionesrecursivas;

public class FuncionesRecursivas {

    public static void main(String[] args) {
        System.out.println("-------------PRUEBAS DE FUNCIONES RECURSIVAS-------------");
        
        System.out.println("Suma de 1 hasta n:");
        System.out.println("Recibes 5");
        System.out.println("Resultado: " + sumaTotal(5));
        System.out.println("");
        
        System.out.println("Invertir un string:");
        System.out.println("Recibes Murcielago");
        System.out.println("Resultado: " + invertir("Murcielago"));
        System.out.println("");
        
        System.out.println("Contar los digitos de un numero:");
        System.out.println("Recibes 78951");
        System.out.println("Resultado: " + contarDigitos(78951));
    }

    public static int sumaTotal(int n) {
        if (n == 1) {
            return 1;
        }
        int sumaAnterior = sumaTotal(n - 1);
        return n + sumaAnterior;
    }

    public static String invertir(String palabra) {
        if (palabra.length() <= 1) {
            return palabra;
        }
        char ultimaLetra = palabra.charAt(palabra.length() - 1);
        String resto = palabra.substring(0, palabra.length() - 1);
        
        return ultimaLetra + invertir(resto);
    }

    public static int contarDigitos(int n) {
        n = Math.abs(n);
        
        if (n < 10) {
            return 1;
        }
        
        int digitosRestantes = contarDigitos(n / 10);
        return 1 + digitosRestantes;
    }
}
    

