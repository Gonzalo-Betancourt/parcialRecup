import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Voluntario extends Persona {
    private List<Tarea> tareasRealizadas = new ArrayList<>();

    private Turno turno = new Turno();
    private Capacitacion capacitacion;

    public Voluntario(){}

    public Voluntario(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public List<Tarea> getTareasRealizadas() {
        return tareasRealizadas;
    }

    public void setTareasRealizadas(List<Tarea> tareasRealizadas) {
        this.tareasRealizadas = tareasRealizadas;
    }

    public Turno getTurno() {
        return turno;
    }

    public void setTurno(LocalDate fecha, String horario) {
        this.turno = new Turno(fecha,horario, this);
    }

    public Capacitacion getCapacitacion() {
        return capacitacion;
    }

    public void setCapacitacion(Capacitacion capacitacion) {
        this.capacitacion = capacitacion;
    }

    public void realizarTarea(Tarea tarea) {
        tareasRealizadas.add(tarea);
    }
    
}
