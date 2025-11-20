package com.strava.platform.u20231b475.training.domain.model.valuobjects;

import jakarta.validation.constraints.*;

public record AthleteId(@NotNull @Min(1) Long Id) {
}
