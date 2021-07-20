/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modulo_datas;

import java.time.Duration;
import java.time.Instant;

/**
 *
 * @author wesle
 */
public class DatasJava8 {

    public static void main(String[] args) throws InterruptedException {

        Instant inicio = Instant.now();

        Thread.sleep(2000);

        Instant ifinal = Instant.now();

        Duration duracao = Duration.between(inicio, ifinal);

        System.out.println("Duração em nano segundos: " + duracao.toNanos());

        System.out.println("Duração em minutos: " + duracao.toMinutes());

        System.out.println("Duração em horas: " + duracao.toHours());

        System.out.println("Duração em milisegundos: " + duracao.toMillis());

        System.out.println("Duração em dias: " + duracao.toDays());
    }
}
