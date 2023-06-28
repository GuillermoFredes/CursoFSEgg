

package Servicios;
import entidades.Cadena;
import java.io.PrintStream;
import java.util.Scanner;

 // @author Camila Astrada 
/*
Método mostrarVocales(), deberá contabilizar la cantidad de vocales que tiene la frase
ingresada.
b) Método invertirFrase(), deberá invertir la frase ingresada y mostrarla por pantalla. Por
ejemplo: Entrada: "casa blanca", Salida: "acnalb asac".
c) Método vecesRepetido(String letra), recibirá un carácter ingresado por el usuario y
contabilizar cuántas veces se repite el carácter en la frase, por ejemplo:
d) Entrada: frase = "casa blanca". Salida: El carácter 'a' se repite 4 veces.
e) Método compararLongitud(String frase), deberá comparar la longitud de la frase que
compone la clase con otra nueva frase ingresada por el usuario.
f) Método unirFrases(String frase), deberá unir la frase contenida en la clase Cadena con
una nueva frase ingresada por el usuario y mostrar la frase resultante.
g) Método reemplazar(String letra), deberá reemplazar todas las letras “a” que se
encuentren en la frase, por algún otro carácter seleccionado por el usuario y mostrar la
frase resultante.
h) Método contiene(String letra), deberá comprobar si la frase contiene una letra

*/
 
public class CadenaService {
 Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public int mostrarVocales(Cadena cad){
        int vocales =0;
        for (int i = 0; i < cad.getLongitud(); i++) {
            
            if (cad.getFrase().substring(i,i+1).equalsIgnoreCase ("a")) {
                
                vocales ++; 
                
            } else if(cad.getFrase().substring(i,i+1).equalsIgnoreCase ("e")) {
                
                vocales ++;
               
            } else if (cad.getFrase().substring(i,i+1).equalsIgnoreCase ("i")) {
                
                vocales ++; 
            } else if(cad.getFrase().substring(i,i+1).equalsIgnoreCase ("o")) {
                
                vocales ++; 
        } else if (cad.getFrase().substring(i,i+1).equalsIgnoreCase ("u")) {
                
                vocales ++; 
        }
         
    }
  return vocales;
    }
    
    
    
    public void invertirFrase(Cadena cad){
        String r ="";
        
        for (int i =cad.getLongitud()-1; i > 0 ; i++) {
            
            System.out.print(cad.getFrase().charAt(i));
             
           
        }  
        
        System.out.println(" ");
}
    
    public void vecesRepetido(Cadena cad){
        int veces = 0; 
        System.out.println("ingrese el caracter a buscar");
        
       String letra = leer.next();
       
        for (int i = 0; i < cad.getLongitud(); i++) {
            if (cad.getFrase().substring(i,i+1).equalsIgnoreCase(letra)){
                veces=+1;
      
            }
        }
        System.out.println("el caracter "+ letra + " se encuentra repetido " + veces + " veces.");
       
        
    }
    
    
   public void compararLongitud(Cadena cad){
       System.out.println("ingrese una frase para comparar");
       
       String frase2 = leer.next();
      
       if ( frase2.length()== cad.getLongitud()){
           System.out.println("poseen la misma longitud");
       } else {
           System.out.println("no poseen la misma longitud");
       }
       
   }
   
   
   public void unirFrases (Cadena cad){
       
       System.out.println("ingrese una frase para concatenar");
       
      String frase2= leer.next();
      
       System.out.println(cad.getFrase() + " " + frase2);
   }
   
   
   public String reemplazar (Cadena cad){
        System.out.println("ingrese un caracter por el cual reemplazar las a");
        String carac = leer.next();
        String frase2 = "";
       for (int i = 0; i < cad.getLongitud() ; i++) {
           if(cad.getFrase().substring(i,i+1).equalsIgnoreCase("a")){
               frase2 = frase2.concat(carac); 
           } else {
                 frase2 = frase2.concat(cad.getFrase().substring(i,i+1));
       } 
   }
      return frase2;   
   }
   
   
   public void contiene (Cadena cad){
       System.out.println("ingrese una letra para buscar en la frase");
       String letra = leer.next();
       
       
    int cont = 0; 
      
       for (int i = 0; i < cad.getLongitud(); i++) {
           
         if (cad.getFrase().substring(i,i+1).equals(letra)){
            cont =+1;
           }
       }
      
     if (cont==0){
         System.out.println("no contiene la letra "+ letra);
     }else{
         System.out.println("contiene la letra " + letra);
     }
      
   }
}

