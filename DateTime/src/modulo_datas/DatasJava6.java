/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

/**
 *
 * @author wesle
 */
public class DatasJava6 {
    
    public static void main(String[] args) {

        //Nova Api de data a a partir do Java 8
        LocalDate dataAtual = LocalDate.now();
        
        System.out.println("Data atual: " + dataAtual.format(DateTimeFormatter
        .ofPattern("dd/MM/yyyy")));
        
        LocalTime horaAtual = LocalTime.now();
        
        System.out.println("Hora Atual: " + horaAtual.format(DateTimeFormatter
        .ofPattern("HH:mm:ss")));
        
        LocalDateTime dateTimeAtual = LocalDateTime.now();
        
        System.out.println("Data e hora Atual: " + dateTimeAtual.format(DateTimeFormatter
                .ofPattern("dd/MM/yyyy HH:mm:ss")));
    }
}
