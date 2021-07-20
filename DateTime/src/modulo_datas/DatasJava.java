/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author wesle
 */
public class DatasJava {

    public static void main(String[] args) throws ParseException {

        Calendar calendar = Calendar.getInstance();

        Date date = new Date();

        System.out.println("Data em milisegundos:" + date.getTime());
        System.out.println("Calendar em milisegundos:" + calendar.getTimeInMillis());
        System.out.println("Mes:" + date.getMonth());
        System.out.println("calendar do mes:" + calendar.get(Calendar.MONTH));
        System.out.println("Dia do mes:" + date.getDate());
        System.out.println("Calendar dia do mes:" + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia da semana:" + date.getDay());
        System.out.println("Calendar dia da semana:" + (calendar.get(Calendar.DAY_OF_WEEK) - 1));
        System.out.println("Hora do dia:" + date.getHours());
        System.out.println("Calendar hora do dia:" + calendar.get(Calendar.HOUR));
        System.out.println("Minuto da hora:" + date.getMinutes());
        System.out.println("Calendar minuto da hora:" + calendar.get(Calendar.MINUTE));
        System.out.println("Segundos:" + date.getSeconds());
        System.out.println("Calendar segundos:" + calendar.get(Calendar.SECOND));
        System.out.println("Ano:" + (date.getYear() + 1900));
        System.out.println("Calendar do ano:" + calendar.get(Calendar.YEAR));

        //------------------Simpe Date Format---------------------
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

        System.out.println("Data atual em formato de string: " + simpleDateFormat.format(date));

        System.out.println("Calendar atual formato de srig: " + simpleDateFormat.format(calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Data atual em formato banco de dados: " + simpleDateFormat.format(date));

        System.out.println("Calendar atual em  formato de banco de dados:" + simpleDateFormat.format(
                calendar.getTime()));

        simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        System.out.println("Objeto Date: " + simpleDateFormat.parse("25/05/2020"));

        simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss");

        System.out.println("Objeto Date: " + simpleDateFormat.parse("2020/10/15 15:20:50"));
    }
}
