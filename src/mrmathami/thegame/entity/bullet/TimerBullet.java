package mrmathami.thegame.entity.bullet;

import mrmathami.thegame.Config;
import mrmathami.thegame.GameField;
import mrmathami.thegame.entity.LivingEntity;
import mrmathami.thegame.entity.enemy.AbstractEnemy;
import mrmathami.thegame.entity.enemy.SmallerEnemy;

import javax.annotation.Nonnull;

public final class TimerBullet extends AbstractBullet {
    public TimerBullet(long createdTick, double posX, double posY, double deltaX, double deltaY) {
        super(createdTick, posX, posY, deltaX, deltaY, Config.TIMER_BULLET_SPEED, Config.TIMER_BULLET_STRENGTH, Config.TIMER_BULLET_TTL);
    }

    @Override
    public boolean onEffect(@Nonnull GameField field, @Nonnull LivingEntity livingEntity) {
        super.onEffect(field, livingEntity);
        if(livingEntity instanceof AbstractEnemy) {
            AbstractEnemy enemy = (AbstractEnemy) livingEntity;
            enemy.doTimerEffect(0.6);
        }
        return false ;
    }
}