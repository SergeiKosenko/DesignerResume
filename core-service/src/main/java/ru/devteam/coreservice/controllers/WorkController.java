package ru.devteam.coreservice.controllers;

import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.devteam.coreservice.entities.Work;
import ru.devteam.coreservice.services.WorkService;

import java.util.List;

@RestController
@RequestMapping("/api/v1/works")
@RequiredArgsConstructor
public class WorkController {
    private final WorkService workService;

    @GetMapping
    public List<Work> getAllWorks() {
        return workService.findAll();
    }
}
