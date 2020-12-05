package pl.sdacademy.pracka.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.sdacademy.pracka.dtos.JobOfferDTO;
import pl.sdacademy.pracka.services.JobOfferService;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/joboffer")
public class JobOfferController {

    private final JobOfferService jobOfferService;

    // http://localhost:8080/joboffer
    @GetMapping
    public List<JobOfferDTO> getAll() {
        return jobOfferService.getAllJobOffers();
    }
}
