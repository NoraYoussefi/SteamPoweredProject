package fr.ubo.steam.steampowered.ImageRevolver.Business;

import java.util.Map;

public interface ImageRevolverImpl {
    String getImageData(final byte[] image);
    public Map<String,String> loadImages(final String typeRevolver);
}
