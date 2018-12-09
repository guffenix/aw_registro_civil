
package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import ec.edu.espe.arqui.aw_registro_civil.generic.GenericUsuario;
import java.util.Date;
import javax.ejb.Stateless;

/**
 *
 * @author guffenix
 */
@Stateless
public class Respuesta {

    public GenericUsuario obtenerCiudadano(String cedulaIdentidad){
        
        
        GenericUsuario user = new GenericUsuario();
        GenericUsuario temp = new GenericUsuario();
        
        user.setApellido("Tipan Sosa");
        user.setEstado(Boolean.TRUE);
        user.setEstadoCivil("SOL");
        user.setFechaNacimiento(new Date());
        user.setGenero("F");
        user.setIdentificacion("1716151413");
        user.setLugarNacimiento("Ssangolqui");
        user.setNacionalidad("Ecuatoriana");
        user.setNombre("Karen Ana");
        user.setTelefono("0987654321");
        user.setEmail("kat@espe.edu.ec");
        
        if (user.getIdentificacion().equals(cedulaIdentidad)) {
            temp = user;
        }
        
        return temp;
    }
}
