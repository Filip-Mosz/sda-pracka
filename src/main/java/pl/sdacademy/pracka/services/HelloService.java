package pl.sdacademy.pracka.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import pl.sdacademy.pracka.entities.JobOfferEntity;
import pl.sdacademy.pracka.repositories.JobOfferRepository;

@Service
@RequiredArgsConstructor
public class HelloService {

    private final JobOfferRepository jobOfferRepository;

    private int licznik = 0;

    public String fetchHelloMessage() {
        final JobOfferEntity jobOfferEntity = new JobOfferEntity();
        jobOfferEntity.setName("Oferta pracy nr: " + (++licznik));
        jobOfferRepository.save(jobOfferEntity);

        return "Witaj programisto! Jesteś " + (licznik) + " odwiedzającym moją stronę!";
    }
}
