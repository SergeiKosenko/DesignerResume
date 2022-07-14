package ru.devteam.coreservice.services;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import ru.devteam.coreservice.entities.Work;
import ru.devteam.coreservice.repositories.WorkRepository;

import java.util.List;

@Service
@RequiredArgsConstructor
public class WorkService {
    private final WorkRepository workRepository;

    public List<Work> findAll(){
        return workRepository.findAll();

    }
}
