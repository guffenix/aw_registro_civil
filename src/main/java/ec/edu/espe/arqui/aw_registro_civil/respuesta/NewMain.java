/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.respuesta;

import com.mongodb.MongoClient;
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
        final Datastore datastore = morphia.createDatastore(new MongoClient("192.168.99.100",32768), "REGISTRO_CIVIL");
        //datastore.ensureIndexes();
        
        persona.setApellido("Tipan Sosa");
        persona.setEstado(Boolean.TRUE);
        persona.setEstadoCivil("SOL");
        persona.setFechaNacimiento(new Date());
        persona.setGenero("F");
        LugarNacimiento nacimiento=new LugarNacimiento();
        persona.setIdentificacion("1716151413");
        nacimiento.setProvincia("Pichicnha");
        nacimiento.setCanton("Quito");
        nacimiento.setParroquia("Tumbaco");
        persona.setLugarNacimiento(nacimiento);
        persona.setNacionalidad("Ecuatoriana");
        persona.setNombre("Karen Ana");
        persona.setTelefono("0987654321");
        persona.setEmail("kat@espe.edu.ec");
        datastore.save(persona);
        
    }
    
}
