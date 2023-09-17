package view;

import javax.swing.JOptionPane;

import Model.PilhaInt;
import controller.controllerNPR;

public class Principal {

	public static void main(String[] args) {
		String r = "";
		PilhaInt p = new PilhaInt();
		controllerNPR npr = new controllerNPR();
		
		do {
			r = JOptionPane.showInputDialog("Digite um valor para adicionar a pilha ou então uma operação (+, -, *, /)");
			try {
				int val = Integer.parseInt(r);
				npr.insereValor(p, val);
			} catch (Exception e) {
				int resultado = npr.operacao(p, r);
				System.out.println("Resultado: " + resultado);
			}
		}while(!r.equals("exit"));

	}

}
