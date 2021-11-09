package mx.edu.uacm;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class InyeccionDependenciaApplication {
	
	private static final Logger log = LogManager.getLogger(InyeccionDependenciaApplication.class);
	public static void main(String[] args) {
		
		/*Sin uso de Spring 
		Ninja ninja = new Ninja();
		
		//Inyeccion de dependencia
		//Agregacion
		ninja.setArma(new Chacos());
		
		//Inyeccion de dependencia
		//Agregacion
		ninja.setMision("pasar nivel uno");*/
		
		ApplicationContext contenedor = new ClassPathXmlApplicationContext("/context.xml");
		
		//Obtenemos el ninja del contenedor
		Ninja ninja = (Ninja) contenedor.getBean("ninja"); //Casteamos el objeto
	
		log.debug("arma del ninja: " + ninja.getArma());
	}

}
