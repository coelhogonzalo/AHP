package model;

import java.util.ArrayList;
import java.util.List;

public class CriterioSimple extends Criterio {
	//TODO NUNCA USADO
	//private Criterio padre;
	
	public CriterioSimple(String nombre){
		super(nombre);
	}
	
	public List<Criterio> getSubcriterios(){
		return new ArrayList<>();
	}
	
	public List<Criterio> getHojas(){
		List<Criterio> salida = new ArrayList<>();
		salida.add(this);
		return salida;
	}
	//TODO NUNCA USADO
	/*public boolean esSubcriterio(){
		return padre != null;
	}*/

	@Override
	public void setMatriz(Matriz m) {
		
	}
	
	public List<Double> getPonderaciones (){
		List<Double> salida = new ArrayList<>();
		salida.add(this.ponderacion);
		return salida;
	}
	
	public Matriz getMatriz(){
		return null;
	}
}

