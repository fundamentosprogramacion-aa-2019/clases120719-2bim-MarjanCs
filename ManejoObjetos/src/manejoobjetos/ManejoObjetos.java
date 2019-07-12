
package manejoobjetos;
import institucion.Asignatura;
import institucion.Docente;
import institucion.Paralelo;


public class ManejoObjetos {

   
    public static void main(String[] args) {
        
       
        Docente d = new Docente();
        
        d.establecerNombre("Rodrigo Estrada");
        d.estableceranioExperiencia(10);
        d.establecerEdad(10);
        
        Docente d2 = new Docente();
        d2.establecerNombre("Jhon Calle");
        d2.estableceranioExperiencia(5);
        d2.establecerEdad(31);
        
        Asignatura a1 = new Asignatura();
        
        a1.establecerNombre("Programacion");
        a1.establecerHorario("Viernes");
        a1.establecerCreditos(4);
        a1.establecerDocente(d);
        
        Asignatura a2 = new Asignatura();
        
        a2.establecerNombre("Base de datos");
        a2.establecerHorario("Jueves: 10-13");
        a2.establecerCreditos(3);
        a2.establecerDocente(d2);
        
        Asignatura [] lista = new Asignatura[2];
        lista[0] = a1;
        lista[1] = a2;
        
        Paralelo paraleloUno = new Paralelo();
        
        paraleloUno.establecerNombre("Paralelo A");
        paraleloUno.establecerListaAsignaturas(lista);
        paraleloUno.establecerCreditosParalelo();
        
        String cadena = "";
        cadena = String.format("%sReporte del %s\n", cadena, paraleloUno.obtenerNombre());      
        
        for (int i = 0; i < paraleloUno.obtenerListaAsignatura().length; i++) {
             Asignatura a = paraleloUno.obtenerListaAsignatura()[i];
                  
            cadena = String.format("%sAsigantura: %s\nDocente: "
                    + "\n\tNombre : %s\n\tEdad: %d\n",
                   cadena,
                   a.obtenerNombre(),
                   a.obtenerDocente().obtenerNombre(),
                   a.obtenerDocente().obtenerEdad());
            
                
        }
        cadena = String.format("%sNumero de Creditos del Paralelo : %.2f\n",
                cadena, paraleloUno.obtenerCreditosParalelo());
        
        System.out.printf("%s",cadena);
        
        /*
        System.out.printf("Reporte del %s\nLista de asignaturas\n",paraleloUno.obtenerNombre());
        
        for (int i = 0; i < lista.length; i++) {
            Asignatura a = lista[i];
                  
            System.out.printf("Asigantura: %s\nDocente: "
                    + "\n\tNombre : %s\n\tEdad: %d\n",
                   a.obtenerNombre(),
                   a.obtenerDocente().obtenerNombre(),
                   a.obtenerDocente().obtenerEdad());
           */ 
        }
        
    }

    

