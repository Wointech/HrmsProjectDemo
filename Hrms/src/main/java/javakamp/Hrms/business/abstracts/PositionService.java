package javakamp.Hrms.business.abstracts;

import java.util.List;

import javakamp.Hrms.core.utilities.results.DataResult;
import javakamp.Hrms.entities.concretes.Position;

public interface PositionService {

	DataResult<List<Position>> getAll();
}
