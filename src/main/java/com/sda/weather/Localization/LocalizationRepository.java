package com.sda.weather.Localization;

import java.util.List;

public interface LocalizationRepository {
    List<Localization> findAll();
    Localization add(Localization localization);

}
