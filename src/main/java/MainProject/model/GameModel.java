package MainProject.model;

import java.util.List;

public class GameModel {
    public void updateModel() {
        for (Entity entity : entities) {
            entity.update();
        }
    }

    public List<Entity> getEntities() {
        return entities;
    }

}
