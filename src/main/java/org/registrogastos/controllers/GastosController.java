package org.registrogastos.controllers;

import org.registrogastos.daos.GastoDAO;
import org.registrogastos.model.Gasto;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class GastosController {
	
	@Autowired
	private GastoDAO gastoDao;
	
	@RequestMapping("/gastos/form")
	public String form() {
		return "gastos/form";
	}
	
	@RequestMapping("/gastos")
	public String gravar(Gasto gasto) {
		System.out.println(gasto);
		gastoDao.gravar(gasto);
		return "gastos/ok";
	}

}