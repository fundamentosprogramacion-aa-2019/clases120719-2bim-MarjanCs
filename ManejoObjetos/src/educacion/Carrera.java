
package educacion;


public class Carrera {
    
    private String nombre;
    private Ciclo [] listaCiclos;
   
    
    public void establecerNombre(String n){
        nombre = n;
        
    }
    
    public void establecerListaCiclos(Ciclo[] lista){
        listaCiclos = lista;
    }
    
    
    public String obtenerNombre(){
        return nombre;
    }
    
    public Ciclo [] obtenerListaCiclo(){
        
        return listaCiclos;
    }
}
