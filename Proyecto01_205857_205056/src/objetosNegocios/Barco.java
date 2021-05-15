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
public class Barco {
    private int idBarco;
    private String matricula;
    private String nombre;
    private int numamarre;
    private float cuota;
    private Socio socio;

    public Barco() {
    }

    public Barco(int idBarco, String matricula, String nombre, int numamarre, float cuota, Socio socio) {
        this.idBarco = idBarco;
        this.matricula = matricula;
        this.nombre = nombre;
        this.numamarre = numamarre;
        this.cuota = cuota;
        this.socio=socio;
    }

    public Barco(String matricula, String nombre, int numamarre, float cuota, Socio socio) {
        this.matricula = matricula;
        this.nombre = nombre;
        this.numamarre = numamarre;
        this.cuota = cuota;
        this.socio=socio;;
    }

    public int getIdBarco() {
        return idBarco;
    }

    public void setIdBarco(int idBarco) {
        this.idBarco = idBarco;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumamarre() {
        return numamarre;
    }

    public void setNumamarre(int numamarre) {
        this.numamarre = numamarre;
    }

    public float getCuota() {
        return cuota;
    }

    public void setCuota(float cuota) {
        this.cuota = cuota;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio=socio;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 79 * hash + this.idBarco;
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
        final Barco other = (Barco) obj;
        if (this.idBarco != other.idBarco) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return matricula+"( "+nombre+" )";
    }
    
    public Object[] toArray() {
        return new Object[]{
            this.getIdBarco(),
            this.getMatricula(),
            this.getNombre(),
            this.getNumamarre(),
            this.getCuota(),
            this.socio.getIdSocio(),
            this.socio.getNombre()
        };
    }
}
