package co.edu.uniquindio.agencia.model;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
public class GuiaTuristico {private List<GuiaTuristico> guias;

    private String identificacion;
    private String nombreCompleto;
    private List<String> idiomas;
    private int experiencia;

    public GuiaTuristico(String identificacion, String nombreCompleto, List<String> idiomas, int experiencia) {
        this.identificacion = identificacion;
        this.nombreCompleto = nombreCompleto;
        this.idiomas = idiomas;
        this.experiencia = experiencia;
        this.guias = new ArrayList<>();
    }

    public void agregarGuia(GuiaTuristico nuevoGuia) {
        if (!guias.contains(nuevoGuia)) {
            guias.add(nuevoGuia);
            System.out.println("Guía turístico agregado correctamente: " + nuevoGuia.getNombreCompleto());
        } else {
            System.out.println("El guía turístico ya existe en la lista.");
        }
    }

    public void borrarGuia(GuiaTuristico guia) {
        if (guias.contains(guia)) {
            guias.remove(guia);
            System.out.println("Guía turístico eliminado correctamente: " + guia.getNombreCompleto());
        } else {
            System.out.println("El guía turístico no existe en la lista.");
        }
    }

    public List<GuiaTuristico> obtenerGuias() {
        return new ArrayList<>(guias);
    }

    public GuiaTuristico buscarGuiaPorIdentificacion(String identificacion) {
        for (GuiaTuristico guia : guias) {
            if (guia.getIdentificacion().equals(identificacion)) {
                return guia;
            }
        }
        return null;
    }

    public void modificarGuia(GuiaTuristico guiaExistente, GuiaTuristico nuevoGuia) {
        if (guias.contains(guiaExistente)) {
            int index = guias.indexOf(guiaExistente);
            guias.set(index, nuevoGuia);
            System.out.println("Guía turístico modificado correctamente: " + nuevoGuia.getNombreCompleto());
        } else {
            System.out.println("El guía turístico a modificar no existe en la lista.");
        }
    }

    public void imprimirDetallesGuias() {
        for (GuiaTuristico guia : guias) {
            System.out.println(guia.toString());
        }
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCompleto() {
        return nombreCompleto;
    }

    public void setNombreCompleto(String nombreCompleto) {
        this.nombreCompleto = nombreCompleto;
    }

    public List<String> getIdiomas() {
        return idiomas;
    }

    public void setIdiomas(List<String> idiomas) {
        this.idiomas = idiomas;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        GuiaTuristico guia = (GuiaTuristico) o;
        return Objects.equals(identificacion, guia.identificacion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(identificacion);
    }

    @Override
    public String toString() {
        return "GuiaTuristico{" +
                "identificacion='" + identificacion + '\'' +
                ", nombreCompleto='" + nombreCompleto + '\'' +
                ", idiomas=" + idiomas +
                ", experiencia=" + experiencia +
                '}';
    }
}
