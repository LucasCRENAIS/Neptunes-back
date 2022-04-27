package io.ipme.neptunes.Model;

import javax.persistence.*;
import javax.validation.constraints.NotNull;

@Entity
public class Game {

    /*Attributes*/

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID", unique = true, nullable = false)
    private Integer id;

    @NotNull
    @Column(name = "game_url", length = 100)
    private String gameUrl;

    @NotNull
    @Column(name = "is_paused")
    private Boolean isPaused;

    @NotNull
    @Enumerated(EnumType.STRING)
    private GameMode mode;

    /*Constructors*/

    public Game(String gameUrl, Boolean isPaused, GameMode mode) {
        this.gameUrl = gameUrl;
        this.isPaused = isPaused;
        this.mode = mode;
    }

    /*getters*/

    public Integer getId() {
        return id;
    }

    public String getGameUrl() {
        return gameUrl;
    }

    public Boolean getPaused() {
        return isPaused;
    }

    public GameMode getMode() {
        return mode;
    }

    /*setter*/

    public void setMode(GameMode mode) {
        this.mode = mode;
    }
}