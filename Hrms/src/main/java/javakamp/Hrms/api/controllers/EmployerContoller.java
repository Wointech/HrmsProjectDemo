package javakamp.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.Hrms.business.abstracts.EmployerService;
import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.entities.concretes.Employer;

@RestController
@RequestMapping("/api/employers")
public class EmployerContoller {
	
	private EmployerService employerService;

	@Autowired
	public EmployerContoller(EmployerService employerService) {
		super();
		this.employerService = employerService;
	}
	
	@GetMapping("/getall")
	public DataResult<List<Employer>> getAll(){
		
		return this.employerService.getAll();
	}

}
