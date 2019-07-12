
package educacion;

public class Universidad {
    
    private String nombre;
    private Carrera [] listaCarreras;
    private int AlumnosUniversidad;
    
    public void establecerNombre(String n){
        nombre = n;
        
    }
    
    public void establecerListaCarreras(Carrera [] lista){
        listaCarreras = lista;
    }
    
    public void establecerAlumnosUniversidad(int n){      
        AlumnosUniversidad = n;
        
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    
    public Carrera [] obtenerListaCarreras(){
        
        return listaCarreras;
    }
    
    public int obtenerAlumnosUniversidad(){
        return AlumnosUniversidad;
    }
}
