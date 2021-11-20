package model;

import java.util.Objects;

import javax.swing.JOptionPane;

public class Cliente {
	
	private String nomeCliente;
	private String telefone;
	private Integer idade;
	private String email;
	
	
	public String getNomeCliente() {
		return nomeCliente;
	}
	public void setNomeCliente(String nomeCliente) {
		this.nomeCliente = nomeCliente;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public Integer getIdade() {
		return idade;
	}
	public void setIdade(Integer idade) {
		this.idade = idade;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(email, idade, nomeCliente, telefone);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Cliente other = (Cliente) obj;
		return Objects.equals(email, other.email) && Objects.equals(idade, other.idade)
				&& Objects.equals(nomeCliente, other.nomeCliente) && Objects.equals(telefone, other.telefone);
	}
	
	public Cliente adicionarCliente() {
		Cliente cliente = new Cliente();
		String nome = JOptionPane.showInputDialog("Informe seu nome").toUpperCase();
		String idade = JOptionPane.showInputDialog("Informe sua idade");
		String telefone = JOptionPane.showInputDialog("Informe seu telefone").toUpperCase();
		String email = JOptionPane.showInputDialog("Informe seu email").toUpperCase();
		
		cliente.setNomeCliente(nome);
		cliente.setIdade(Integer.parseInt(idade));
		cliente.setTelefone(telefone);
		cliente.setEmail(email);
		
		return cliente;
	
	}
	
	public static String menu() {
		String menu = JOptionPane.showInputDialog("    MENU PRINCIPAL    \n"
				+" 1- ADICIONAR NOVOS CLIENTES\n 2- EXCLUIR CLIENTES\n 3- MOSTRAR LISTA CLIENTES\n 0- SAIR"
				+"\n INFORME SUA OPÇÃO:");
		
		return menu;
		
		
	}
	@Override
	public String toString() {		
		return "Cliente\nNome = " + getNomeCliente() + "\nIdade = " + getIdade() + "\nTelefone = " + getTelefone() +
				"\nEmail = "
				+ getEmail() + "\n\n\n";
	}
	
	
	
	
	
	
	
	
	

}
