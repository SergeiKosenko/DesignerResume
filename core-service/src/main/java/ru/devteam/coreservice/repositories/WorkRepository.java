package ru.devteam.coreservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.coreservice.entities.Work;

@Repository
public interface WorkRepository extends JpaRepository<Work, Long> {
}
