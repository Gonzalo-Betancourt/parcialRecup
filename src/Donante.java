import java.util.ArrayList;
import java.util.List;

public class Donante extends Persona{

    private List<Donacion> donaciones;

    public Donante(){}

    public Donante(String nombre, String dni, String email, Domicilio domicilio) {
        super(nombre, dni, email, domicilio);
    }

    public void addDonacion(Donacion donacion){
        if (donaciones == null) donaciones = new ArrayList<>();
        donaciones.add(donacion);
    }

    public void mostrarDonaciones() {
        for (Donacion d : donaciones) {
            System.out.println(d.getDescripcion());
        }
    }

}