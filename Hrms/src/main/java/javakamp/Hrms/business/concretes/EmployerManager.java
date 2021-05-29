package javakamp.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.Hrms.business.abstracts.EmployerService;
import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.core.utilities.results.SuccessDataResult;
import javakamp.Hrms.dataAccess.abstracts.EmployerDao;
import javakamp.Hrms.entities.concretes.Employer;


@Service
public class EmployerManager implements EmployerService{

	private EmployerDao employerDao;
	
	
	@Autowired
	public EmployerManager(EmployerDao employerDao) {
		super();
		this.employerDao = employerDao;
	}

	@Override
	public DataResult<List<Employer>> getAll() {
		
		return new SuccessDataResult<List<Employer>>(this.employerDao.findAll());
	}

}
