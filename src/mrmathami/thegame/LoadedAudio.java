package mrmathami.thegame;

import javafx.scene.media.AudioClip;
import mrmathami.thegame.entity.enemy.NormalEnemy;
import mrmathami.thegame.entity.enemy.SmallerEnemy;
import mrmathami.thegame.entity.enemy.TankerEnemy;

import java.io.File;

public class LoadedAudio {
    private static AudioClip load(String path, double volume, double rate) {
        File file = new File(LoadedAudio.class.getResource(path).getFile());
        AudioClip audioClip = new AudioClip(file.toURI().toString());
        audioClip.setVolume(volume);
        audioClip.setRate(rate);
        return audioClip;
    }

    public static AudioClip sniper() {
        return load("/audio/bulletSound.mp3", 0.04, 1);
    }

    public static AudioClip normal() {
        return load("/audio/normalTower.mp3", 0.04, 1);
    }

    public static AudioClip machineGun() {
        return load("/audio/normalTower.mp3" , 0.04, 1.2);
    }

    public static AudioClip enemyDestroy(Class<?> enemyClass) {
        if (enemyClass.equals(SmallerEnemy.class)) return load("/audio/enemyDestroy.mp3", 0.04, 1);
        else if (enemyClass.equals(NormalEnemy.class)) return load("/audio/enemyDestroy.mp3", 0.08, 0.9);
        else if (enemyClass.equals(TankerEnemy.class)) return load("/audio/enemyDestroy.mp3", 0.16, 0.8);
        else return load("/audio/enemyDestroy.mp3", 0.4, 0.7);
    }

    public static AudioClip timer() {
        return load("/audio/normalTower.mp3" , 0.02, 1);
    }

    static AudioClip BACKGROUND_MUSIC = backgroundMusic();
    private static AudioClip backgroundMusic() {
        AudioClip audioClip = load("/audio/swordland.mp3", 0.03, 1);
        audioClip.setPriority(1);
        audioClip.setCycleCount(AudioClip.INDEFINITE);
        return audioClip;
    }
    static AudioClip WIN = load("/audio/smb_world_clear.wav", 0.5, 1);
    static AudioClip LOSE = load("/audio/smb_gameover.wav", 0.5, 1);
}
