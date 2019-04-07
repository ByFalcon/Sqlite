package com.example.dam.sqlite;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;

import java.util.Objects;

public class Lugar implements Parcelable {

    private long id;
    private double latitud, longitud;
    private String localidad, pais, nombre;
    private String comentario;
    private int puntuacion;
    private String fecha;

    public Lugar() {
        this(0,"",0,0,"","","",0,"");
    }

    public Lugar(long id,String nombre, double latitud, double longitud, String localidad, String pais, String comentario, int puntuacion, String fecha) {
        this.id = id;
        this.nombre = nombre;
        this.latitud = latitud;
        this.longitud = longitud;
        this.localidad = localidad;
        this.pais = pais;
        this.comentario = comentario;
        this.puntuacion = puntuacion;
        this.fecha = fecha;
    }


    protected Lugar(Parcel in) {
        id = in.readLong();
        nombre = in.readString();
        latitud = in.readDouble();
        longitud = in.readDouble();
        localidad = in.readString();
        pais = in.readString();
        comentario = in.readString();
        puntuacion = in.readInt();
        fecha = in.readString();
    }

    public static final Creator<Lugar> CREATOR = new Creator<Lugar>() {
        @Override
        public Lugar createFromParcel(Parcel in) {
            return new Lugar(in);
        }

        @Override
        public Lugar[] newArray(int size) {
            return new Lugar[size];
        }
    };

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getLatitud() {
        return latitud;
    }

    public void setLatitud(double latitud) {
        this.latitud = latitud;
    }

    public double getLongitud() {
        return longitud;
    }

    public void setLongitud(double longitud) {
        this.longitud = longitud;
    }

    public String getLocalidad() {
        return localidad;
    }

    public void setLocalidad(String localidad) {
        this.localidad = localidad;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public String getComentario() {
        return comentario;
    }

    public void setComentario(String comentario) {
        this.comentario = comentario;
    }

    public int getPuntuacion() {
        return puntuacion;
    }

    public void setPuntuacion(int puntuacion) {
        this.puntuacion = puntuacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    @Override
    public String toString() {
        return "Lugar{" +
                "id=" + id +
                ", latitud=" + latitud +
                ", longitud=" + longitud +
                ", localidad='" + localidad + '\'' +
                ", pais='" + pais + '\'' +
                ", comentario='" + comentario + '\'' +
                ", puntuacion=" + puntuacion +
                ", fecha='" + fecha + '\'' +
                '}';
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeLong(id);
        dest.writeDouble(latitud);
        dest.writeDouble(longitud);
        dest.writeString(localidad);
        dest.writeString(pais);
        dest.writeString(nombre);
        dest.writeString(comentario);
        dest.writeInt(puntuacion);
        dest.writeString(fecha);
    }

}
