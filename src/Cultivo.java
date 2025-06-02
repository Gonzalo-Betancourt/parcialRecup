import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class Cultivo {

    private String especie;
    private TipoCultivo tipo;
    private LocalDate fechaSiembra;

    private List<Cosecha> cosechas;

    public Cultivo(String especie, TipoCultivo tipo, LocalDate fechaSiembra) {
        this.especie = especie;
        this.tipo = tipo;
        this.fechaSiembra = fechaSiembra;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public TipoCultivo getTipo() {
        return tipo;
    }

    public void setTipo(TipoCultivo tipo) {
        this.tipo = tipo;
    }

    public LocalDate getFechaSiembra() {
        return fechaSiembra;
    }

    public void setFechaSiembra(LocalDate fechaSiembra) {
        this.fechaSiembra = fechaSiembra;
    }

    public List<Cosecha> getCosechas() {
        return cosechas;
    }

    public void setCosechas(List<Cosecha> cosechas) {
        this.cosechas = cosechas;
    }

    public void addCosecha(Cosecha cosecha){
        if (cosechas == null) cosechas = new ArrayList<>();
        cosechas.add(cosecha);
        cosecha.setCultivo(this);
    }

}
