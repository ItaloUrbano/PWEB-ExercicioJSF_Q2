package br.ifpb.projetoJSF;

import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;

@RequestScoped
@ManagedBean

public class CamposUauárioMB {
	
	public class Enivar {

	}

	private CamposUsuário camposusuário;
	
	public CamposUauárioMB() {
		this.camposusuário = new CamposUsuário();
	}

	public String Pessoa() {
		
		System.out.println(camposusuário.getNome());
		System.out.println(camposusuário.Nascimento());
		System.out.println(camposusuário.Matrícula());
		
		return null;
	}
	public CamposUsuário getCamposUsuário() {
		return camposusuário;
	}

	public void setCamposUsuário(CamposUsuário camposusuário) {
		this.camposusuário = camposusuário;
	}	
	
	
	
	
}
