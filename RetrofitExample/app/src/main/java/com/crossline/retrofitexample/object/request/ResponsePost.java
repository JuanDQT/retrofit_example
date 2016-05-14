package com.crossline.retrofitexample.object.request;

import java.util.Arrays;

/**
 * Created by jacevedo on 5/14/16.
 */
public class ResponsePost
{
    private String nombre;
    private String pais;
    private LatLng latLng;
    private String[] gustos;

    public ResponsePost(){}

    public ResponsePost(String nombre, String pais, LatLng latLng, String[] gustos){
        this.nombre = nombre;
        this.pais = pais;
        this.latLng = latLng;
        this.gustos = gustos;
    }

    public String getNombre(){
        return nombre;
    }

    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public String getPais(){
        return pais;
    }

    public void setPais(String pais){
        this.pais = pais;
    }

    public LatLng getLatLng(){
        return latLng;
    }

    public void setLatLng(LatLng latLng){
        this.latLng = latLng;
    }

    public String[] getGustos(){
        return gustos;
    }

    public void setGustos(String[] gustos){
        this.gustos = gustos;
    }

    public class LatLng{
        private float lat;
        private float lng;

        public LatLng(){}

        public LatLng(float lat, float lng){
            this.lat = lat;
            this.lng = lng;
        }

        public float getLat(){
            return lat;
        }

        public void setLat(float lat){
            this.lat = lat;
        }

        public float getLng(){
            return lng;
        }

        public void setLng(float lng){
            this.lng = lng;
        }

        @Override
        public String toString()
        {
            return "LatLng{" +
                    "lat=" + lat +
                    ", lng=" + lng +
                    '}';
        }
    }

    @Override
    public String toString()
    {
        return "ResponsePost{" +
                "nombre='" + nombre + '\'' +
                ", pais='" + pais + '\'' +
                ", latLng=" + latLng +
                ", gustos=" + Arrays.toString(gustos) +
                '}';
    }
}
