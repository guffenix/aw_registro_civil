/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import ec.edu.espe.arqui.aw_registro_civil.generic.LugarNacimiento;
import ec.edu.espe.arqui.aw_registro_civil.generic.Persona;
import java.util.Date;
import org.mongodb.morphia.Datastore;
import org.mongodb.morphia.Morphia;

/**
 *
 * @author Rolando Cachipuendo
 */
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Persona persona=new Persona();
        final Morphia morphia = new Morphia();
        morphia.mapPackage("ec.edu.espe.arqui.aw_registro_civil.generic");
        //final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100",32768), "REGISTRO_CIVIL");
        //datastore.ensureIndexes();
        
        MongoClient mongoClient = new MongoClient(new MongoClientURI("mongodb://arqui-mongo:FArzQZ1QdaCwnWShL1GoHouEkglhOnj4Uslv7fIMAL6aZwIxVwCUcDCNzAJHaio9fdTYeTgfFO143WgyXyFAtQ==@arqui-mongo.documents.azure.com:10255/?ssl=true&replicaSet=globaldb"));
        final Datastore datastore = morphia.createDatastore(mongoClient, "REGISTRO_CIVIL");
        
        persona.setApellido("Guaman Orta");
        persona.setEstado(Boolean.TRUE);
        persona.setEstadoCivil("SOL");
        persona.setFechaNacimiento(new Date());
        persona.setGenero("M");
        LugarNacimiento nacimiento=new LugarNacimiento();
        persona.setIdentificacion("1234567890");
        nacimiento.setProvincia("Los Ríos");
        nacimiento.setCanton("Quevedo");
        nacimiento.setParroquia("San Camilo");
        persona.setLugarNacimiento(nacimiento);
        persona.setNacionalidad("Ecuatoriana");
        persona.setNombre("Steven Juan");
        persona.setTelefono("0990872645");
        persona.setEmail("sjguaman@espe.edu.ec");
        datastore.save(persona);
        
    }
    
}
