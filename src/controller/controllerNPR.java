package controller;

import Model.PilhaInt;

public class controllerNPR {

	public controllerNPR() {
		super();
	}

	public void insereValor(PilhaInt p, int v) {
		p.push(v);
	}

	public int operacao(PilhaInt p, String op) {
		int resultado = 0;
		try {
			int valtopo = p.pop();

			try {
				int valproximo = p.pop();
				switch (op) {
				case "/": {
					resultado = valproximo / valtopo;
					p.push(resultado);
					break;
				}
				case "-": {
					resultado = valproximo - valtopo;
					p.push(resultado);
					break;
				}
				case "+": {
					resultado = valproximo + valtopo;
					p.push(resultado);
					break;
				}
				case "*": {
					resultado = valproximo * valtopo;
					p.push(resultado);
					break;
				}
				default:
					System.err.println("Operação não identificada");
					p.push(valtopo);
					p.push(valproximo);
				}
			} catch (Exception e) {
				System.err.println("Valores insufucientes");
				p.push(valtopo);
			}
		} catch (Exception e) {
			System.err.println("Valores insufucientes");
		}
		return resultado;
	}

}
