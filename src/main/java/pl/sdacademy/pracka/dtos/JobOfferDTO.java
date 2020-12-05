package pl.sdacademy.pracka.dtos;

import lombok.Data;

@Data
public class JobOfferDTO {
    private String name;
    private String companyName;
    private String city;
    private String description;
    private Integer minSalary;
    private Integer maxSalary;
}
