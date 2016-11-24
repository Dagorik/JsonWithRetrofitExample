package easybuycom.dagorik.jsonwithretrofitexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import java.util.List;

import interfaces.ServicesInterface;
import models.Ejemplo;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        LoadData();
    }


    public void LoadData(){

        //Configuracion inicial de retorfit
        Retrofit retrofit = new Retrofit.Builder()
                                .baseUrl("http://beta.json-generator.com/")
                                .addConverterFactory(GsonConverterFactory.create())
                                .build();

        final ServicesInterface cliente = retrofit.create(ServicesInterface.class);

        cliente.LoadData().enqueue(new Callback<List<Ejemplo>>() {
            //Si la cpeticion es exitosa
            @Override
            public void onResponse(Call<List<Ejemplo>> call, Response<List<Ejemplo>> response) {

                //Imprimiendo todo el body (Todo el json que te mandan).
                Log.d("MyLogBody",response.body()+"");

                //Obteniendo el titulo de la posicion 0.
                String title = response.body().get(0).getTitle();
                Log.d("MyLog",title);

            }

            //Si la peticion es fallida imprime el error.
            @Override
            public void onFailure(Call<List<Ejemplo>> call, Throwable t) {
                Log.d("MyLog",t.getMessage());
            }
        });




    }


}
