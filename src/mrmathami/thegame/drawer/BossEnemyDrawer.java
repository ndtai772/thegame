package mrmathami.thegame.drawer;

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.paint.Color;
import mrmathami.thegame.Config;
import mrmathami.thegame.LoadedImage;
import mrmathami.thegame.entity.GameEntity;
import mrmathami.thegame.entity.enemy.BossEnemy;

import javax.annotation.Nonnull;

public final class BossEnemyDrawer implements EntityDrawer {
	@Override
	public void draw(long tickCount, @Nonnull GraphicsContext graphicsContext, @Nonnull GameEntity entity, double screenPosX, double screenPosY, double screenWidth, double screenHeight, double zoom) {
//		graphicsContext.setFill(Color.DARKVIOLET);
//		graphicsContext.fillRoundRect(screenPosX, screenPosY, screenWidth, screenHeight, 4, 4);
//		if (entity instanceof BossEnemy) {
//			BossEnemy enemy = ((BossEnemy) entity);
//			graphicsContext.setFill(Color.RED);
//			graphicsContext.fillText(String.format("%d", enemy.getHealth()), screenPosX, screenPosY, 20);
//		}
		if (entity instanceof BossEnemy) {
			BossEnemy enemy = ((BossEnemy) entity);
			graphicsContext.setFill(Color.BLUE);
			double blue = enemy.getHealth() * screenWidth / Config.BOSS_ENEMY_HEALTH * (2.0 / 3);
			double red = screenWidth * 2 / 3 - blue;
			graphicsContext.fillRect(screenPosX + screenWidth / 6, screenPosY - 10, blue, 3);
			graphicsContext.setFill(Color.RED);
			graphicsContext.fillRect(screenPosX + screenWidth / 6 + blue, screenPosY - 10, red, 3);
			if (((BossEnemy) entity).badEffect) graphicsContext.setEffect(new ColorAdjust(0.4 * Math.random(), 0,0, 0));
		}
		graphicsContext.drawImage(LoadedImage.BOSS_ENEMY, screenPosX, screenPosY, screenWidth, screenHeight);
		graphicsContext.setEffect(null);
	}
}
