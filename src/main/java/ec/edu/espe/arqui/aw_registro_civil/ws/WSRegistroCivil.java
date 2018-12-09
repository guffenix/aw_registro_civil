
package ec.edu.espe.arqui.aw_registro_civil.ws;

import ec.edu.espe.arqui.aw_registro_civil.generic.GenericUsuario;
import ec.edu.espe.arqui.aw_registro_civil.respuesta.Respuesta;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author guffenix
 */
@WebService(serviceName = "WSRegistroCivil")
public class WSRegistroCivil {

    @EJB
    private Respuesta ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerCiudadano")
    public GenericUsuario obtenerCiudadano(@WebParam(name = "cedulaIdentidad") String cedulaIdentidad) {
        return ejbRef.obtenerCiudadano(cedulaIdentidad);
    }
    
}
