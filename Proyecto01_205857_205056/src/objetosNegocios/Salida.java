/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package objetosNegocios;

//import java.util.Date;
import java.sql.Timestamp;
/**
 *
 * @author Dany
 */
public class Salida {
    private int idSalida;
    private Timestamp fecha;
    private String destino;
    private Barco barco;
 
    public Salida(Timestamp fecha, String destino, Barco barco) {
        this.fecha = fecha;
        this.destino = destino;
        this.barco = barco;
    }

    public Salida(int idSalida, Timestamp fecha, String destino, Barco barco) {
        this.idSalida = idSalida;
        this.fecha = fecha;
        this.destino = destino;
        this.barco = barco;
    }

    public int getIdSalida() {
        return idSalida;
    }

    public void setIdSalida(int idSalida) {
        this.idSalida = idSalida;
    }

    public Timestamp getFecha() {
        return fecha;
    }

    public void setFecha(Timestamp fecha) {
        this.fecha = fecha;
    }

    public String getDestino() {
        return destino;
    }

    public void setDestino(String destino) {
        this.destino = destino;
    }

    public Barco getBarco() {
        return barco;
    }

    public void setBarco(Barco barco) {
        this.barco = barco;
    }

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 31 * hash + this.idSalida;
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
        final Salida other = (Salida) obj;
        if (this.idSalida != other.idSalida) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return idSalida+"";
    }
    
    public Object[] toArray() {
        return new Object[]{
            this.getIdSalida(),
            this.getFecha(),
            this.getDestino(),
            this.getBarco(),
            this.getBarco().getSocio()
        };
    }

}
