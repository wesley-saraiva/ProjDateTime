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
public class DatasJava5 {

    public static void main(String[] args) throws ParseException {

        Date dateInicial = new SimpleDateFormat("dd/MM/yyyy").parse("21/07/2021");

        Calendar calendar = Calendar.getInstance();
        calendar.setTime(dateInicial);

        for (int parcela = 1; parcela <= 12; parcela++) {
            calendar.add(Calendar.MONTH, 1);

            System.out.println("Parcela numero: " + parcela + " vencimento é em: "
                    + new SimpleDateFormat("dd/MM/yyyy").format(calendar.getTime()));
        }
    }
}
