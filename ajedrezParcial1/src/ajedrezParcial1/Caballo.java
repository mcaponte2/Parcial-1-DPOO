package ajedrezParcial1;

public class Caballo extends Ajedrez{
	public Caballo (int posicionInicialFila, int posicionInicialColumna) {
		super(posicionInicialFila, posicionInicialColumna);

}

	@Override
	public int contarCantidadCasillas() {
		int total=0;
		if(posicionInicialFila==1 && posicionInicialColumna==1) {
			total=6;
		}if (posicionInicialFila==8 && posicionInicialColumna==1) {
		total=6;
		}if (posicionInicialFila==1 && posicionInicialColumna==8) {
		total=6;
		}if (posicionInicialFila==8 && posicionInicialColumna==8) {
		total=6;
		}else {
			total=12;
		}
				
		return total;
	}
}

