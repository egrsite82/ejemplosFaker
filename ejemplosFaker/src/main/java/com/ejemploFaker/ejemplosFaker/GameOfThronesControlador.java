package com.ejemploFaker.ejemplosFaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theme")
public class GameOfThronesControlador {

@Autowired
GameOfThronesService gameofthronesService;
	
@RequestMapping("/gameofthrones")
public	String	showGameOfThrones(Model model) {
	
	model.addAttribute("gameofthronesdesdeControlador", gameofthronesService.queryGameOfThrones());
	
	return "listgot";
}

	
}
