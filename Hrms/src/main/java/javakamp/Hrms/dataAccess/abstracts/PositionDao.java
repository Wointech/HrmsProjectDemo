package javakamp.Hrms.dataAccess.abstracts;

import org.springframework.data.jpa.repository.JpaRepository;

import javakamp.Hrms.entities.concretes.Position;

public interface PositionDao extends JpaRepository<Position, Integer>{
}

