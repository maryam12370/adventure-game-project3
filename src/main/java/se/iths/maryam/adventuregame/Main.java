package se.iths.maryam.adventuregame;

import se.iths.maryam.adventuregame.dao.FileStatisticsDao;
import se.iths.maryam.adventuregame.dao.StatisticsDao;
import se.iths.maryam.adventuregame.model.Player;
import se.iths.maryam.adventuregame.model.StartRoom;
import se.iths.maryam.adventuregame.model.Statistics;
import se.iths.maryam.adventuregame.service.StatisticsService;
import se.iths.maryam.adventuregame.view.ScannerUI;
import se.iths.maryam.adventuregame.view.UI;

public class Main {

    public static void main(String[] args) {
        UI ui = new ScannerUI();
        ui.showMessage("Välkommen till Äventyrsspelet!");
        ui.showMessage("Version " + AppInfo.getInstance().getVersion() + " av " + AppInfo.getInstance().getAuthor());
        String name = ui.getInput("Ange ditt namn:");
        Player player = new Player.Builder()
                .setName(name)
                .setHealth(100)
                .setScore(0)
                .setStrength(10)
                .build();
        new StartRoom().enterRoom(player, ui);

        StatisticsDao dao = new FileStatisticsDao();
        dao.save(new Statistics(player.getName(), player.getScore()));

        StatisticsService service = new StatisticsService(dao);
        ui.showMessage("\n--- Topplista ---");
        for (Statistics s : service.getSortedStatistics()) {
            ui.showMessage(s.getPlayerName() + " - " + s.getScore() + " poäng");
        }
    }
}

