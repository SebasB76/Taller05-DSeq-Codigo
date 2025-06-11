package ec.edu.espol;

import java.util.List;

public class Usuario {
    protected String usuario;
    protected String contrasenia;
    protected String nomobre;
    protected String apellido;
    protected List<Incidente> incidentes;

    protected boolean login(){
        return true;
    }
    protected boolean logOut(){
        return true;
    }

}
