/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos_datas2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wesle
 */
public class Datas2 {

    public static void main(String[] args) {

        LocalDate dataLocal = LocalDate.parse("2020-05-01");

        LocalDate datalocal2 = LocalDate.parse("2020-05-02");

        double valor = 25.45;
        if (dataLocal.equals(datalocal2)) {

            System.out.println("Valor: " + valor + " - Ate no dia do vencimento: "
                    + dataLocal.format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));

        } else {
            double valorVencimento = valor * 5;
            System.out.println("Passou da data de validade sera acrecentado 5% "
                    + "de juros: " + "Valor Atual: " + valorVencimento);
        }
    }
}
