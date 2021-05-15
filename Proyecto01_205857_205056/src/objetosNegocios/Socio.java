/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocios;

/**
 *
 * @author Dany
 */
public class Socio {
    private int idSocio;
    private String dni;
    private String nombre;

    public Socio(){}

    public Socio(int idSocio, String dni, String nombre) {
        this.idSocio = idSocio;
        this.dni = dni;
        this.nombre = nombre;
    } 

    public Socio(String dni, String nombre) {
        this.dni = dni;
        this.nombre = nombre;
    }
    
    
    public int getIdSocio() {
        return idSocio;
    }

    public void setId(int idSocio) {
        this.idSocio = idSocio;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idSocio;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Socio other = (Socio) obj;
        if (this.idSocio != other.idSocio) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idSocio +"( "+nombre+")";
    }
    
    public Object[] toArray() {
        return new Object[]{
            this.getIdSocio(),
            this.getDni(),
            this.getNombre(),
        };
    }
}
