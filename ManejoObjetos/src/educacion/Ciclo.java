
package educacion;

public class Ciclo {
    
    private String nombre;
    private int numero_alumnos;
    
    public void establecerNombre(String n){
        nombre = n;
        
    }
    
    public void establecernumeroAlumnos(int n){
        
        numero_alumnos = n;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public int obtenernumeroAlumnos(){
        
        return numero_alumnos;
    }
}
