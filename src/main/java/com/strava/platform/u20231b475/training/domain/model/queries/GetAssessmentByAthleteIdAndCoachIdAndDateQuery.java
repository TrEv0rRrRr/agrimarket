package com.strava.platform.u20231b475.training.domain.model.queries;

import java.time.LocalDate;

import com.strava.platform.u20231b475.training.domain.model.valuobjects.AthleteId;
import com.strava.platform.u20231b475.training.domain.model.valuobjects.CoachId;

/**
 * Get an assessment by athleteId, coachId and the actual date
 */
public record GetAssessmentByAthleteIdAndCoachIdAndDateQuery(AthleteId athleteId, CoachId coachId, LocalDate date) {
}
