package ajedrezParcial1;

public class Torre extends Ajedrez{
	public Torre (int posicionInicialFila, int posicionInicialColumna) {
		super(posicionInicialFila, posicionInicialColumna);
		
	}

	@Override
	public int contarCantidadCasillas() {
		int total=0;
		if (posicionInicialFila==1 && posicionInicialColumna==1) {
		total=14;		
		}else {
		total=(14-posicionInicialFila);
		total= total-posicionInicialColumna;
		}
	return total;

	}
}
