package br.ufc.crateus.agritech.helpers;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

@JsonFormat(shape = Shape.OBJECT)
public enum TipoProduto {

	MILHO("milho"),
	FEIJAO("feijao"),
	ARROZ("arroz"),
	LEGUME("legume"),
	FRUTA("fruta"),
	LATICINIO("laticinio");
	
	@JsonProperty
	private String tipo;
	
	TipoProduto(String tipo){
		this.tipo = tipo;
	}
	
	@JsonValue
	public String getTipo() {
		return this.tipo;
	}
	
	
}
