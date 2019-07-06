
package Controller;


import java.util.LinkedHashMap;
import java.util.Map;
import modelos.Persona;
import modelos.PersonaValidar;
import org.springframework.stereotype.Controller;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.support.SessionStatus;
import org.springframework.web.servlet.ModelAndView;





@Controller
@RequestMapping("form.htm")
public class FormController {
   
    private PersonaValidar personaValidar;

    public FormController() {
        
        this.personaValidar=new PersonaValidar();
        
    }
    
    
    
    
    
    
    @RequestMapping(method=RequestMethod.GET)
    public ModelAndView form(){
        
        ModelAndView mav = new ModelAndView();
        mav.setViewName("form");
        mav.addObject("persona", new Persona());
        return mav;
        
    }
    
    //MÃ©todo para poblar el select
    @ModelAttribute("N_horas")
    public Map<String,String> listadoHoras(){
        
        Map<String,String> horas = new LinkedHashMap<>();
        horas.put("1","1 hora");
        horas.put("2","2 horas");
        horas.put("3","3 horas");
        horas.put("4","4 horas");
        horas.put("5","5 horas");
        horas.put("6","6 horas");
        horas.put("7","7 horas");
        horas.put("8","8 horas");
        horas.put("9","9 horas");
        horas.put("10","10 horas");
        horas.put("11","11 horas");
        horas.put("12","12 horas");
        horas.put("13","13 horas");
        horas.put("14","14 horas");
        horas.put("15","15 horas");
        horas.put("16","16 horas");
        return horas;
    }
    
    //Recibimos y validamos los datos de nuestro formulario
    @RequestMapping(method=RequestMethod.POST)
    public ModelAndView form(@ModelAttribute("persona") Persona p, BindingResult result,SessionStatus status){
        
        this.personaValidar.validate(p, result);
        
        if (result.hasErrors()) {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("form");
        mav.addObject("persona", new Persona());
        return mav;
            
        } else {
        ModelAndView mav = new ModelAndView();
        mav.setViewName("exito");
        mav.addObject("Docente", p.getDocente());
        mav.addObject("Semestre Academico", p.getS_academico());
        mav.addObject("N° horas semanales", p.getHoras_semanales());
        return mav;
            
        }
        
    }
    
}
