package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import ec.edu.espe.arqui.aw_registro_civil.generic.Persona;
import ec.edu.espe.arqui.aw_registro_civil.generic.PersonaGenerica;
import java.util.List;
import javax.ejb.Stateless;
import javax.ws.rs.core.GenericEntity;

import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author guffenix
 */
@Stateless
public class Respuesta {

    public PersonaGenerica obtenerCiudadano(String cedulaIdentidad) {

//        GenericUsuario user = new GenericUsuario();
        PersonaGenerica dev=new PersonaGenerica();
        Persona temp = new Persona();
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arqui.aw_registro_civil.generic");
        //final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100", 32768), "REGISTRO_CIVIL");
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://arqui-mongo:FArzQZ1QdaCwnWShL1GoHouEkglhOnj4Uslv7fIMAL6aZwIxVwCUcDCNzAJHaio9fdTYeTgfFO143WgyXyFAtQ==@arqui-mongo.documents.azure.com:10255/?ssl=true&replicaSet=globaldb"));
        final Datastore datastore = morphia.createDatastore(mongoClient, "REGISTRO_CIVIL");

        Query<Persona> query = datastore.find(Persona.class).field("identificacion").equal(cedulaIdentidad);
//        Query query=datastore.createQuery(Persona.class);
//        query.field("identificacion").equal(cedulaIdentidad); 
        //Query<Persona> query = datastore.createQuery(Persona.class);
//        query.field("identificacion").equal(cedulaIdentidad).asList();

        if (query != null) {
            temp = (Persona) query.get();

            System.out.println("->kkkk " + temp);
        }
        dev.setApellido(temp.getApellido());
        dev.setNombre(temp.getNombre());
        dev.setFechaNacimiento(temp.getFechaNacimiento());
        dev.setId(temp.getId());

//        if (query != null) {
//            temp = (Persona) query.get();
//
//            System.out.println("->kkkk " + temp.getLugarNacimiento());
//        }
//        if (query != null) {
//            temp = (Persona) query.get();
//            System.out.println(temp.getLugarNacimiento().getProvincia());
//
//        }
        return dev;
    }
    
    public Persona obtenerPersona(String cedulaIdentidad) {

         PersonaGenerica dev=new PersonaGenerica();
        Persona temp = new Persona();
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arqui.aw_registro_civil.generic");
        //final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100", 32768), "REGISTRO_CIVIL");
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://arqui-mongo:FArzQZ1QdaCwnWShL1GoHouEkglhOnj4Uslv7fIMAL6aZwIxVwCUcDCNzAJHaio9fdTYeTgfFO143WgyXyFAtQ==@arqui-mongo.documents.azure.com:10255/?ssl=true&replicaSet=globaldb"));
        final Datastore datastore = morphia.createDatastore(mongoClient, "REGISTRO_CIVIL");

        Query<Persona> query = datastore.find(Persona.class).field("identificacion").equal(cedulaIdentidad);
//        Query query=datastore.createQuery(Persona.class);
//        query.field("identificacion").equal(cedulaIdentidad); 
        //Query<Persona> query = datastore.createQuery(Persona.class);
//        query.field("identificacion").equal(cedulaIdentidad).asList();

        if (query != null) {
            temp = (Persona) query.get();

            System.out.println("->kkkk " + temp);
        }
        dev.setApellido(temp.getApellido());
        dev.setNombre(temp.getNombre());
        dev.setFechaNacimiento(temp.getFechaNacimiento());
        dev.setId(temp.getId());

//        if (query != null) {
//            temp = (Persona) query.get();
//
//            System.out.println("->kkkk " + temp.getLugarNacimiento());
//        }
//        if (query != null) {
//            temp = (Persona) query.get();
//            System.out.println(temp.getLugarNacimiento().getProvincia());
//
//        }
        return temp;
    }
}
