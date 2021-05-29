package javakamp.Hrms.business.abstracts;

import java.util.List;

import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.core.utilities.results.Result;
import javakamp.Hrms.entities.concretes.JobSeeker;

public interface JobSeekerService {

	DataResult<List<JobSeeker>> getAll();
	Result add(JobSeeker jobSeeker);
}
