/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.time.LocalDate;
import java.time.Month;
import java.time.Period;

/**
 *
 * @author wesle
 */
public class DatasJava9 {

    public static void main(String[] args) {

        LocalDate dataAntiga = LocalDate.of(2020, 2, 7);

        LocalDate dataNova = LocalDate.of(2021, 7, 4);

        System.out.println("Data antiga é maior que data nova: " + dataAntiga
                .isAfter(dataNova));

        System.out.println("Data antiga é anterior a data nova: " + dataAntiga
                .isBefore(dataNova));

        System.out.println("Datas sao iguais: " + dataAntiga.isEqual(dataNova));

        System.out.println("==================================================");

        Period periodo = Period.between(dataAntiga, dataNova);

        System.out.println("Quanto dias: " + periodo.getDays());

        System.out.println("Quantos meses: " + periodo.getMonths());

        System.out.println("Quantos anos: " + periodo.getYears());

        System.out.println("Somente meses: " + periodo.toTotalMonths());

        System.out.println("Periodo é: " + periodo.getYears() + " anos "
                + periodo.getMonths() + " meses " + periodo.getDays() + " dias ");

    }
}
