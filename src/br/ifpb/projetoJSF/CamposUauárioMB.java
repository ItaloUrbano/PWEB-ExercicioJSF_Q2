package br.ifpb.projetoJSF;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean

public class CamposUau�rioMB {
	
	public class Enivar {

	}

	private CamposUsu�rio camposusu�rio;
	
	public CamposUau�rioMB() {
		this.camposusu�rio = new CamposUsu�rio();
	}

	public String Pessoa() {
		
		System.out.println(camposusu�rio.getNome());
		System.out.println(camposusu�rio.Nascimento());
		System.out.println(camposusu�rio.Matr�cula());
		
		return null;
	}
	public CamposUsu�rio getCamposUsu�rio() {
		return camposusu�rio;
	}

	public void setCamposUsu�rio(CamposUsu�rio camposusu�rio) {
		this.camposusu�rio = camposusu�rio;
	}	
	
	
	
	
}
