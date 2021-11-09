package mx.edu.uacm;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("chacos")
public class Chacos implements Arma {

}
