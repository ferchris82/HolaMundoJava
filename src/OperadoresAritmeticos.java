
public class OperadoresAritmeticos {
    
    public static void main(String[] args) {
        int a = 3, b = 2;
        
        var resultado = a + b;
        System.out.println("el resultado de la suma: " + resultado);
        
        resultado = a - b;
        System.out.println("el resultado de la resta: " + resultado);
        
        resultado = a * b;
        System.out.println("el resultado de la multiplicacion: " + resultado);
        
        var resultado2 = 3.0 / b;
        System.out.println("el resultado de la division: " + resultado2);
        
        resultado = a % b;
        System.out.println("resultado modulo: " + resultado);
        
        if (b % 2 == 0) {
            System.out.println("Es numero par");
        }else{
            System.out.println("Es numero impar");
        }
    }
}
