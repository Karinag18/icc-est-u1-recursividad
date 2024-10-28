public class Recursividad {
    
    public int factorial(int n){

        System.out.println("Calculando el factorial de: " + n );
        //Caso base: n sea 0! y 1! son iguales a 1
        if(n == 0 || n == 1){
            System.out.println("Caso base alcanzado el factorial de " + n + " es 1");
            return 1;
        }
        int resultado = n * factorial(n - 1);
        System.out.println("Resuktado parcial para " + n + " * factorial( " +  (n-1) + " ) = " + resultado);
        return n * factorial(n-1);
        //return n * factorial(n-1);
    }

    //Calcular la suma de los numeros consecutivos
    //n = 5 resultado = 5 + 4 + 3 + + 2+ 1 = 15
    public int sumaConsecutivos (int n){
        //caso base
        if(n == 1){
            return 1;
        }
        return n + sumaConsecutivos (n-1);
    }

    //Calcular la potencia de numero
    public int potencia(int base, int exponente){
        //Caso base
        if(exponente == 0){
            return 1;
        }
        // Si el exponente es negativo
        if (exponente < 0) {
            return 1 / potencia(base, exponente);
        }
        return base * potencia(base, exponente - 1);
    }
    
    //Crear un metodo que sume los numeros de un digito
    //Si mando 456 sea igual a 15
    //4 + 5 + 6 = 15
    //Pista se usa % Mod
    public int sumDigitos(int num) {
        // Caso base: si el número es 0, la suma es 0
        if (num == 0) {
            return 0;
        }
        return (num % 10) + sumDigitos(num / 10);
    }
    
    
    
}
