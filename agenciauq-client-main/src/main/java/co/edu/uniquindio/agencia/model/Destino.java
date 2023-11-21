package co.edu.uniquindio.agencia.model;

import lombok.*;



import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@Getter
@Setter
@ToString

@AllArgsConstructor
public class Destino {
    private List<Destino> destinos;

    private String nombre;
    private String ciudad;
    private String descripcion;
    private List<String> imagenes;
    private String clima;

    public Destino(String nombre, String ciudad, String descripcion, List<String> imagenes, String clima) {
        this.nombre = nombre;
        this.ciudad = ciudad;
        this.descripcion = descripcion;
        this.imagenes = imagenes;
        this.clima = clima;
        this.destinos = new ArrayList<>();
    }

    public void agregarDestino(Destino nuevoDestino) {
        if (!destinos.contains(nuevoDestino)) {
            destinos.add(nuevoDestino);
            System.out.println("Destino agregado correctamente: " + nuevoDestino.getNombre());
        } else {
            System.out.println("El destino ya existe en la lista.");
        }
    }

    public void borrarDestino(Destino destino) {
        if (destinos.contains(destino)) {
            destinos.remove(destino);
            System.out.println("Destino eliminado correctamente: " + destino.getNombre());
        } else {
            System.out.println("El destino no existe en la lista.");
        }
    }

    public List<Destino> obtenerDestinos() {
        return new ArrayList<>(destinos);
    }

    public Destino buscarDestinoPorNombre(String nombre) {
        for (Destino destino : destinos) {
            if (destino.getNombre().equals(nombre)) {
                return destino;
            }
        }
        return null;
    }

    public void modificarDestino(Destino destinoExistente, Destino nuevoDestino) {
        if (destinos.contains(destinoExistente)) {
            int index = destinos.indexOf(destinoExistente);
            destinos.set(index, nuevoDestino);
            System.out.println("Destino modificado correctamente: " + nuevoDestino.getNombre());
        } else {
            System.out.println("El destino a modificar no existe en la lista.");
        }
    }

    public void imprimirDetallesDestinos() {
        for (Destino destino : destinos) {
            System.out.println(destino.toString());
        }
    }

    // Getters y Setters (puedes generarlos automáticamente en muchos IDEs)

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public List<String> getImagenes() {
        return imagenes;
    }

    public void setImagenes(List<String> imagenes) {
        this.imagenes = imagenes;
    }

    public String getClima() {
        return clima;
    }

    public void setClima(String clima) {
        this.clima = clima;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Destino destino = (Destino) o;
        return Objects.equals(nombre, destino.nombre);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    @Override
    public String toString() {
        return "Destino{" +
                "nombre='" + nombre + '\'' +
                ", ciudad='" + ciudad + '\'' +
                ", descripcion='" + descripcion + '\'' +
                ", imagenes=" + imagenes +
                ", clima='" + clima + '\'' +
                '}';
    }
}
