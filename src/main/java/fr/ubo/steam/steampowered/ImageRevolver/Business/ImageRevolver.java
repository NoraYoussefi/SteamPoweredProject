package fr.ubo.steam.steampowered.ImageRevolver.Business;

import org.springframework.util.Base64Utils;

import java.util.Map;

public class ImageRevolver implements ImageRevolverImpl{
    @Override
    public String getImageData(byte[] image) {
        String base64= Base64Utils.encodeToString(image);
        base64 = "data:image/png;base64,"+base64;
        return base64;
    }
    public Map<String,String> loadImages(final String typeRevolver){
       return null;
    }

}
