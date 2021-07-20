/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import sun.util.resources.LocaleData;

/**
 *
 * @author wesle
 */
public class DatasJava4 {
    
    public static void main(String[] args) {
        
        long dias = ChronoUnit.DAYS.between(LocalDate.parse("2021-02-05"), LocalDate.now());
        
        System.out.println("Posuui "+dias+ " dias entrea a faixa de data");
    }
}
