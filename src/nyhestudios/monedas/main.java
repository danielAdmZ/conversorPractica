package nyhestudios.monedas;

import nyhestudios.monedas.nyhestudios.monedas.model.conversion;
import nyhestudios.monedas.nyhestudios.monedas.method.*;

import java.io.IOException;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        int loopS = 0;
        while (loopS !=7){
            try {
                loopS = mathConversion.mensaje();
            }catch (NumberFormatException e){
                System.out.println("Caracter Invalido"+ e);
            }



        }
    }



}
