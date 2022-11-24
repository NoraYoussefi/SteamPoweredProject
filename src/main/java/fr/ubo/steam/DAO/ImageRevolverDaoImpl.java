package fr.ubo.steam.DAO;

import java.util.Map;

public interface ImageRevolverDaoImpl{
    public Map<String,byte[]> loadImagesMain(String dir) throws Exception;
    public Map<String,byte[]> loadImagesPromo(String dir) throws Exception;

}
