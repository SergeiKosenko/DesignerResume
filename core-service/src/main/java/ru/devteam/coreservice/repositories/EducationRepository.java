package ru.devteam.coreservice.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.devteam.coreservice.entities.Education;

@Repository
public interface EducationRepository extends JpaRepository<Education, Long> {
}
