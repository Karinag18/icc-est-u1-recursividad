public class App {
    public static void main(String[] args) throws Exception {
    Recursividad recursividad = new Recursividad();
        int resultado = recursividad.factorial(5);
        int resultado2 = recursividad.sumaConsecutivos(5);
        int resultado3 = recursividad.potencia(5, 2);
        int resultado4 = recursividad.sumDigitos(456);
        System.out.println(resultado);
        System.out.println("La Suma consecutiva es: " + resultado2);
        System.out.println("La respuesta de la potencia es: " + resultado3);
        System.out.println("La respuesta de los digitos es: " + resultado4);

    }
}
