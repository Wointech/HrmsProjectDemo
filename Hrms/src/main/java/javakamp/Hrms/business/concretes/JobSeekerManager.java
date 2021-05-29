package javakamp.Hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javakamp.Hrms.business.abstracts.JobSeekerService;
import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.core.utilities.results.Result;
import javakamp.Hrms.core.utilities.results.SuccessDataResult;
import javakamp.Hrms.core.utilities.results.SuccessResult;
import javakamp.Hrms.dataAccess.abstracts.JobSeekerDao;
import javakamp.Hrms.entities.concretes.JobSeeker;


@Service
public class JobSeekerManager implements JobSeekerService{

	private JobSeekerDao jobSeekerDao;
	
	@Autowired
	public JobSeekerManager(JobSeekerDao jobSeekerDao) {
		super();
		this.jobSeekerDao = jobSeekerDao;
	}

	@Override
	public DataResult<List<JobSeeker>> getAll() {
		
		return new SuccessDataResult<List<JobSeeker>>(this.jobSeekerDao.findAll());
	}

	@Override
	public Result add(JobSeeker jobSeeker) {
		
		this.jobSeekerDao.save(jobSeeker);
		return new SuccessResult("Eklendi");
	}

}
