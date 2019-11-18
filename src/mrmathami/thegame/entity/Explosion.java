package mrmathami.thegame.entity;

import mrmathami.thegame.Config;
import mrmathami.thegame.GameField;
import mrmathami.thegame.entity.enemy.BossEnemy;
import mrmathami.thegame.entity.enemy.NormalEnemy;
import mrmathami.thegame.entity.enemy.TankerEnemy;

import javax.annotation.Nonnull;

public class Explosion extends AbstractEntity implements DestroyableEntity, UpdatableEntity {
    public long tickDown = Config.GAME_TPS;
    public final Class<?> enemyClass;
    private final double div;
    public Explosion(long createdTick, AbstractEntity e) {
        super(createdTick, e.getPosX() + e.getWidth() / 2, e.getPosY() + e.getWidth() / 2, e.getWidth(), e.getHeight());
        this.enemyClass = e.getClass();
        if (enemyClass.equals(NormalEnemy.class))
            tickDown = (long) (Config.GAME_TPS * 1.5);
        else if (enemyClass.equals(TankerEnemy.class))
            tickDown = Config.GAME_TPS * 2;
        else if (enemyClass.equals(BossEnemy.class))
            tickDown = (long) (Config.GAME_TPS * 2.5);
        div = Math.exp(Math.log(2) / (tickDown * (tickDown + 1) / 2.0));
    }

    @Override
    public void doDestroy() {
        tickDown = 0;
    }

    @Override
    public boolean isDestroyed() {
        return tickDown <= 0;
    }

    @Override
    public void onUpdate(@Nonnull GameField field) {
        tickDown--;
        double k = Math.pow(div, tickDown);
        this.setWidth(getWidth() * k);
        this.setHeight(getWidth() * k);
    }
}
