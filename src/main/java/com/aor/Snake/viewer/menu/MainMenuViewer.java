package com.aor.Snake.viewer.menu;

import com.aor.Snake.gui.GUI;
import com.aor.Snake.model.Position;
import com.aor.Snake.model.menu.MainMenu;
import com.aor.Snake.viewer.Viewer;

public class MainMenuViewer extends Viewer<MainMenu> {
    public MainMenuViewer(MainMenu mainMenu) {
        super(mainMenu);
    }

    @Override
    public void drawElements(GUI gui) {
        gui.drawText(new Position(9, 10), "SNAKE GAME", "#21F20A", "#000000");

        for (int i = 0; i < getModel().getNumberEntries(); i++)
            gui.drawText(
                    new Position(10, 13 + i),
                    getModel().getEntry(i),
                    getModel().isSelected(i) ? "#EA0D0D" : "#21F20A", "#000000");
    }
}
