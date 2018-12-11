/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ec.edu.espe.arqui.aw_registro_civil.generic;


import org.mongodb.morphia.annotations.*;




/**
 *
 * @author Rolando Cachipuendo
 */
@Embedded
public class LugarNacimiento {
    
    @Property("_Provincia")
    private String _Provincia;
    @Property("_Canton")
    private String _Canton;
    @Property("_Parroquia")
    private String _Parroquia;

    public LugarNacimiento() {
    }
    
    

    public String getProvincia() {
        return _Provincia;
    }

    public void setProvincia(String _Provincia) {
        this._Provincia = _Provincia;
    }

    public String getCanton() {
        return _Canton;
    }

    public void setCanton(String _Canton) {
        this._Canton = _Canton;
    }

    public String getParroquia() {
        return _Parroquia;
    }

    public void setParroquia(String _Parroquia) {
        this._Parroquia = _Parroquia;
    }
    
    
    
}
