package mx.edu.uacm;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Ninja {
	
	@Autowired //Inyeccion de dependencias
	@Qualifier("espada")
	private Arma arma;
	
	@Value("pasar nivel")
	private String mision;
	/**
	 * @return the arma
	 */
	public Arma getArma() {
		return arma;
	}
	/**
	 * @param arma the arma to set
	 */
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	/**
	 * @return the mision
	 */
	public String getMision() {
		return mision;
	}
	/**
	 * @param mision the mision to set
	 */
	public void setMision(String mision) {
		this.mision = mision;
	}
	
	
	

}
