package modelo.javabean;

import java.util.Objects;

public class Contacto {
    private String nombre;
    private String apellidos;
    private String telefono;
    private String email;
    private String empresa;

    /**
     *
     * @param nombre El nombre del Contacto
     * @param apellidos Los apellidos del contacto
     * @param telefono El telefono del contacto
     * @param email El email del contacto
     * @param empresa La empresa para la que trabaja del contacto
     */
    public Contacto(String nombre, String apellidos, String telefono, String email, String empresa) {
        super();
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.telefono = telefono;
        this.email = email;
        this.empresa = empresa;
    }


    /*
     *Creo los metodos getters and setters de todos los atributos de cada contacto
     */
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getEmpresa() {
        return empresa;
    }

    public void setEmpresa(String empresa) {
        this.empresa = empresa;
    }
    /**
     * Devuelve el codigo hash del contacto
     * @return el codigo hash del contacto
     */
    @Override
    public int hashCode() {
        return Objects.hash(nombre);
    }

    /**
     * Comprueba si un contacto es igual a otro basandose en el nombre
     * @param obj el contacto
     * @return true si son iguales false si no
     */

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Contacto other = (Contacto) obj;
        return Objects.equals(nombre, other.nombre);
    }

    /**
     * Devuelve una cadena con toda la info del contacto
     * @return una cadena con toda la info del contacto
     */

    @Override
    public String toString() {
        return "Contacto Nombre=" + nombre + ", Apellidos=" + apellidos + ", Telefono=" + telefono + ", Email=" + email
                + ", Empresa=" + empresa + ".\n";
    }



}
