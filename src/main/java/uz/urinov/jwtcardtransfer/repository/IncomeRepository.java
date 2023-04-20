package uz.urinov.jwtcardtransfer.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.urinov.jwtcardtransfer.entity.Income;

import java.util.List;

@Repository
public interface IncomeRepository extends JpaRepository<Income, String> {
    List<Income> getAllByToCardId_Id(String toCardId_id);
}
