/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 *
 * @author wesle
 */
public class DatasJava3 {
    
    public static void main(String[] args) throws ParseException {
        
        Calendar calendar = Calendar.getInstance();//pega a data atual;

        //Simular que data vem do banco de dados;
        //Definindo um data qualquer;
        calendar.setTime(new SimpleDateFormat("dd-MM-yyyy").parse("10-03-2020"));
        
        calendar.add(Calendar.DAY_OF_MONTH, -40);        
        System.out.println("Somando o dia do mes: " + new SimpleDateFormat(
                "dd-MM-yyyy").format(calendar.getTime()));
        
        calendar.add(Calendar.MONTH, 1);
        System.out.println("Somando o mes:" + new SimpleDateFormat("dd/MM/yyyy")
                .format(calendar.getTime()));
        
        calendar.add(Calendar.YEAR, 1);
        System.out.println("Somando o ano:" + new SimpleDateFormat("yyyy-MM-dd")
                .format(calendar.getTime()));
    }
}
