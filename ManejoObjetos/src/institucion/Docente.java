
package institucion;

public class Docente {
    
    private String nombre;
    private int anioExperiencia;
    private int edad;
    
     public void establecerNombre(String n){
        nombre = n;
     }   
     
     public void estableceranioExperiencia(int ex){
        anioExperiencia = ex;
     }
     public void establecerEdad(int ex){
        edad = ex;
     }
       
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenerAnioExperiencia(){
        return anioExperiencia;
    }
    
    public int obtenerEdad(){
        return edad;
    }
}
