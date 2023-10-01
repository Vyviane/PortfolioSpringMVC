package portifolio.portifolio;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("/portifolio")
public class DadosController{
    @GetMapping("/dev")
    public ModelAndView exemploViewObj(){
        ModelAndView mv = new ModelAndView("message-view");
        mv.addObject("Nome","Vyviane Souza Santos");
        mv.addObject("Email","Vyviane.souza13@gmail.com");
        mv.addObject("DataNasc","Data de nascimento: 13/02/2003");
        mv.addObject("Github","Github: https://github.com/Vyviane");
        mv.addObject("Tel","(11) 94002-8922");
        mv.addObject("Linkedin","Linkedin: https://www.linkedin.com/in/vyvianesouza/");

        return mv;        
    }
}