package com.iky.travel.service.travel;

import java.util.Set;

public interface TravelService {

  Set<Object> getMostQueriedCities(int topN);

  Set<Object> getAllCities();

  boolean clearPopularDestinations();
}
