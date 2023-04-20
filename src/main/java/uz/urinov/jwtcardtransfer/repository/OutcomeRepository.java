package uz.urinov.jwtcardtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.jwtcardtransfer.entity.Outcome;

import java.util.List;

@Repository
public interface OutcomeRepository extends JpaRepository<Outcome, String> {
    List<Outcome> findAllByFrom_Username(String from_username);
}
