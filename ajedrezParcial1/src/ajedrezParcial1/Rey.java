package ajedrezParcial1;

public class Rey extends Ajedrez{
	public Rey (int posicionInicialFila, int posicionInicialColumna) {
		super(posicionInicialFila, posicionInicialColumna);

}

	@Override
	public int contarCantidadCasillas() {
		int total=0;
		if(posicionInicialFila==1 && posicionInicialColumna==1) {
		total=3;
		}if (posicionInicialFila==8 && posicionInicialColumna==1) {
		total=3;
		}if (posicionInicialFila==1 && posicionInicialColumna==8) {
		total=3;
		}if (posicionInicialFila==8 && posicionInicialColumna==8) {
		total=3;
		}else {
			total=8;
		}
		return total;
	}
}