package se.iths.maryam.adventuregame.dao;

import se.iths.maryam.adventuregame.model.Statistics;

import java.util.List;

public interface StatisticsDao {
    void save(Statistics stat);

    List<Statistics> loadAll();
}

