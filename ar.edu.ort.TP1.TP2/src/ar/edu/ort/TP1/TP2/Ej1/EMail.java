package ar.edu.ort.TP1.TP2.Ej1;

public class EMail {

	private String cuenta;
	private String dominio;

	public EMail(String direccion){
		this.setCuenta(SplitDireccion(direccion, "@")[0]);
		this.setDominio(SplitDireccion(direccion, "@")[1]);
		
	}
	
	private String[] SplitDireccion (String dir, String splitChar){
		String[] segmentos = dir.split(splitChar);
		return segmentos;
	}
	
	public String getCuenta() {
		return cuenta;
	}

	public String getDominio() {
		return dominio;
	}

	
	private void setCuenta(String cuenta) {
		this.cuenta = cuenta;
	}

	private void setDominio(String dominio) {
		this.dominio = dominio;
	}
//	 El m�todo getValor() devolver� el String con la �reconstrucci�n� de la direcci�n,
//	 utilizando ambos atributos m�s la arroba. 
	public String getValor(){
		return this.getCuenta() + "@" + this.getDominio();
	}


}