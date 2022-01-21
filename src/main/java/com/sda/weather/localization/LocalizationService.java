package com.sda.weather.localization;

import com.fasterxml.jackson.databind.ObjectMapper;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class LocalizationService {

    private final LocalizationRepository localizationRepository;



    Localization createLocalization(String city, String country, int longitude, int latitude, String region) {
        if (city == null || country == null || region == null || city.isBlank() || country.isBlank() ||
                region.isBlank() || longitude > 180 || longitude < 0 || latitude > 90 || latitude < 0){
                throw new IllegalArgumentException("Data validation failed.");  // data validation
        }
        Localization localization = new Localization();
        localization.setCity(city);
        localization.setCountry(country);
        localization.setRegion(region);
        localization.setLongitude(longitude);
        localization.setLatitude(latitude);

        Localization savedLocalization = localizationRepository.add(localization);
        return savedLocalization;


    }


}
