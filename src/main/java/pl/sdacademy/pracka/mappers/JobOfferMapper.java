package pl.sdacademy.pracka.mappers;

import pl.sdacademy.pracka.dtos.JobOfferDTO;
import pl.sdacademy.pracka.entities.JobOfferEntity;

public class JobOfferMapper {

    public static JobOfferDTO toDTO(JobOfferEntity entity) {
        final JobOfferDTO dto = new JobOfferDTO();

        dto.setName(entity.getName());
        dto.setCompanyName(entity.getCompanyName());
        dto.setCity(entity.getCity());
        dto.setDescription(entity.getDescription());
        dto.setMinSalary(entity.getMinSalary());
        dto.setMaxSalary(entity.getMaxSalary());

        return dto;
    }
}
