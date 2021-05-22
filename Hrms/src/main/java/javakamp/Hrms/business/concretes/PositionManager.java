package javakamp.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.Hrms.business.abstracts.PositionService;
import javakamp.Hrms.dataAccess.abstracts.PositionDao;
import javakamp.Hrms.entities.concretes.Position;

@Service
public class PositionManager implements PositionService{

	
	private PositionDao positionDao;
	
	@Autowired
	public PositionManager(PositionDao positionDao) {
		super();
		this.positionDao = positionDao;
	}


	@Override
	public List<Position> getAll() {
		
		return this.positionDao.findAll();
	}

}
