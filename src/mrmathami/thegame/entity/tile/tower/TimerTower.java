package mrmathami.thegame.entity.tile.tower;

import mrmathami.thegame.Config;
import mrmathami.thegame.LoadedAudio;
import mrmathami.thegame.entity.bullet.TimerBullet;

import javax.annotation.Nonnull;

public final class TimerTower extends AbstractTower<TimerBullet> {
    public TimerTower(long createdTick, long posX, long posY) {
        super(createdTick, posX, posY, Config.TIMER_TOWER_RANGE, Config.TIMER_TOWER_SPEED);
    }
    //	private AudioClip audioClip = LoadedAudio.getBulletSound();
    @Nonnull
    @Override
    protected final TimerBullet doSpawn(long createdTick, double posX, double posY, double deltaX, double deltaY) {
        if (Config.sfx) LoadedAudio.timer().play();
        return new TimerBullet(createdTick, posX, posY, deltaX, deltaY);
    }
}