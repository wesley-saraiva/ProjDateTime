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
public class DatasJava2 {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd/MM/yyyy");

        Date dataVencBoleto = simpleDateFormat.parse("10/04/2020");

        Date dataAtual = simpleDateFormat.parse("07/04/2020");

        //After: se a data1 e maior que a data2
        //Before: se  a data1 e menor que a data2
        //Se a data 1 e maior que a data 2
        if (dataVencBoleto.after(dataAtual)) {//Posterior ou maior ou depois da data atual
            System.out.println("Boleto dentro do prazo");
        } else {
            System.out.println("Boleto vencido");
        }
        if (dataVencBoleto.before(dataAtual)) {
            System.out.println("Boleto vencido");
        } else {
            System.out.println("Boleto dentro do prazo");
        }

    }
}
