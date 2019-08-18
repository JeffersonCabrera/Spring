package com.jefferson.spring;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class HolaController {
	
	@RequestMapping("irHola")
	public ModelAndView redireccion() {
//		ModelAndView mv = new ModelAndView();
//	    mv.setViewName("hola");
//	    mv.addObject("mensaje","Hola soy mensaje desde un controller");
		ModelAndView mv = new ModelAndView("hola","mensaje","Hola soy mensaje desde controller");
		
		return mv;
	}

}
