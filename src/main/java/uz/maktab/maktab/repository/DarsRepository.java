package uz.maktab.maktab.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.maktab.entity.Dars;

@Repository
public interface DarsRepository extends JpaRepository<Dars , Long>{

}
