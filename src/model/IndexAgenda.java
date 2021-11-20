package model;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

public class IndexAgenda {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		List<Cliente> clientes = new ArrayList<Cliente>();
		Scanner teclado = new Scanner(System.in);
		int op;

		do {

			op = Integer.parseInt(Cliente.menu());
			switch (op) {
			case 1:
				Cliente dados;
				dados = cliente.adicionarCliente();
				clientes.add(dados);
				break;

			case 2:
				String nome = JOptionPane.showInputDialog("INFORME O NOME DO CLIENTE");
				Predicate<Cliente> buscaNome = b -> b.getNomeCliente().equalsIgnoreCase(nome);
				clientes.removeIf(buscaNome);
				break;
			case 3:

				for (Cliente c : clientes) {
					System.out.println(c);
				}
				break;

			case 0:

				op = 0;
				break;
			default:
				System.out.println("Informação incorreta!\nFavor tente novamente!");
				break;
			}

		} while (op != 0);

		teclado.close();
	}

}
