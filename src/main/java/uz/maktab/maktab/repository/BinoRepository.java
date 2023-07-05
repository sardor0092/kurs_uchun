package uz.maktab.maktab.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.maktab.entity.Bino;

@Repository
public interface BinoRepository extends JpaRepository<Bino , Long> {
}
