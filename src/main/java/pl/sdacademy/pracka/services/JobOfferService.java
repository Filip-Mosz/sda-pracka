package pl.sdacademy.pracka.services;

import lombok.RequiredArgsConstructor;
import lombok.extern.log4j.Log4j2;
import org.springframework.stereotype.Service;
import pl.sdacademy.pracka.entities.JobOfferEntity;
import pl.sdacademy.pracka.repositories.JobOfferRepository;

import javax.annotation.PostConstruct;
import java.util.List;

@Service
@Log4j2
@RequiredArgsConstructor
public class JobOfferService {
    private final JobOfferRepository jobOfferRepository;

    public List<JobOfferEntity> getAllJobOffers() {
        final List<JobOfferEntity> allEntities = jobOfferRepository.findAll();
        return allEntities;
    }

    @PostConstruct
    void fillWithDummyData() {
        log.info("Wypełniam bazę danych przykładowymi ofertami pracy");

        final JobOfferEntity juniorSDA = new JobOfferEntity(null, "Junior Developer", "SDA", "Gdynia", "Ogarniętego juniora szukamy, jesteśmy młodzi i dynamiczni!", 3000, 5000);
        final JobOfferEntity seniorNordea = new JobOfferEntity(null, "Senior Developer", "Nordea", "Gdańsk", "Szukamy wymiatacza, jesteśmy korpo!", 15000, 20000);
        jobOfferRepository.save(juniorSDA);
        jobOfferRepository.save(seniorNordea);
    }
}
