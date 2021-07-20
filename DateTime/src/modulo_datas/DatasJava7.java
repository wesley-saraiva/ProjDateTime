/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

/**
 *
 * @author wesle
 */
public class DatasJava7 {

    public static void main(String[] args) {

        LocalDate localDate = LocalDate.now();

        System.out.println("Data atual: " + localDate.format(DateTimeFormatter
                .ofPattern("dd/MM/yyyy")));

        System.out.println("Dia da semana: " + localDate.getDayOfWeek());

        System.out.println("Dia do mês: " + localDate.getDayOfMonth());

        System.out.println("Dia do ano: " + localDate.getDayOfYear());

        System.out.println("Mês: " + localDate.getMonth());

        System.out.println("Ano: " + localDate.getYear());
    }
}
