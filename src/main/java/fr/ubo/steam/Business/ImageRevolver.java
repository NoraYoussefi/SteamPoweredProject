package fr.ubo.steam.Business;

import fr.ubo.steam.DAO.ImageRevolverDao;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.Base64Utils;

import java.util.HashMap;
import java.util.Map;
@Service
public class ImageRevolver implements ImageRevolverImpl{

    ImageRevolverDaoImpl imageRevolverDao = new ImageRevolverDao();

    @Override
    public  String getImageData(byte[] image) {
        String base64= Base64Utils.encodeToString(image);
        base64 = "data:image/png;base64,"+base64;
        return base64;
    }
    @Override
    public Map<String,String> loadImages(final String typeRevolver) throws Exception {
        Map<String, byte[]> map = imageRevolverDao.loadImagesMain("src/img/revolver/"+ typeRevolver);
        Map<String, String> loadImages= new HashMap<>();
        for(int i = 1; i < map.size(); i++)
        {
            String ab = getImageData((byte[]) map.values().toArray()[i]);
            loadImages.put(map.keySet().toString(),ab);
            //System.out.printf(loadImages.values().toString());
        }
       return loadImages;
    }

}
