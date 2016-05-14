package com.crossline.retrofitexample.object.request;

/**
 * Created by jacevedo on 5/14/16.
 */
public class RequestPost
{
    private String name;
    private String consulta;

    public RequestPost(){}

    public RequestPost(String name, String consulta){
        this.name = name;
        this.consulta = consulta;
    }

    public String getName(){
        return name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getConsulta(){
        return consulta;
    }

    public void setConsulta(String consulta){
        this.consulta = consulta;
    }

}
