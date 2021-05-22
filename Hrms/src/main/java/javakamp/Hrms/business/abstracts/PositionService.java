package javakamp.Hrms.business.abstracts;

import java.util.List;

import javakamp.Hrms.entities.concretes.Position;

public interface PositionService {

	List<Position> getAll();
}
