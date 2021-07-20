/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wesle
 */
public class DatasJava10 {

    public static void main(String[] args) {

        LocalDate dataBase = LocalDate.parse("2020-05-10");

        System.out.println("Mais 5 anos: " + (dataBase = dataBase.plusYears(5)));

        System.out.println("Mais 5 meses: " + (dataBase = dataBase.plusMonths(5)));

        System.out.println("Mais 5 semanas: " + (dataBase = dataBase.plusWeeks(5)));

        System.out.println("Mais 5 dias: " + (dataBase = dataBase.plusDays(5)));

        System.out.println("Mais 1 ano: " + (dataBase = dataBase.minusYears(1)));

        for (int mes = 1; mes <= 12; mes++) {
            dataBase = dataBase.plusMonths(1);

            System.out.println("Data de vencimento do boleto: " + dataBase
                    .format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
                    + " do mês: " + mes);
        }
    }

}
