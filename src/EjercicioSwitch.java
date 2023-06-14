
import java.util.Scanner;


public class EjercicioSwitch {
    
    public static void main(String[] args) {
        
        System.out.println("Dame el numero de mes para conocer la estacion");
        Scanner sc = new Scanner(System.in);
        var mes = sc.nextInt();
        var estacion = "Estacion desconocida";
        
        switch (mes) {
            case 1: case 2: case 12:
                estacion = "Invierno";
                break;
            case 3: case 4: case 5:
                estacion = "Primavera";
                break;
            case 6: case 7: case 8:
                estacion = "Verano";
                break;
            case 9: case 10: case 11:
                estacion = "Otonio";
                break;            
        }
        System.out.println("estacion = " + estacion);
    }
}