/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulos_datas2;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author wesle
 */
public class Datas1 {

    public static void main(String[] args) throws InterruptedException {

        Thread.sleep(5000);
        Thread threadBoleto = new Thread(thread1);
        threadBoleto.start();

    }
    private static Runnable thread1 = new Runnable() {
        @Override
        public void run() {
            LocalDate localData = LocalDate.parse("2020-05-06");
            LocalDate dataVencida = LocalDate.parse("2020-05-07");
            double valorBoleto = 200.50;

            for (int mes = 1; mes <= 12; mes++) {
                localData = localData.plusMonths(1);
                System.out.println("Valor do Boleto: " + valorBoleto
                        + " Vencimento do boleto: " + localData
                                .format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException ex) {
                    ex.printStackTrace();
                }
            }
        }

    };
}
