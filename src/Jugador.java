
public class Jugador {
 
	private String jugador;
	private Double apuesta;
	private Double ganado;
	
	public Jugador(String jugador, Double apuesta, Double ganado) {
		this.jugador = jugador;
		this.apuesta = apuesta;
		this.ganado = ganado;
	}

	public String getJugador() {
		return jugador;
	}

	public void setJugador(String jugador) {
		this.jugador = jugador;
	}

	public Double getApuesta() {
		return apuesta;
	}

	public void setApuesta(Double apuesta) {
		this.apuesta = apuesta;
	}

	public Double getGanado() {
		return ganado;
	}

	public void setGanado(Double ganado) {
		this.ganado = ganado;
	}
	
	
}
