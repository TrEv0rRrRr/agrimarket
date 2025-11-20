package com.strava.platform.u20231b475.training.infrastructure.persistence.jpa.repositories;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.strava.platform.u20231b475.training.domain.model.aggregates.Assessment;
import com.strava.platform.u20231b475.training.domain.model.valuobjects.AthleteId;
import com.strava.platform.u20231b475.training.domain.model.valuobjects.CoachId;

/**
 * Assessment repository
 * 
 * @author Valentino Solis
 */
@Repository
public interface AssessmentRepository extends JpaRepository<Assessment, Long> {

  /**
   * Find an assessment by athleteId, coachId and the actual date
   * 
   * @param athleteId The athlete related with the assessment
   * @param coachId   The coach related with the assessment
   * @param date      The actual date
   * @return A {@link Assessment} instance if the provided properties are valid,
   *         otherwise empty.
   * 
   * @author Valentino Solis
   */
  Optional<Assessment> findByAthleteIdAndCoachIdAndDate(AthleteId athleteId, CoachId coachId, LocalDate date);

  /**
   * Check if an assessment exists by the given properties
   * 
   * @param athleteId The athlete related with the assessment
   * @param coachId   The coach related with the assessment
   * @param date      The actual date
   * @return True if the assessment exists, otherwise false
   */
  boolean existsByAthleteIdAndCoachIdAndDate(AthleteId athleteId, CoachId coachId, LocalDate date);
}
