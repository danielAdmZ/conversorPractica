package nyhestudios.monedas.nyhestudios.monedas.method;


import com.google.gson.Gson;

import nyhestudios.monedas.nyhestudios.monedas.model.conversion;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

public class apiRest {
    conversion saveJSON(String base_Code, String target_Code, double amount){


        URI uri = URI.create("https://v6.exchangerate-api.com/v6/0bb36ceba598c860fedbc95d/pair/"+base_Code+"/"+target_Code+"/"+amount);
        HttpClient client = HttpClient.newBuilder().build();
        HttpRequest request = HttpRequest.newBuilder().
                uri(uri).
                build();
        HttpResponse<String> response ;
        try {
            response = client.send(request,HttpResponse.BodyHandlers.ofString());
            return new Gson().fromJson(response.body(),conversion.class);
        }catch (IOException | InterruptedException e){
            throw new RuntimeException("Error No deseado" +e.getMessage());
        }

    }





}
