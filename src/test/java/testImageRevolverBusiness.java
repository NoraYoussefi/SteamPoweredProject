import fr.ubo.steam.Business.ImageRevolver;
import fr.ubo.steam.Business.ImageRevolverImpl;
import fr.ubo.steam.DAO.ImageRevolverDao;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class testImageRevolverBusiness {

    static ImageRevolverImpl imageRevolver;
    static ImageRevolverDaoImpl imageRevolverDao;

    @BeforeClass
    public static void setTest() {
        imageRevolver = new ImageRevolver();
        imageRevolverDao = new ImageRevolverDao();
    }

    static String  dir="src/test/img/revolver/main";
    static String  dir1="src/test/img/revolver/promo";
    Map<String, byte[]> images1 = new HashMap<String, byte[]>();
    Map<String, String> loadImages= new HashMap<String,String>();
    @Test
    public void testBusinessMultiImagesMain() throws Exception {

        loadImages=imageRevolver.loadImages("main");
       // System.out.printf(loadImages.values().toString());
     /*   Map<String, byte[]> map = imageRevolverDao.loadImagesMain("src/img/revolver/main");
        Map<String, String> loadImages= new HashMap<>();
        for(int i = 1; i < map.size(); i++)
        {
            String ab = imageRevolver.getImageData((byte[]) map.values().toArray()[i]);
            loadImages.put(map.keySet().toString(),ab);
            //System.out.printf(loadImages.values().toString());
        }*/

        File directory = new File(dir);
        File[] allFiles = directory.listFiles();
        String supportedImageTypes = "png";
        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);
            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }
        Map<String, String> loadImages1 = new HashMap<>();
        for(int i = 1; i < images1.size(); i++)
        {
            String aa = imageRevolver.getImageData((byte[]) images1.values().toArray()[i]);
            loadImages1.put(images1.keySet().toString(),aa);
            //System.out.printf(loadImages1.values().toString());
        }

        assertEquals(loadImages1.values().toString(),loadImages.values().toString());
    }

    @Test
    public void testBusinessMultiImagesPromo() throws Exception {

        loadImages=imageRevolver.loadImages("promo");
       /* Map<String, byte[]> map = imageRevolverDao.loadImagesMain("src/img/revolver/promo");
        Map<String, String> loadImages= new HashMap<>();
        for(int i = 1; i < map.size(); i++)
        {
            String ab = imageRevolver.getImageData((byte[]) map.values().toArray()[i]);
            loadImages.put(map.keySet().toString(),ab);
            //System.out.printf(loadImages.values().toString());
        }*/

        File directory = new File(dir1);
        File[] allFiles = directory.listFiles();
        String supportedImageTypes = "png";
        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);
            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }
        Map<String, String> loadImages1 = new HashMap<>();
        for(int i = 1; i < images1.size(); i++)
        {
            String aa = imageRevolver.getImageData((byte[]) images1.values().toArray()[i]);
            loadImages1.put(images1.keySet().toString(),aa);
            //System.out.printf(loadImages1.values().toString());
        }

        assertEquals(loadImages1.values().toString(),loadImages.values().toString());
    }

}
