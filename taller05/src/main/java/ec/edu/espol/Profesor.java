package ec.edu.espol;

import java.util.List;

public class Profesor {
    private List<Curso> cursosACargo;

    public void cargarActividadSumativa(ActividadSumativa as, Curso c) {
        // Implementación para cargar una actividad sumativa al curso
    }
    public void calificarActividadSumativa(Curso curso, Estudiante estudiante, ActividadSumativa actividad) {

        // Implementación para calificar una actividad sumativa
    }
    public void aceptarInscripcion(Curso curso, String estudiante) {
        // Implementación para aceptar la inscripción de un estudiante en un curso
    }
    public void crearNuevoForo(Foro foro) {
        // Implementación para crear un nuevo foro
    }
    public boolean cargarMaterialEducativo(List<String> arch, Curso curso, String titulo, String descripcion) {
        MaterialEducativo material = new MaterialEducativo(titulo, descripcion);

        if(material.validarMaterial()) {
            material.seleccionarMaterial(arch);
        material.subirMaterial(curso);
        System.out.println(material.toString());
        return true; // Retorna true si la carga fue exitosa
            
        }
        else{
            System.out.println("Error de carga");
            return false; // Retorna false si los parámetros son inválidos


        }
        


    }
    

}
