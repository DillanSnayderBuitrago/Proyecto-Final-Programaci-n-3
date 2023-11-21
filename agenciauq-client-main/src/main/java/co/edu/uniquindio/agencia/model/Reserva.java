package co.edu.uniquindio.agencia.model;
import java.util.Objects;

public class Reserva {private static int contadorReservas = 1;

    private int numeroReserva;
    private String fechaSolicitud;
    private String fechaPlanificada;
    private Cliente cliente;
    private int cantidadPersonas;
    private PaquetesTuristicos paquetesTuristicos;
    private GuiaTuristico guiaTuristico;
    private EstadoReserva estadoReserva;

    public Reserva(String fechaSolicitud, String fechaPlanificada, Cliente cliente,
                   int cantidadPersonas, PaquetesTuristicos paqueteTuristico, GuiaTuristico guiaTuristico) {
        this.numeroReserva = contadorReservas++;
        this.fechaSolicitud = fechaSolicitud;
        this.fechaPlanificada = fechaPlanificada;
        this.cliente = cliente;
        this.cantidadPersonas = cantidadPersonas;
        this.paquetesTuristicos = paqueteTuristico;
        this.guiaTuristico = guiaTuristico;
        this.estadoReserva = EstadoReserva.PENDIENTE;
    }

    public int getNumeroReserva() {
        return numeroReserva;
    }

    public String getFechaSolicitud() {
        return fechaSolicitud;
    }

    public void setFechaSolicitud(String fechaSolicitud) {
        this.fechaSolicitud = fechaSolicitud;
    }

    public String getFechaPlanificada() {
        return fechaPlanificada;
    }

    public void setFechaPlanificada(String fechaPlanificada) {
        this.fechaPlanificada = fechaPlanificada;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public int getCantidadPersonas() {
        return cantidadPersonas;
    }

    public void setCantidadPersonas(int cantidadPersonas) {
        this.cantidadPersonas = cantidadPersonas;
    }

    public PaquetesTuristicos getPaqueteTuristico() {
        return paquetesTuristicos;
    }

    public void setPaqueteTuristico(PaquetesTuristicos paqueteTuristico) {
        this.paquetesTuristicos = paqueteTuristico;
    }

    public GuiaTuristico getGuiaTuristico() {
        return guiaTuristico;
    }

    public void setGuiaTuristico(GuiaTuristico guiaTuristico) {
        this.guiaTuristico = guiaTuristico;
    }

    public EstadoReserva getEstadoReserva() {
        return estadoReserva;
    }

    public void setEstadoReserva(EstadoReserva estadoReserva) {
        this.estadoReserva = estadoReserva;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Reserva reserva = (Reserva) o;
        return numeroReserva == reserva.numeroReserva;
    }

    @Override
    public int hashCode() {
        return Objects.hash(numeroReserva);
    }

    @Override
    public String toString() {
        return "Reserva{" +
                "numeroReserva=" + numeroReserva +
                ", fechaSolicitud='" + fechaSolicitud + '\'' +
                ", fechaPlanificada='" + fechaPlanificada + '\'' +
                ", cliente=" + cliente +
                ", cantidadPersonas=" + cantidadPersonas +
                ", paqueteTuristico=" + paquetesTuristicos +
                ", guiaTuristico=" + guiaTuristico +
                ", estadoReserva=" + estadoReserva +
                '}';
    }
}
