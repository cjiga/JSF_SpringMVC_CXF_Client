package edu.upc.cine.managed;

import java.util.ArrayList;
import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;
import javax.faces.context.FacesContext;
import javax.faces.event.ActionEvent;

import org.springframework.beans.factory.annotation.Autowired;

import edu.upc.cine.service.ClientCine;
import edu.upc.webservice.genero.service.Genero;

@ManagedBean(name="generoMB")
@SessionScoped
public class GeneroMB {
	
	private Genero genero;
	private List<Genero> lstGenero;
	
	public GeneroMB(){
		genero=new Genero();
		genero.setIdGenero(1);
		genero.setDescripcion("Comedia");
		genero.setEstado(1);
		ClientCine clientCine = new ClientCine();
		lstGenero=clientCine.getAll();
		lstGenero.add(genero);
	}
	
	public void prepararInsertar(){
		System.out.println("Prepara Insertar");
		genero=new Genero();
	}
	
	public void prepararEditar(){
		System.out.println("Prepara Editar");
		
		
	}
	
	public void insertar(){
		System.out.println("Insertar");
		Integer id=1;
		for(Genero g: lstGenero){
			if (g.getIdGenero()>id){
				id=g.getIdGenero();
			}
		} 
		genero.setIdGenero(id+1);
		lstGenero.add(genero);
		FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("Genero guardado exitosamente.",""));
        prepararInsertar();
	}
	
	public void editar(){
		System.out.println("Editar");
		
		FacesContext context = FacesContext.getCurrentInstance();  
        context.addMessage(null, new FacesMessage("Genero guardado exitosamente.",""));
        
	}

	public Genero getGenero() {
		return genero;
	}

	public List<Genero> getLstGenero() {
		return lstGenero;
	}

	public void setLstGenero(List<Genero> lstGenero) {
		this.lstGenero = lstGenero;
	}
	
	
}
