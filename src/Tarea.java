import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Tarea {
    private String descripcion;
    private LocalDate fecha;

    private List<Voluntario> voluntarios;
    private Sector sector;

    public Tarea(){}

    public Tarea(String descripcion, LocalDate fecha, Sector sector) {
        this.descripcion = descripcion;
        this.fecha = fecha;
        this.sector = sector;
    }

    public void addVoluntario(Voluntario voluntario){
        if (voluntarios == null) voluntarios = new ArrayList<>();
        voluntarios.add(voluntario);
    }

}
