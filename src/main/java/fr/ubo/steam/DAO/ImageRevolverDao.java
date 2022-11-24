package fr.ubo.steam.DAO;

import fr.ubo.steam.Business.ImageRevolver;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;


public class ImageRevolverDao implements ImageRevolverDaoImpl{

    Map<String, byte[]> images = new HashMap<String, byte[]>();

    @Override
    public Map<String, byte[]> loadImagesMain(String dir) throws Exception {
        File directory = new File(dir);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }
        //System.out.printf(images.keySet() + " ::" + images.values());
        return images;
    }

    @Override
    public Map<String, byte[]> loadImagesPromo(String dir)  throws Exception {
        File directory = new File(dir);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }
       // System.out.printf(images.keySet() + " ::" + images.values());
        return images;
    }
}
