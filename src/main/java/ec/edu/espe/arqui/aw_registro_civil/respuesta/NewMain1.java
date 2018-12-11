/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import com.mongodb.MongoClient;
import ec.edu.espe.arqui.aw_registro_civil.generic.Persona;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;
import org.mongodb.morphia.query.Query;

/**
 *
 * @author Rolando Cachipuendo
 */
public class NewMain1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona temp = new Persona();
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arqui.aw_registro_civil.generic");
        final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100",32768), "REGISTRO_CIVIL");
        
        Query query=datastore.createQuery(Persona.class);
        query.field("identificacion").equal("1716151413");
        
        if (query!=null) {
            temp=(Persona)query.get();
            
            System.out.println("-> "+temp.getApellido());
        }       
        
    }
    
}
