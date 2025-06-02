import java.time.LocalDate;

public class Turno {
    private LocalDate fecha;
    private String horario;
    private Voluntario voluntario;

    public Turno(){}

    public Turno(LocalDate fecha, String horario, Voluntario voluntario) {
        this.fecha = fecha;
        this.horario = horario;
        this.voluntario = voluntario;
    }

    public LocalDate getFecha() {
        return fecha;
    }

    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public Voluntario getVoluntario() {
        return voluntario;
    }

    public void setVoluntario(Voluntario voluntario) {
        this.voluntario = voluntario;
    }

}
