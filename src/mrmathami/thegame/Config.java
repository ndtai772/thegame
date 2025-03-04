package mrmathami.thegame;

public final class Config {
	/**
	 * Game name. Change it if you want.
	 */
	static final String GAME_NAME = "TOWER DEFENSE";
	/**
	 * Ticks per second
	 */
	public static final long GAME_TPS = 20;
	/**
	 * Nanoseconds per tick
	 */
	static final long GAME_NSPT = Math.round(1000000000.0 / GAME_TPS);

	/**
	 * Size of the tile, in pixel.
	 * 1.0 field unit == TILE_SIZE pixel on the screen.
	 * Change it base on your texture size.
	 */
	public static final long TILE_SIZE = 35;
	/**
	 * Num of tiles the screen can display if fieldZoom is TILE_SIZE,
	 * in other words, the texture will be display as it without scaling.
	 */
	private static final long TILE_HORIZONTAL = 30;
	/**
	 * Num of tiles the screen can display if fieldZoom is TILE_SIZE,
	 * in other words, the texture will be display as it without scaling.
	 */
	private static final long TILE_VERTICAL = 17;
	/**
	 * An arbitrary number just to make some code run a little faster.
	 * Do not touch.
	 */
	static final int _TILE_MAP_COUNT = (int) (TILE_HORIZONTAL * TILE_VERTICAL);


	/**
	 * Size of the screen.
	 */
	public static final long SCREEN_WIDTH = TILE_SIZE * TILE_HORIZONTAL;
	/**
	 * Size of the screen.
	 */
	public static final long SCREEN_HEIGHT = TILE_SIZE * TILE_VERTICAL;


	//Other config related to other entities in the game.

	//region Bullet
	public static final long NORMAL_BULLET_TTL = 15;
	public static final long NORMAL_BULLET_STRENGTH = 15;
	public static final double NORMAL_BULLET_SPEED = 0.6;

	public static final long MACHINE_GUN_BULLET_TTL = 11;
	public static final long MACHINE_GUN_BULLET_STRENGTH = 10;
	public static final double MACHINE_GUN_BULLET_SPEED = 0.7;

	public static final long SNIPER_BULLET_TTL = 10;
	public static final long SNIPER_BULLET_STRENGTH = 40;
	public static final double SNIPER_BULLET_SPEED = 0.9;

	public static final long TIMER_BULLET_TTL = 60;
	public static final long TIMER_BULLET_STRENGTH = 2;
	public static final double TIMER_BULLET_SPEED = 0.5;
	//endregion

	//region Tower
	public static final long NORMAL_TOWER_SPEED = 30;
	public static final double NORMAL_TOWER_RANGE = 5.0;

	public static final long MACHINE_GUN_TOWER_SPEED = 8;
	public static final double MACHINE_GUN_TOWER_RANGE = 4.0;

	public static final long SNIPER_TOWER_SPEED = 60;
	public static final double SNIPER_TOWER_RANGE = 7.0;

	public static final long TIMER_TOWER_SPEED = 50;
	public static final double TIMER_TOWER_RANGE = 7.0;
	//endregion

	//region Enemy
	public static final double NORMAL_ENEMY_SIZE = 1;
	public static final long NORMAL_ENEMY_HEALTH = 150;
	public static final long NORMAL_ENEMY_ARMOR = 3;
	public static final double NORMAL_ENEMY_SPEED = 0.1;
	public static final long NORMAL_ENEMY_REWARD = 2;

	public static final double SMALLER_ENEMY_SIZE = 0.9;
	public static final long SMALLER_ENEMY_HEALTH = 50;
	public static final long SMALLER_ENEMY_ARMOR = 0;
	public static final double SMALLER_ENEMY_SPEED = 0.2;
	public static final long SMALLER_ENEMY_REWARD = 3;

	public static final double TANKER_ENEMY_SIZE = 1.2;
	public static final long TANKER_ENEMY_HEALTH = 400;
	public static final long TANKER_ENEMY_ARMOR = 5;
	public static final double TANKER_ENEMY_SPEED = 0.07;
	public static final long TANKER_ENEMY_REWARD = 4;

	public static final double BOSS_ENEMY_SIZE = 1.5;
	public static final long BOSS_ENEMY_HEALTH = 500;
	public static final long BOSS_ENEMY_ARMOR = 8;
	public static final double BOSS_ENEMY_SPEED = 0.1;
	public static final long BOSS_ENEMY_REWARD = 10;
	//endregion

	static final long START_CREDIT = 100;

	enum KEY_STATUS {
		NONE, NORMAL_TOWER, SNIPER_TOWER, MACHINE_GUN_TOWER, TIMER_TOWER, SELL
	}

	enum GAME_STATUS {
		NONE, WIN, LOSE, PAUSE
	}
	static final long NORMAL_TOWER_PRICE = 10;
	static final long MACHINE_GUN_TOWER_PRICE = 20;
	static final long SNIPER_TOWER_PRICE = 15;
	static final long TIMER_TOWER_PRICE = 50;
	static final String logPath = "res/log";
	public static boolean sfx = true;
	static boolean music = true;
	static boolean autoPlay = false;

	private Config() {
	}


}
