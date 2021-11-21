package model;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

import javax.swing.JOptionPane;

public class IndexAgenda {
	public static void main(String[] args) {

		Cliente cliente = new Cliente();
		List<Cliente> clientes = new ArrayList<Cliente>();
		
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
				if (clientes.removeIf(buscaNome)) {
					clientes.removeIf(buscaNome);
					JOptionPane.showMessageDialog(null, "CLIENTE REMOVIDO COM SUCESSO!");
				} else {
					JOptionPane.showMessageDialog(null, "CLIENTE NÃO ENCONTRADO!");
				}
				break;
			case 3:
				if (clientes.size() == 0) {
					JOptionPane.showMessageDialog(null, "Agenda Vazia!\nInsira novos clientes");
				}

				for (Cliente c : clientes) {
					JOptionPane.showMessageDialog(null, c);
				}
				break;

			case 0:

				op = 0;
				break;
			default:
				JOptionPane.showMessageDialog(null, "Informação incorreta!\nFavor tente novamente!");
				break;
			}

		} while (op != 0);

		
	}

}
