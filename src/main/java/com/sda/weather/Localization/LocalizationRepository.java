package com.sda.weather.Localization;

import java.util.List;

public interface LocalizationRepository {
    List<Localization> findAll(); // todo remove it, it isn't a part of our functionality
    Localization add(Localization localization);
}
