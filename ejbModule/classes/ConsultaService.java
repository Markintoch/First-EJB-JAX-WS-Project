package classes;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.LocalBean;
import javax.ejb.Stateless;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

/**
 * Session Bean implementation class ConsultaService
 */
@WebService(portName = "ConsultaServicePort", serviceName = "ConsultaService")
@Stateless
@LocalBean
public class ConsultaService {

	@EJB
	ConsultaDatos consultaDatos;

    /**
     * Default constructor. 
     */
    public ConsultaService() {
        // TODO Auto-generated constructor stub
    }

    
    @WebMethod(operationName="getPeliculas")
    @WebResult(name="returnPeliculas")
    public List<Pelicula> getPeliculasDatos(){
    	return consultaDatos.getPeliculas();
    }
    
    @WebMethod(operationName="getPeliculaById")
    @WebResult(name="returnPeliculasById")
    public String getNombrePelicula(@WebParam(name="id") int id) {
    	return consultaDatos.getNombrePeliculaById(id);
    }

}
