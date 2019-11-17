package mrmathami.thegame.drawer;

import javafx.scene.canvas.GraphicsContext;
import mrmathami.thegame.Config;
import mrmathami.thegame.LoadedImage;
import mrmathami.thegame.entity.GameEntity;
import mrmathami.thegame.entity.tile.tower.TimerTower;

import javax.annotation.Nonnull;

public final class TimerTowerDrawer implements EntityDrawer {
    @Override
    public void draw(long tickCount, @Nonnull GraphicsContext graphicsContext, @Nonnull GameEntity entity, double screenPosX, double screenPosY, double screenWidth, double screenHeight, double zoom) {
//
        if (entity.getClass().equals(TimerTower.class)) {
            TimerTower tower = (TimerTower) entity;
            graphicsContext.save();
            graphicsContext.translate((tower.getPosX() + tower.getWidth() / 2) * Config.TILE_SIZE, (tower.getPosY() + tower.getHeight() / 2) * Config.TILE_SIZE);
            graphicsContext.rotate(tower.getRotation());
            graphicsContext.drawImage(LoadedImage.TIMER_TOWER, -screenWidth / 2, -screenHeight / 2, screenWidth, screenHeight);
            graphicsContext.restore();
        }
    }
}
