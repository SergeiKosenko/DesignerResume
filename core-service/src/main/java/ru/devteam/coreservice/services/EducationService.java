package ru.devteam.coreservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.coreservice.entities.Education;
import ru.devteam.coreservice.repositories.EducationRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class EducationService {
    private final EducationRepository educationRepository;

    public List<Education> findAll(){
        return educationRepository.findAll();

    }
}
