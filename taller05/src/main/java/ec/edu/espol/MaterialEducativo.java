package ec.edu.espol;

import java.util.List;

public class MaterialEducativo {


    protected String titulo;
    protected String descripcion;
    protected List<String> recursos;

    public MaterialEducativo(String titulo, String descripcion) {
        this.titulo = titulo;
        this.descripcion = descripcion;
    }

    

    public void seleccionarMaterial(List<String> recursos) {
        this.recursos = recursos;

    }

    public void subirMaterial(Curso curso) {

    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setdescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    public String toString() {
        return "MaterialEducativo{" +
                "titulo='" + titulo + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", recursos=" + recursos +
                '}' + "Correctamente Subido al curso " ;
    }
    public boolean validarMaterial() {
        return titulo != null && !titulo.isEmpty() && descripcion != null && !descripcion.isEmpty() && recursos != null && !recursos.isEmpty();
    }
    public boolean validarCarga(){

        ///Validacion de que el material se haya cargado correctamente
        return validarCarga();
    }





}
