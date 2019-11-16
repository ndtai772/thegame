package mrmathami.thegame.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import mrmathami.thegame.Config;
import mrmathami.thegame.LoadedImage;
import mrmathami.thegame.entity.GameEntity;
import mrmathami.thegame.entity.enemy.SmallerEnemy;

import javax.annotation.Nonnull;

public final class SmallerEnemyDrawer implements EntityDrawer {
	@Override
	public void draw(long tickCount, @Nonnull GraphicsContext graphicsContext, @Nonnull GameEntity entity, double screenPosX, double screenPosY, double screenWidth, double screenHeight, double zoom) {
//		graphicsContext.setFill(Color.MAGENTA);
//		graphicsContext.fillRoundRect(screenPosX, screenPosY, screenWidth, screenHeight, 4, 4);
//		if (entity instanceof SmallerEnemy) {
//			SmallerEnemy enemy = ((SmallerEnemy) entity);
//			graphicsContext.setFill(Color.RED);
//			graphicsContext.fillText(String.format("%d", enemy.getHealth()), screenPosX, screenPosY, 20);
//		}
		if (entity instanceof SmallerEnemy) {
			SmallerEnemy enemy = ((SmallerEnemy) entity);
			graphicsContext.setFill(Color.BLUE);
			double blue = enemy.getHealth() * screenWidth / Config.SMALLER_ENEMY_HEALTH;
			graphicsContext.fillRect(screenPosX + screenWidth / 6, screenPosY - 10, blue * 2 / 3, 3);
		}
		graphicsContext.drawImage(LoadedImage.SMALLER_ENEMY, screenPosX, screenPosY, screenWidth, screenHeight);

	}
}
