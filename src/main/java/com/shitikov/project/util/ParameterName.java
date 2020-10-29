package com.shitikov.project.util;

import java.util.ArrayList;
import java.util.List;

public class ParameterName {

    //properties paths
    public static final String PAGES_PATH = "config.pages";

    //common
    public static final String LOCALE = "locale";
    public static final String CURRENT_PAGE = "current_page";

    public static final String REQUEST_ATTRIBUTE_HANDLER = "attribute_handler";
    public static final String ATTRIBUTE_SUBSTRING_INVALID = "_invalid";


    //user
    public static final String USER = "user";
    public static final String USER_ID = "user_id";
    public static final String LOGIN = "login";
    public static final String PASSWORD = "password";
    public static final String NAME = "name";
    public static final String SURNAME = "surname";
    public static final String EMAIL = "email";
    public static final String PHONE = "phone";
    public static final String SUBJECT_TYPE = "subject";
    public static final String ROLE_TYPE = "role";
    public static final String BLOCKED = "blocked";
    public static final String ACTIVE = "active";
    public static final String NEW_PASSWORD = "new_password";

    //address and city
    public static final String ADDRESS = "address";
    public static final String CITY = "city";

    //user activation address
    public static final String EMAIL_BODY = "%s?command=activate-account&login=%s";

    //car
    public static final String CAR = "car";
    public static final String CAR_ID = "car_id";
    public static final String CAR_NUMBER = "car_number";
    public static final String CARRYING_WEIGHT = "carrying_weight";
    public static final String CARRYING_VOLUME = "carrying_volume";

    //car & application
    public static final String PASSENGERS_NUMBER = "passengers_number";

    //application
    public static final String APPLICATION = "application";
    public static final String APPLICATION_ID = "application_id";
    public static final String TITLE = "title";
    public static final String APPLICATION_TYPE = "application_type";
    public static final String DATE = "date";
    public static final String CARGO_WEIGHT = "cargo_weight";
    public static final String CARGO_VOLUME = "cargo_volume";
    public static final String DEPARTURE_DATE = "departure_date";
    public static final String DEPARTURE_ADDRESS = "departure_address";
    public static final String DEPARTURE_CITY = "departure_city";
    public static final String ARRIVAL_DATE = "arrival_date";
    public static final String ARRIVAL_ADDRESS = "arrival_address";
    public static final String ARRIVAL_CITY = "arrival_city";
    public static final String DESCRIPTION = "description";
    public static final String STATUS = "status";

    public static final List<String> APPLICATION_PARAMS;
    public static final List<String> CAR_PARAMS;

    static {
        APPLICATION_PARAMS = new ArrayList<>();
        APPLICATION_PARAMS.add(TITLE);
        APPLICATION_PARAMS.add(APPLICATION_TYPE);
        APPLICATION_PARAMS.add(CARGO_WEIGHT);
        APPLICATION_PARAMS.add(CARGO_VOLUME);
        APPLICATION_PARAMS.add(PASSENGERS_NUMBER);
        APPLICATION_PARAMS.add(DEPARTURE_DATE);
        APPLICATION_PARAMS.add(DEPARTURE_ADDRESS);
        APPLICATION_PARAMS.add(DEPARTURE_CITY);
        APPLICATION_PARAMS.add(ARRIVAL_DATE);
        APPLICATION_PARAMS.add(ARRIVAL_ADDRESS);
        APPLICATION_PARAMS.add(ARRIVAL_CITY);
        APPLICATION_PARAMS.add(DESCRIPTION);

        CAR_PARAMS = new ArrayList<>();
        CAR_PARAMS.add(CAR_NUMBER);
        CAR_PARAMS.add(CARRYING_WEIGHT);
        CAR_PARAMS.add(CARRYING_VOLUME);
        CAR_PARAMS.add(PASSENGERS_NUMBER);
    }

    private ParameterName() {
    }

    // TODO: 14.10.2020 where need to keep parameter names - in util or in controller?
}
