package co.edu.uniquindio.agencia.model;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Cliente {
    private List<Usuario> clientes;

    public Cliente() {
        this.clientes = new ArrayList<>();
    }

    public static class Usuario {
        private String nombre;

        private String id;
        private String apellido;
        private String correo;

        private String contraseña;
        private String telefono;
        private String direccion;

        public Usuario(String nombre,String id, String apellido, String correo, String contraseña, String telefono, String direccion) {
            this.nombre = nombre;
            this.id=id;
            this.apellido = apellido;
            this.correo = correo;
            this.contraseña = contraseña;
            this.telefono = telefono;
            this.direccion = direccion;
        }



        public String getNombre() {
            return nombre;
        }

        public void setNombre(String nombre) {
            this.nombre = nombre;
        }
        public String getId() {
            return id;
        }
        public String getApellido() {
            return apellido;
        }

        public void setApellido(String apellido) {
            this.apellido = apellido;
        }

        public String getCorreo() {
            return correo;
        }

        public void setCorreo(String correo) {
            this.correo = correo;
        }

        public String getContraseña() {
            return contraseña;
        }

        public void setContraseña(String contraseña) {
            this.contraseña = contraseña;
        }

        public String getTelefono() {
            return telefono;
        }


        public void setTelefono(String telefono) {
            this.telefono = telefono;
        }

        public String getDireccion() {
            return direccion;
        }

        public void setDireccion(String direccion) {
            this.direccion = direccion;
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) return true;
            if (o == null || getClass() != o.getClass()) return false;
            Usuario usuario = (Usuario) o;
            return Objects.equals(correo, usuario.correo);
        }

        @Override
        public int hashCode() {
            return Objects.hash(correo);
        }

        @Override
        public String toString() {
            return "Usuario{" +
                    "nombre='" + nombre + '\'' +
                    ", identificacion='" + id + '\'' +
                    ", apellido='" + apellido + '\'' +
                    ", correo='" + correo + '\'' +
                    ", telefono='" + telefono + '\'' +
                    ", direccion='" + direccion + '\'' +
                    '}';
        }
    }


    public void agregarCliente(Usuario nuevoCliente) {
        if (!clientes.contains(nuevoCliente)) {
            clientes.add(nuevoCliente);
            System.out.println("Cliente agregado correctamente: " + nuevoCliente.getNombre());
        } else {
            System.out.println("El cliente ya existe en la lista.");
        }
    }


    public void borrarCliente(Usuario cliente) {
        if (clientes.contains(cliente)) {
            clientes.remove(cliente);
            System.out.println("Cliente eliminado correctamente: " + cliente.getNombre());
        } else {
            System.out.println("El cliente no existe en la lista.");
        }
    }

    public List<Usuario> obtenerClientes() {
        return new ArrayList<>(clientes);
    }


    public Usuario buscarClientePorCedula(String id) {
        for (Usuario cliente : clientes) {
            if (cliente.getId().equals(id)) {
                return cliente;
            }
        }
        return null;
    }

    public void modificarCliente(Usuario clienteExistente, Usuario nuevoCliente) {
        if (clientes.contains(clienteExistente)) {
            int index = clientes.indexOf(clienteExistente);
            clientes.set(index, nuevoCliente);
            System.out.println("Cliente modificado correctamente: " + nuevoCliente.getNombre());
        } else {
            System.out.println("El cliente a modificar no existe en la lista.");
        }
    }


    public void imprimirDetallesClientes() {
        for (Usuario cliente : clientes) {
            System.out.println(cliente.toString());
        }
    }
}
