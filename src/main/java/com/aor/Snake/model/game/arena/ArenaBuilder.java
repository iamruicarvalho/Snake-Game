package com.aor.Snake.model.game.arena;


import com.aor.Snake.model.game.Fruit.Fruit;
import com.aor.Snake.model.game.elements.SnakeBody;
import com.aor.Snake.model.game.elements.Wall;

import java.util.List;

public abstract class ArenaBuilder {
    public Arena createArena() {
        Arena arena = new Arena(getWidth(), getHeight());
        arena.setSnake(createSnake());
        arena.setWalls(createWalls());
        arena.setFruit(createFruit());

        return arena;
    }

    protected abstract int getWidth();
    protected abstract int getHeight();
    protected abstract List<Wall> createWalls();
    protected abstract List<SnakeBody> createSnake();
    protected abstract Fruit createFruit();


}
