package nyhestudios.monedas.nyhestudios.monedas.method;

import com.google.gson.JsonSyntaxException;
import nyhestudios.monedas.nyhestudios.monedas.model.conversion;

import java.util.Scanner;

public class mathConversion {

    public static int mensaje(){
        Scanner read = new Scanner(System.in);
        var type = 0;
        System.out.println("***********************************************");
        System.out.println("1) Peso Mexicano ➡️ Dolar");
        System.out.println("2) Dolar ➡️ Peso Mexicano");
        System.out.println("3) Peso Mexicano ➡️ Euro");
        System.out.println("4) Euro ➡️ Peso Mexicano");
        System.out.println("5) Peso Mexicano ➡️ Yen Japones");
        System.out.println("6) Yen Japones ➡️ Peso Mexicano");

        System.out.println("***********************************************");




             try{
                 type = Integer.parseInt(read.nextLine());
                 System.out.println("Ingresa la cantidad a convertir");
                 double amount = Double.parseDouble(read.nextLine());
                 apiRest saveD = new apiRest();
                 conversion conv;
                 switch (type){
                     case 1:
                         conv =saveD.saveJSON("MXN","USD",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());
                         break;
                     case 2:
                         conv =saveD.saveJSON("USD","MXN",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());

                         break;
                     case 3:
                         conv =saveD.saveJSON("MXN","EUR",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());

                         break;
                     case 4:
                         conv =saveD.saveJSON("EUR","MXN",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());

                         break;
                     case 5:
                         conv =saveD.saveJSON("MXN","JPY",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());

                         break;
                     case 6:
                         conv =saveD.saveJSON("JPY","MXN",amount);
                         System.out.println("Convertido de: "+ conv.base_code() +" valor: "+conv.conversion_rate() + " a: "+ conv.target_code() + " resultado: "+ conv.conversion_result());

                         break;

                     default:
                         System.out.println("Conversion No Disponible Lo siento 😔");
                         break;
                 }
             }catch (NumberFormatException | JsonSyntaxException e){
                 System.out.println("error De conversion"+ e.getMessage());
             }

        System.out.println("¿Deseas Convertir alguna otra moneda? (7 = No❌ / 0 = Si👍)");
        type = Integer.parseInt(read.nextLine());
         return type;
    }

}
