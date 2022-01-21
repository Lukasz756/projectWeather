package com.sda.weather.localization;

import lombok.Data;

@Data
public class LocalizationDTO {
    private Long id;
    private String city;
    private String country;
    private int longitude;
    private int latitude;
    private String region;
}
