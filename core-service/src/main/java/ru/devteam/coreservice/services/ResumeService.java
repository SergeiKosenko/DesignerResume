package ru.devteam.coreservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.coreservice.entities.Resume;
import ru.devteam.coreservice.repositories.ResumeRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class ResumeService {
    private final ResumeRepository resumeRepository;

    public List<Resume> findAll(){
        return resumeRepository.findAll();

    }
}
