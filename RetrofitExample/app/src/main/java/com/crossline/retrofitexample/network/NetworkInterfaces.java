package com.crossline.retrofitexample.network;

import com.crossline.retrofitexample.object.request.RequestPost;
import com.crossline.retrofitexample.object.request.ResponsePost;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.Headers;
import retrofit2.http.POST;

/**
 * Created by jacevedo on 5/14/16.
 */
public interface NetworkInterfaces
{
    //Direccion del request en mi caso la ip de mi computador personal
    String URL = "http://192.168.0.15/";

    @Headers({
            "Accept: application/json",
            "Content-type: application/json"
    })
    @POST("retrofit")
    Call<ResponsePost> hacerLlamada(@Body RequestPost requestPost);

}
