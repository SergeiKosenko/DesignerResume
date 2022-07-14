package ru.devteam.coreservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.coreservice.entities.Resume;

@Repository
public interface ResumeRepository extends JpaRepository<Resume, Long> {
}
