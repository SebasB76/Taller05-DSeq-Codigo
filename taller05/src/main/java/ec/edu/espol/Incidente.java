package ec.edu.espol;

import java.sql.Date;
import java.util.List;

public class Incidente {
    protected int id;
    protected Date fecha_reportado;
    protected String estado;
    protected String titulo;
    protected String descripcion;
    protected List log_actualizaciones;
    protected String tipo;
    protected Date fecha_cierre;
    protected Usuario responsable;
    protected PersonalAcademico beneficiario;



}
