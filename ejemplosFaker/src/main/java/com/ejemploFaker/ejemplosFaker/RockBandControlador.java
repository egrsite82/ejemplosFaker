package com.ejemploFaker.ejemplosFaker;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/theme")
public class RockBandControlador {
	
@Autowired
RockBandService	rockbandService;

@RequestMapping("/rockbands")
public	String	showRockBand(Model model) {
	
	model.addAttribute("rockbanddesdeControlador", rockbandService.queryFakeRockBand());
	
	return "listrockband";
}


}
