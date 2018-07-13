package classes;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;
import javax.ejb.LocalBean;
import javax.ejb.Singleton;

/**
 * Session Bean implementation class ConsultaDatos
 */
@Singleton
@LocalBean
public class ConsultaDatos {

	List<Pelicula> peliculas;
    /**
     * Default constructor. 
     */
	
	
    public ConsultaDatos() {
        // TODO Auto-generated constructor stub
    }
    @PostConstruct
    public void initial() {
    	peliculas = new ArrayList<Pelicula>();
    	
    	peliculas.add(new Pelicula("Avengers",2018,0));
    	peliculas.add(new Pelicula("Spiderman 2",2005,1));
    	peliculas.add(new Pelicula("Titanic",2000,2));
    }
    
    public List<Pelicula> getPeliculas(){
    	return peliculas;
    }
    
    public String getNombrePeliculaById(int id) {
    	System.out.println("Se hizo una consulta a la pelicula con el id "+id);
    	try {
    		return "El nombre de la pelicula con el ID "+id+" es "+ peliculas.get(id).getNombre();
    	}catch(Exception e){
    		return "No se encontro la pelicula con ese ID";
    	}
    	
    }

}
