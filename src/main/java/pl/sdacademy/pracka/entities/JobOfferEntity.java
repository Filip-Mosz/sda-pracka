package pl.sdacademy.pracka.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class JobOfferEntity {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    private String companyName;

    private String city;

    private String description;

    private Integer minSalary;

    private Integer maxSalary;

}
