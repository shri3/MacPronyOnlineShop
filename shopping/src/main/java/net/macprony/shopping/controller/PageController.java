package net.macprony.shopping.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class PageController {

	@RequestMapping(value= {"/","/home","/index"})
	public ModelAndView index()
	{
	 ModelAndView mv = new ModelAndView("page");
	 mv.addObject("greeting","Welcome To MacProny" );
	
	return mv;
	}
	
/*	request param eaxmple 
 * @RequestMapping(value= {"/test"})
	public ModelAndView test(@RequestParam(value="greeting" ,required=false) String greeting)
	{
		if(greeting == null) {
			greeting = "hey shrikant";
		}
	 ModelAndView mv = new ModelAndView("page");
	 mv.addObject("greeting",greeting );
	
	return mv;
	}
	*/

	
	/*   PATH Variable example
	@RequestMapping(value= {"/test/{greeting}"})
	public ModelAndView test(@PathVariable("greeting") String greeting)
	{
		if(greeting == null) {
			greeting = "hey shrikant";
		}
	 ModelAndView mv = new ModelAndView("page");
	 mv.addObject("greeting",greeting );
	
	return mv;
	}*/
}
