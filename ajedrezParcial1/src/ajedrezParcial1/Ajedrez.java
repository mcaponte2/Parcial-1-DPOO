package ajedrezParcial1;

public abstract class Ajedrez {
	protected int posicionInicialFila;
	protected int posicionInicialColumna;
	
	
	public int getPosicionInicialFila() {
		return posicionInicialFila;
	}
	public void setPosicionInicialFila(int posicionInicialFila) {
		this.posicionInicialFila=posicionInicialFila;
		
	}

	public int getPosicionInicialColumna() {
		return posicionInicialColumna;
	}
	public void setPosicionInicialColumna(int posicionInicialColumna) {
		this.posicionInicialColumna=posicionInicialColumna;
	}
	public Ajedrez(int posicionInicialFila, int posicionInicialColumna) {
		this.posicionInicialFila=posicionInicialFila;
		this.posicionInicialColumna=posicionInicialColumna;

	}
	public abstract int contarCantidadCasillas();
}
