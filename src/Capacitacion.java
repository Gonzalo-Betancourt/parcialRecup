import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Capacitacion {
    private String tema;
    private LocalDate fecha;

    private Capacitador capacitador;
    private List<Voluntario> asistentes;

    public Capacitacion(){}

    public Capacitacion(String tema, LocalDate fecha, Capacitador capacitador) {
        this.tema = tema;
        this.fecha = fecha;
        this.capacitador = capacitador;
        capacitador.setCapacitacion(this);
    }

    public String getTema() {
        return tema;
    }

    public void setTema(String tema) {
        this.tema = tema;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public Capacitador getCapacitador() {
        return capacitador;
    }

    public void setCapacitador(Capacitador capacitador) {
        this.capacitador = capacitador;
    }

    public List<Voluntario> getAsistentes() {
        return asistentes;
    }

    public void setAsistentes(List<Voluntario> asistentes) {
        this.asistentes = asistentes;
    }

    public void addVoluntario(Voluntario voluntario){
        if (asistentes == null) asistentes = new ArrayList<>();
        asistentes.add(voluntario);
    }

    public void mostrarAsistentes() {
        for (Voluntario v : asistentes) {
            System.out.println(v.getNombre());
        }
    }

}
