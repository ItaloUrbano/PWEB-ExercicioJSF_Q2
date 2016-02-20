package br.ifpb.projetoJSF;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;

public class CamposUsuário {
	
    private String nome;
	private int nascimento;
	private int matricula;
	

	public CamposUsuário() {}
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int Nascimento() {
		return nascimento;
	}

	public void setNascimento(int nascimento) {
		this.nascimento = nascimento;
	}
	public int Matrícula() {
		return matricula;
	}

	public void setMatricula(int matricula) {
		this.matricula = matricula;
	}
	
	 public class Enivar extends JFrame{
			private static final long serialVersionUID = 1L;
			JButton enivar;
			public Enivar(){
				
				enivar = new JButton ("Enivar");
				enivar.setBounds(100,50,100,20);
				enivar.addActionListener(
				new ActionListener(){
				public void actionPerformed(ActionEvent e){
								System.exit(0);
					}
				}
			);
			}
			
		      public void main(String args[]){
				Enivar app = new Enivar();
				app.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			 }
		}
	
	
	

}
