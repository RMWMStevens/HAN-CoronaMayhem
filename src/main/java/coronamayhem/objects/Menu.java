package coronamayhem.objects;

import nl.han.ica.oopg.dashboard.Dashboard;
import coronamayhem.CoronaMayhem;

/**
 * Opens and closes all menu screens (start/pause menu and death menu)
 */
public class Menu {
    private final CoronaMayhem world;
    private final Dashboard menuScreen = new Dashboard(350,160,500,500);
    private final Dashboard deathScreen = new Dashboard(350,160,500,500);

    public Menu(CoronaMayhem world) {
        this.world = world;
    }

    /**
     * Creates and shows the start/pause screen
     */
    public void showPauseScreen() {
        TextObject playBtn = new TextObject("Press Enter to Play and Pause!");
        TextObject exitBtn = new TextObject("Press Escape to Exit!");

        world.addDashboard(menuScreen);
        menuScreen.setBackground(2,15,30);
        menuScreen.addGameObject(playBtn, -240,1);
        menuScreen.addGameObject(exitBtn, -240,150);
    }

    /**
     * Creates and shows the death screen
     */
    public void showDeathScreen() {
        TextObject deathText = new TextObject("You've Died!");
        TextObject exitBtn = new TextObject("Press Escape to Exit!");
        TextObject retryBtn = new TextObject("Press Enter to Retry!");

        world.addDashboard(deathScreen);
        deathScreen.setBackground(80,1,0);
        deathScreen.addGameObject(deathText, -220,1);
        deathScreen.addGameObject(retryBtn, -240,110);
        deathScreen.addGameObject(exitBtn, -240,150);
    }

    /**
     * Hides all menu instances
     */
    public void hide() {
        if(world.getDashboards().contains(menuScreen))
        {
            world.deleteDashboard(menuScreen);
        }
        if(world.getDashboards().contains(deathScreen))
        {
            world.deleteDashboard(deathScreen);
        }
    }
}
