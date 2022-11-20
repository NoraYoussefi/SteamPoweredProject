package fr.ubo.steam.steampowered.ImageRevolver.DAO;


import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class ImageRevolverDao implements ImageRevolverDaoImpl{
    @Override
    public Map<String, byte[]> loadImagesMain() throws IOException {
        Map< String,byte[]> map = new HashMap< String,byte[]>();

        for (int i = 0; i <= map.size(); i++) {
            map.put("main"+i, ("src/img/revolver/main/main" + i + ".jpg").getBytes());
        }
        return map;
    }

    @Override
    public Map<String, byte[]> loadImagesPromo() {
        return null;
    }
}
