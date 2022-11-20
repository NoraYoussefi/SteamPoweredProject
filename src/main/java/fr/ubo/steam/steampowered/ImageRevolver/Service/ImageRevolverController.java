package fr.ubo.steam.steampowered.ImageRevolver.Service;

import fr.ubo.steam.steampowered.ImageRevolver.DAO.ImageRevolverDaoImpl;
import jakarta.ws.rs.GET;
import jakarta.ws.rs.Path;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.Map;

@RestController
public class ImageRevolverController {

    @Autowired
    ImageRevolverDaoImpl imageRevolverDaoImpl;
    @GET
    @Path("all")
    public Map<String, byte[]> getloadImagesMain() throws IOException {
        return imageRevolverDaoImpl.loadImagesMain();

    }



}
