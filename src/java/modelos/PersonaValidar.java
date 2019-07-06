/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelos;

//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
import org.springframework.validation.Errors;
import org.springframework.validation.ValidationUtils;
import org.springframework.validation.Validator;

/**
 *
 * @author Administrator
 */
public class PersonaValidar implements Validator {

    /*private static final String EMAIL_PATTEN="^[_A-Za-z0-9-\\+]+\\.[_A-Za-z0-9-]"
    + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$";
    
    private Pattern pattern;
    private Matcher matcher;*/
    
    @Override
    public boolean supports(Class<?> type) {
        
        return Persona.class.isAssignableFrom(type);
    
    }

    @Override
    public void validate(Object o, Errors errors) {
       
        Persona persona = (Persona)o; //Estoy haciendo una refundición para que pase a ser un objeto de la clase persona
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "docente", "required.docente", "El campo docente es obligatorio.");
        
        ValidationUtils.rejectIfEmptyOrWhitespace(errors, "s_academico", "required.s_academico", "El campo semestre academico es obligatorio.");
        
        
        if (persona.getHoras_semanales()==0) {
        	errors.rejectValue("horas_semanales","required.horas_semanales","Seleccione el numero de horas");
        	
        }
    }
     
    
    
    
}
