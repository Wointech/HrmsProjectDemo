package javakamp.Hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javakamp.Hrms.business.abstracts.PositionService;
import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.entities.concretes.Position;

@RestController
@RequestMapping("/api/positions")
public class PositionController {
	
	private PositionService positionService;
	
	
	@Autowired
	public PositionController(PositionService positionService) {
		super();
		this.positionService = positionService;
	}



	@GetMapping("/getall")
	public DataResult<List<Position>> getAll() {
		
		return this.positionService.getAll();
	}

}
