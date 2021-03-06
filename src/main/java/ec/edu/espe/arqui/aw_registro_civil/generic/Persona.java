/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.generic;

import java.util.Date;
import java.util.Objects;
import org.bson.types.ObjectId;
import org.mongodb.morphia.annotations.*;

/**
 *
 * @author Rolando Cachipuendo
 */
@Entity(noClassnameStored = true, value = "persona")
public class Persona {
    @Id
    private ObjectId id;
    
    @Property("identificacion")
    @Indexed(options = @IndexOptions(name="ci",unique = true))
    private String identificacion;
    
    @Property("nombre")
    private String nombre;
    
    @Property("apellido")
    private String apellido;
    
    @Property("telefono")
    private String telefono;
    
    @Property("email")
    private String email;
    @Property("fechaNacimiento")
    private Date fechaNacimiento;
    @Property("nacionalidad")
    private String nacionalidad;
    @Property("genero")
    private String genero;
    @Property("estadoCivil")
    private String estadoCivil;
    @Property("estado")
    private Boolean estado;
    @Embedded
    private LugarNacimiento lugarNacimiento;

    public ObjectId getId() {
        return id;
    }

    public void setId(ObjectId id) {
        this.id = id;
    }

    

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public Boolean getEstado() {
        return estado;
    }

    public void setEstado(Boolean estado) {
        this.estado = estado;
    }

    public LugarNacimiento getLugarNacimiento() {
        return lugarNacimiento;
    }

    public void setLugarNacimiento(LugarNacimiento lugarNacimiento) {
        this.lugarNacimiento = lugarNacimiento;
    }

    @Override
    public String toString() {
        return "Persona{" + "id=" + id + ", identificacion=" + identificacion + ", nombre=" + nombre + ", apellido=" + apellido + ", telefono=" + telefono + ", email=" + email + ", fechaNacimiento=" + fechaNacimiento + ", nacionalidad=" + nacionalidad + ", genero=" + genero + ", estadoCivil=" + estadoCivil + ", estado=" + estado + ", lugarNacimiento=" + lugarNacimiento + '}';
    }

    
    
    
    
    
}
