package uz.maktab.maktab.repository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import uz.maktab.maktab.entity.Dars;
import uz.maktab.maktab.entity.Fan;

@Repository
public interface FanRepoaitory extends JpaRepository<Fan, Long> {
}
