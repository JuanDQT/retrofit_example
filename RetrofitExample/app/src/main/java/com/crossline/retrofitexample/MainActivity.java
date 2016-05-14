package com.crossline.retrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.crossline.retrofitexample.network.NetworkInterfaces;
import com.crossline.retrofitexample.object.request.RequestPost;
import com.crossline.retrofitexample.object.request.ResponsePost;

import org.w3c.dom.Text;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class MainActivity extends AppCompatActivity implements Callback<ResponsePost>, View.OnClickListener
{

    private Button btnLlamarServicio;
    private TextView txtEjemplo;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();

    }

    private void initView()
    {
        btnLlamarServicio = (Button)findViewById(R.id.btnLlamarServicio);
        txtEjemplo = (TextView)findViewById(R.id.txtEjemplo);
        btnLlamarServicio.setOnClickListener(this);
    }

    private void makeRetrofitCall()
    {
        //Declaramos nuestro objeto Retrofit y le indicamos el endpoint
        //y con que vamos a hacer el parse de la información finalizamos con build
        Retrofit retrofit = new Retrofit.Builder()
                .baseUrl(NetworkInterfaces.URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        //Declaramos y llenamos nuestro objeto Request
        RequestPost requestPost = new RequestPost("nombre Ejemplo","Posición y gustos");

        //Declaramos la interfaz y dejamos que retrofit la instancie
        NetworkInterfaces interfaces = retrofit.create(NetworkInterfaces.class);

        //Hacemos el objeto tipo llamada
        Call<ResponsePost> responseCall = interfaces.hacerLlamada(requestPost);

        //Hacemos la llamada asíncrona. En este caso declaré el callback dentro
        //del mismo método. En lo personal me gusta crear una clase aparte
        //o implementar la interfaz en la clase
        responseCall.enqueue(this);

    }

    @Override
    public void onResponse(Call<ResponsePost> call, Response<ResponsePost> response)
    {
        ResponsePost responsePost = response.body();
        txtEjemplo.setText(responsePost.toString());
    }


    @Override
    public void onFailure(Call<ResponsePost> call, Throwable t)
    {
        int x = 0;
        x++;
    }

    @Override
    public void onClick(View v)
    {
        switch (v.getId())
        {
            case R.id.btnLlamarServicio:
                makeRetrofitCall();
                break;
        }
    }
}
