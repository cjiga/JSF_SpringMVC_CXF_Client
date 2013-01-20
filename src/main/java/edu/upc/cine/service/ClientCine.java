package edu.upc.cine.service;

import java.util.List;

import org.apache.cxf.interceptor.LoggingInInterceptor;
import org.apache.cxf.interceptor.LoggingOutInterceptor;
import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;

import edu.upc.webservice.genero.service.Genero;
import edu.upc.webservice.genero.service.GeneroService;


public class ClientCine {
	public List<Genero> getAll() {
		JaxWsProxyFactoryBean factory = new JaxWsProxyFactoryBean();
 
		factory.setServiceClass(GeneroService.class);
		factory.setAddress("http://localhost:8080/ws_cine/GeneroService");
	    factory.getInInterceptors().add(new LoggingInInterceptor());
	    factory.getOutInterceptors().add(new LoggingOutInterceptor());
		GeneroService client = (GeneroService) factory.create();
		
		return client.getAll();
	}
}
