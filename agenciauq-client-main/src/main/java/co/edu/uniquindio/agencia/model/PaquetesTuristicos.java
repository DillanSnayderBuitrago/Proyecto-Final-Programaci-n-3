package co.edu.uniquindio.agencia.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class PaquetesTuristicos {
    private List<PaquetesTuristicos> paquetes;

    private String nombre;
    private int duracion;
    private List<String> serviciosAdicionales;
    private double precio;
    private int cupoMaximo;
    private List<Destino> destinos;
    private List<Reserva> reservas;
    private List<String> fechasDisponibles;

    public PaquetesTuristicos(String nombre, int duracion, List<String> serviciosAdicionales,
                            double precio, int cupoMaximo, List<Destino> destinos, List<String> fechasDisponibles) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.serviciosAdicionales = serviciosAdicionales;
        this.precio = precio;
        this.cupoMaximo = cupoMaximo;
        this.destinos = new ArrayList<>(destinos);
        this.reservas = new ArrayList<>();
        this.fechasDisponibles = new ArrayList<>(fechasDisponibles);
        this.paquetes = new ArrayList<>();
    }

    public void agregarPaquete(PaquetesTuristicos nuevoPaquete) {
        if (!paquetes.contains(nuevoPaquete)) {
            paquetes.add(nuevoPaquete);
            System.out.println("Paquete turístico agregado correctamente: " + nuevoPaquete.getNombre());
        } else {
            System.out.println("El paquete turístico ya existe en la lista.");
        }
    }

    public void borrarPaquete(PaquetesTuristicos paquete) {
        if (paquetes.contains(paquete)) {
            paquetes.remove(paquete);
            System.out.println("Paquete turístico eliminado correctamente: " + paquete.getNombre());
        } else {
            System.out.println("El paquete turístico no existe en la lista.");
        }
    }

    public List<PaquetesTuristicos> obtenerPaquetes() {
        return new ArrayList<>(paquetes);
    }

    public PaquetesTuristicos buscarPaquetePorNombre(String nombre) {
        for (PaquetesTuristicos paquete : paquetes) {
            if (paquete.getNombre().equals(nombre)) {
                return paquete;
            }
        }
        return null;
    }

    public void modificarPaquete(PaquetesTuristicos paqueteExistente, PaquetesTuristicos nuevoPaquete) {
        if (paquetes.contains(paqueteExistente)) {
            int index = paquetes.indexOf(paqueteExistente);
            paquetes.set(index, nuevoPaquete);
            System.out.println("Paquete turístico modificado correctamente: " + nuevoPaquete.getNombre());
        } else {
            System.out.println("El paquete turístico a modificar no existe en la lista.");
        }
    }

    public void imprimirDetallesPaquetes() {
        for (PaquetesTuristicos paquete : paquetes) {
            System.out.println(paquete.toString());
        }
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getDuracion() {
        return duracion;
    }

    public void setDuracion(int duracion) {
        this.duracion = duracion;
    }

    public List<String> getServiciosAdicionales() {
        return serviciosAdicionales;
    }

    public void setServiciosAdicionales(List<String> serviciosAdicionales) {
        this.serviciosAdicionales = serviciosAdicionales;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public int getCupoMaximo() {
        return cupoMaximo;
    }

    public void setCupoMaximo(int cupoMaximo) {
        this.cupoMaximo = cupoMaximo;
    }

    public List<Destino> getDestinos() {
        return destinos;
    }

    public void setDestinos(List<Destino> destinos) {
        this.destinos = destinos;
    }

    public List<Reserva> getReservas() {
        return reservas;
    }

    public void setReservas(List<Reserva> reservas) {
        this.reservas = reservas;
    }

    public List<String> getFechasDisponibles() {
        return fechasDisponibles;
    }

    public void setFechasDisponibles(List<String> fechasDisponibles) {
        this.fechasDisponibles = fechasDisponibles;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PaquetesTuristicos paquete = (PaquetesTuristicos) o;
        return Objects.equals(nombre, paquete.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "PaquetesTuristicos{" +
                "nombre='" + nombre + '\'' +
                ", duracion=" + duracion +
                ", serviciosAdicionales=" + serviciosAdicionales +
                ", precio=" + precio +
                ", cupoMaximo=" + cupoMaximo +
                ", destinos=" + destinos +
                ", reservas=" + reservas +
                ", fechasDisponibles=" + fechasDisponibles +
                '}';
    }
}
