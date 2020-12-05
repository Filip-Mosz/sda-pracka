package pl.sdacademy.pracka.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import pl.sdacademy.pracka.entities.JobOfferEntity;

@Repository
public interface JobOfferRepository extends JpaRepository<JobOfferEntity, Long> {
}
