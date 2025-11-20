package com.strava.platform.u20231b475.training.domain.model.queries;

import java.time.LocalDate;

public record GetAssessmentByAthleteIdAndCoachIdAndDateQuery(Long athleteId, Long coachId, LocalDate date) {
}
