package mrmathami.thegame.entity.tile;

public class Obstacle extends AbstractTile {
    public final int index;
    public Obstacle(long createdTick, long posX, long posY, int index) {
        super(createdTick, posX, posY,1L, 1L);
        this.index = index;
    }
}
