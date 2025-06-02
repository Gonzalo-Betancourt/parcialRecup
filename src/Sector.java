import java.util.ArrayList;
import java.util.List;

public class Sector {
    private String nombre;
    private String descripcion;
    private List<Cultivo> cultivos;
    private Tarea tarea;

    public Sector(){}

    public Sector(String nombre, String descripcion, Tarea tarea) {
        this.nombre = nombre;
        this.descripcion = descripcion;
        this.tarea = tarea;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<Cultivo> getCultivos() {
        return cultivos;
    }

    public void setCultivos(List<Cultivo> cultivos) {
        this.cultivos = cultivos;
    }

    public Tarea getTarea() {
        return tarea;
    }

    public void setTarea(Tarea tarea) {
        this.tarea = tarea;
    }

    public void addCultivo(Cultivo cultivo){
        if (cultivos == null) cultivos = new ArrayList<>();
        cultivos.add(cultivo);
    }

    public List<Cosecha> getCosechasDelSector() {
        List<Cosecha> cosechas = new ArrayList<>();
        for (Cultivo c : cultivos){
            for (Cosecha cos : c.getCosechas()){
                cosechas.add(cos);
            }
        }
        return cosechas;
    }


}
