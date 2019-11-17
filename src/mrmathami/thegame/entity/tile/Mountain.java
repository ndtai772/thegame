package mrmathami.thegame.entity.tile;

public final class Mountain extends AbstractTile {
	public final int type;
	public Mountain(long createdTick, long posX, long posY, int type) {
		super(createdTick, posX, posY, 1L, 1L);
		this.type = type;
	}
}
