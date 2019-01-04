/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.ws;

import ec.edu.espe.arqui.aw_registro_civil.generic.Persona;
import ec.edu.espe.arqui.aw_registro_civil.generic.PersonaGenerica;
import ec.edu.espe.arqui.aw_registro_civil.respuesta.Respuesta;
import javax.ejb.EJB;
import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebService;

/**
 *
 * @author Rolando Cachipuendo
 */
@WebService(serviceName = "WS_ObtenerPersona")
public class WS_ObtenerPersona {

    @EJB
    private Respuesta ejbRef;// Add business logic below. (Right-click in editor and choose
    // "Web Service > Add Operation"

    @WebMethod(operationName = "obtenerCiudadano")
    public PersonaGenerica obtenerCiudadano(@WebParam(name = "cedulaIdentidad") String cedulaIdentidad) {
        return ejbRef.obtenerCiudadano(cedulaIdentidad);
    }

    @WebMethod(operationName = "obtenerPersona")
    public Persona obtenerPersona(@WebParam(name = "cedulaIdentidad") String cedulaIdentidad) {
        return ejbRef.obtenerPersona(cedulaIdentidad);
    }
    
}
