package com.strava.platform.u20231b475.training.interfaces.rest.transform;

import com.strava.platform.u20231b475.training.domain.model.aggregates.Assessment;
import com.strava.platform.u20231b475.training.interfaces.rest.resources.AssessmentResource;

/**
 * Assembler to convert an Assessment entity to an AssessmentResource.
 */
public class AssessmentResourceFromEntityAssembler {
  /**
   * Converts an Assessment entity to an AssessmentResource
   * 
   * @param entity The {@link Assessment} entity to convert
   * @return The {@link AssessmentResource} resource
   */
  public static AssessmentResource toResourceFromEntity(Assessment entity) {
    return new AssessmentResource(
        entity.getId(),
        entity.getAthleteId(),
        entity.getCoachId(),
        entity.getBmi(),
        entity.getPushUps(),
        entity.getPlankTime(),
        entity.getCardioMetrics(),
        entity.getConfidentialNote(),
        entity.getType(),
        entity.getStatus());
  }
}
