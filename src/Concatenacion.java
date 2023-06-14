
public class Concatenacion {
    public static void main(String[] args) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        
        var union = titulo + " " + usuario;
        System.out.println("union = " + union);
        
        var i = 3;
        var j = 4;
        
        System.out.println(i + j); //se realiza la suma de numeros
        System.out.println(i + j + usuario); //Evaluacion de izquierda a derecha realiza suma
        System.out.println(usuario + i + j); //Contexto cadena, todo es una cadena
        System.out.println(usuario + (i + j)); //Uso de parentesis modifican la prioridad en la evaluacion
    }
}
