package modelo.dao;

import java.util.ArrayList;

import modelo.javabean.Contacto;

public class AgendaContactosDaoImplArrayList implements ContactoDao {

    private ArrayList<Contacto> lista;
    private String nombreAgenda;



    public AgendaContactosDaoImplArrayList(String string, String nombreAgenda) {
        super();
        this.lista = new ArrayList<>();
        this.nombreAgenda = nombreAgenda;
    }

    public boolean altaContacto(Contacto contacto) {
        if (lista.contains(contacto)) {
            return false;
        }
        lista.add(contacto);
        return true;
    }

    public boolean eliminarContacto(Contacto contacto) {
        return lista.remove(contacto);
    }

    public Contacto buscarUno(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return contacto;
            }
        }
        return null;
    }
    public Contacto buscarTelefono(String telefono) {
        for (Contacto contacto : lista) {
            if (contacto.getTelefono().equals(telefono)) {
                return contacto;
            }
        }
        return null;
    }
    public Contacto buscarEmail(String email) {
        for (Contacto contacto : lista) {
            if (contacto.getEmail().equals(email)) {
                return contacto;
            }
        }
        return null;
    }
    public ArrayList<Contacto> buscarContactosPorTresPrimeros(String nombre) {
        if (nombre.length() < 3) {
            return new ArrayList<>();
        }
        String tresPrimeros = nombre.substring(0, 3);
        ArrayList<Contacto> encontrados = new ArrayList<>();
        for (Contacto contacto : lista) {
            if (contacto.getNombre().startsWith(tresPrimeros)) {
                encontrados.add(contacto);
            }
        }
        return encontrados;
    }
    public ArrayList<Contacto> contactosPorEmpresa(String empresa) {
        ArrayList<Contacto> empresas = new ArrayList<>();
        for(Contacto contacto : lista) {
            if (contacto.getEmpresa().equals(empresas)) {
                empresas.add(contacto);
            }
        }
        return empresas;
    }

    public boolean cambiarDatos(Contacto contacto) {
        int indice = lista.indexOf(contacto);
        if (indice == -1) {
            return false;
        }
        Contacto contactoActual = lista.get(indice);
        if (!contactoActual.getNombre().equals(contacto.getNombre())) {
            return false;
        }
        if (!contacto.getApellidos().equals(contactoActual.getApellidos())) {
            contactoActual.setApellidos(contacto.getApellidos());
        }
        if (!contacto.getTelefono().equals(contactoActual.getTelefono())) {
            contactoActual.setTelefono(contacto.getTelefono());
        }
        if (!contacto.getEmail().equals(contactoActual.getEmail())) {
            contactoActual.setEmail(contacto.getEmail());
        }
        if (!contacto.getEmpresa().equals(contactoActual.getEmpresa())) {
            contactoActual.setEmpresa(contacto.getEmpresa());
        }
        return true;
    }

    @Override
    public boolean eliminarContacto(String nombre) {
        for (Contacto contacto : lista) {
            if (contacto.getNombre().equals(nombre)) {
                return lista.remove(contacto);
            }
        }
        return false;
    }
}