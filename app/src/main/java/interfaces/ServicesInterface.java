package interfaces;

import java.util.List;

import models.Ejemplo;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Dagorik on 23/11/16.
 */

public interface ServicesInterface {

    //Peticion get y se coloca la uri
    @GET("/api/json/get/EkphH5xyM")
    //Se hace un call a la lista del modelo de ejemplos.
    Call<List<Ejemplo>> LoadData();

}
