package fr.ubo.steam.Service;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import jakarta.ws.rs.Produces;
import jakarta.ws.rs.core.MediaType;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController
public class ImageRevolverController {
    @Autowired
    ImageRevolverDaoImpl imageRevolverDaoImpl;

    @GetMapping("/imgs")
    @Produces(MediaType.APPLICATION_JSON)
    public Map<String, byte[]> getloadImagesMain() throws Exception {
        return imageRevolverDaoImpl.loadImagesMain("src/img/revolver/main");

    }
    @GetMapping("/test")
    public String test() throws Exception {
        return "test successful";

    }
}
