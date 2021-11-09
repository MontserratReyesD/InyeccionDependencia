package mx.edu.uacm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("espada")
public class Espada implements Arma {

}
