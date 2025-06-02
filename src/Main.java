import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {

        // Crear tareas para asociar a los sectores (las tareas estarán luego en turnos también)
        Tarea tareaFrutal = new Tarea("Revisión de árboles", LocalDate.now(), null);
        Tarea tareaAromatica = new Tarea("Poda de menta", LocalDate.now(), null);

        // Sectores frutales y aromáticas con una tarea
        Sector frutales = new Sector("Frutales", "Árboles frutales", tareaFrutal);

        Sector aromaticas = new Sector("Aromáticas", "Plantas aromáticas", tareaAromatica);

        // Cultivo con dos cosechas
        Cosecha cosecha1 = new Cosecha(LocalDate.now(), 10.5);
        Cosecha cosecha2 = new Cosecha(LocalDate.now(), 12.0);

        Cultivo cultivo1 = new Cultivo("Manzano", TipoCultivo.FRUTAL, LocalDate.now());
        cultivo1.addCosecha(cosecha1);
        cultivo1.addCosecha(cosecha2);

        // Agregar cultivo al sector
        frutales.addCultivo(cultivo1);

        // Voluntario con dos tareas realizadas y un turno
        Domicilio dom1 = new Domicilio("Colón", "123", "Mendoza", "Mendoza");
        Domicilio dom2 = new Domicilio("Belgrano", "456", "Godoy Cruz", "Mendoza");
        Voluntario voluntario = new Voluntario("Pedro", "30111222", "pedro@mail.com", dom1);

        Voluntario voluntario2 = new Voluntario("Roberto", "31222333", "roberto@mail.com", dom2);

        Tarea regar = new Tarea("Regar plantas", LocalDate.now(), frutales);
        Tarea cortar = new Tarea("Cortar ramas", LocalDate.now(), frutales);
        voluntario.realizarTarea(regar);
        voluntario.realizarTarea(cortar);

        voluntario.setTurno(LocalDate.now(), "2:00 PM");

        // Capacitador y capacitación con 2 asistentes
        Capacitador capacitador = new Capacitador("Andrea", "27888999", "andrea@mail.com", dom2, "Permacultura");

        Capacitacion capacitacion = new Capacitacion("Capacitación de poda", LocalDate.now(), capacitador);
        capacitacion.addVoluntario(voluntario);
        capacitacion.addVoluntario(voluntario2);

        // Donante y donación
        Donante donante = new Donante("Lucas", "30987654", "lucas@mail.com", dom2);
        Donacion donacion = new Donacion(TipoDonacion.OTROS, "Donó flores", LocalDate.now(), donante);

        // Usar métodos
        System.out.println("Cosechas del sector Frutales:");
        for (Cosecha c : frutales.getCosechasDelSector()) {
            System.out.println(c.getFecha() + " - " + c.getCantidadKg() + " kg");
        }

        System.out.println("\nAsistentes a la capacitación:");
        capacitacion.mostrarAsistentes();

        System.out.println("\nDonaciones del donante:");
        donante.mostrarDonaciones();
    }
}
