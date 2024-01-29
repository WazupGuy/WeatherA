package com.example.wheathera;

import android.widget.Toast;
import android.content.Context;
public class AlertDegreeMessage{
    private City city;
    private double temp ;
    private double wind;

    public AlertDegreeMessage(City city) {
        this.city = city;
        this.temp=temp;
        this.wind=wind;
    }

    public static boolean degreeCheck(double temp) {
        final double minTemp = -10; //par défault on a mis des valeurs
        final double maxTemp = 30;
            if(temp < minTemp || temp > maxTemp ) return true;
            else return false;
        }




    public static boolean windCheck(double wind) {
            if(wind > 80) return true;
            else return false;
    }

    /*
    @Override
    public void descriptionCheck() {
        try{
            if (city.getCityName()) throw new Exception("Alerte Sounami"));
            else{
                throw new Exception("Alerte Volcan");
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

    }*/
}
