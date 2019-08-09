package aula0208;

import java.time.Duration;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZonedDateTime;

public class desafio02 {
	public static void main(String[] args) {
		
		LocalDateTime hora = LocalDateTime.now();
		System.out.println(hora);
		
		ZoneId fusoHorarioDeSaoPaulo = ZoneId.of("America/Sao_Paulo");
		ZonedDateTime horaSaoPaulo = ZonedDateTime.of(hora, fusoHorarioDeSaoPaulo);
		System.out.println(horaSaoPaulo);
		  
		ZoneId fusoHorarioDeParis = ZoneId.of("Europe/Paris");
		ZonedDateTime horaParis = ZonedDateTime.of(hora, fusoHorarioDeParis);
		System.out.println(horaParis);
		  
		Duration diferencaDeHoras = Duration.between(horaSaoPaulo, horaParis);
		
		System.out.println("Diferença em horas: " + 
		diferencaDeHoras.getSeconds() / 60 / 60);
		System.out.println("Diferença em segundos: " + diferencaDeHoras.getSeconds());
	}
}