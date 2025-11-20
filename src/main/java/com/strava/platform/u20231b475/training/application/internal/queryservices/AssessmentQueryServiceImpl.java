package com.strava.platform.u20231b475.training.application.internal.queryservices;

import java.util.Optional;

import com.strava.platform.u20231b475.training.domain.model.aggregates.Assessment;
import com.strava.platform.u20231b475.training.domain.model.queries.GetAssessmentByAthleteIdAndCoachIdAndDateQuery;
import com.strava.platform.u20231b475.training.domain.services.AssessmentQueryService;
import com.strava.platform.u20231b475.training.infrastructure.persistence.jpa.repositories.AssessmentRepository;

/**
 * Assessment query service implementation
 * 
 * @author Valentino Solis
 */
public class AssessmentQueryServiceImpl implements AssessmentQueryService {
  private final AssessmentRepository repository;

  /**
   * Constructor
   * 
   * @param repository The {@link AssessmentRepository} instance
   */
  public AssessmentQueryServiceImpl(AssessmentRepository repository) {
    this.repository = repository;
  }

  // inherited javadoc
  @Override
  public Optional<Assessment> handle(GetAssessmentByAthleteIdAndCoachIdAndDateQuery query) {
    return repository.findByAthleteIdAndCoachIdAndDate(query.athleteId(), query.coachId(), query.date());
  }
}
