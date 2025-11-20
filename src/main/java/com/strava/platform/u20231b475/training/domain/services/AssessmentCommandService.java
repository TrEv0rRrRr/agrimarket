package com.strava.platform.u20231b475.training.domain.services;

import java.util.Optional;

import com.strava.platform.u20231b475.training.domain.model.aggregates.Assessment;
import com.strava.platform.u20231b475.training.domain.model.commands.CreateAssessmentCommand;

public interface AssessmentCommandService {
  Optional<Assessment> handle(CreateAssessmentCommand command);
}
