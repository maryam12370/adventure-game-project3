package se.iths.maryam.adventuregame.model.dao;

import se.iths.maryam.adventuregame.dao.StatisticsDao;
import se.iths.maryam.adventuregame.model.Statistics;

import java.util.ArrayList;
import java.util.List;

public class FakefilestatisticsDao implements StatisticsDao {
    @Override
    public void save(Statistics stat) {
        // Not needed
    }

    @Override
    public List<Statistics> loadAll() {
        List<Statistics> unsortedList = new ArrayList<>();
        unsortedList.add(new Statistics("Maryam", 400));
        unsortedList.add(new Statistics("Zlatan", 160));
        unsortedList.add(new Statistics("Messi", 35));
        unsortedList.add(new Statistics("Mohib", 200));
        return unsortedList;
    }
}
