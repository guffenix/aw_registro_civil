
package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import com.mongodb.MongoClient;
import ec.edu.espe.arqui.aw_registro_civil.generic.Persona;
import javax.ejb.Stateless;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guffenix
 */
@Stateless
public class Respuesta {

    public Persona obtenerCiudadano(String cedulaIdentidad){
        
        
//        GenericUsuario user = new GenericUsuario();
        Persona temp = new Persona();
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arqui.aw_registro_civil.generic");
        final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100",32768), "REGISTRO_CIVIL");
        
        Query query=datastore.createQuery(Persona.class);
        query.field("identificacion").equal(cedulaIdentidad);
        
        if (query!=null) {
            temp=(Persona)query.get();
            
            
        }       
        return temp;
    }
}
