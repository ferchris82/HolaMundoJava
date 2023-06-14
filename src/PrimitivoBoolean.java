
public class PrimitivoBoolean {
    
    public static void main(String[] args) {
        boolean varBoolean = true;
        System.out.println("varBoolean = " + varBoolean);
        
        if(varBoolean){
            System.out.println("La bandera es verdadera");
        }else{
            System.out.println("La bandera es falsa");
        }
        
        var edad = 10;
        //var esAdulto = edad >= 18;
        if(edad >= 18){
            System.out.println("Eres Mayor de edad");
        }else{
            System.out.println("Eres Menor de edad");
        }
    }
}
