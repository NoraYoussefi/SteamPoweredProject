import fr.ubo.steam.DAO.ImageRevolverDao;
import fr.ubo.steam.DAO.ImageRevolverDaoImpl;
import org.junit.BeforeClass;
import org.junit.Test;

import java.io.File;
import java.nio.file.Files;
import java.util.HashMap;
import java.util.Map;

import static org.junit.Assert.assertEquals;

public class testImageRevolverDAO {
   static ImageRevolverDaoImpl imageRevolverDao;

   @BeforeClass
   public static void setTest() {
       imageRevolverDao = new ImageRevolverDao();
   }
    static String  dir="src/test/img/revolver/main";
    static String  dir1="src/test/img/revolver/promo";

    Map<String, byte[]> images1 = new HashMap<String, byte[]>();
    @Test
    public void testAssertMapMain() throws Exception {


     Map<String, byte[]> map = imageRevolverDao.loadImagesMain("src/img/revolver/main");


      File directory = new File(dir);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }


       assertEquals(map.keySet(),images1.keySet());

    }


    @Test
    public void testAssertMapPromo() throws Exception {


        Map<String, byte[]> map = imageRevolverDao.loadImagesMain("src/img/revolver/promo");


        File directory = new File(dir1);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }


        assertEquals(map.keySet(),images1.keySet());

    }

    @Test
    public void testAssertImageMainUnique() throws Exception {

        Map<String, byte[]> map = imageRevolverDao.loadImagesPromo("src/img/revolver/main");

        File directory = new File(dir);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }


        assertEquals(map.keySet().toArray()[0],images1.keySet().toArray()[0]);
        // System.out.printf(images1.keySet().toArray()[0] + " ::" + images1.values().toArray()[0] );
        // System.out.printf(map.keySet().toArray()[0]  + " ::" + map.values().toArray()[0] );
    }


    @Test
    public void testAssertImagePromoUnique() throws Exception {

        Map<String, byte[]> map = imageRevolverDao.loadImagesPromo("src/img/revolver/promo");

        File directory = new File(dir1);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }


        assertEquals(map.keySet().toArray()[0],images1.keySet().toArray()[0]);
       // System.out.printf(images1.keySet().toArray()[0] + " ::" + images1.values().toArray()[0] );
       // System.out.printf(map.keySet().toArray()[0]  + " ::" + map.values().toArray()[0] );
    }

    @Test
    public void testAssertNoImage() throws Exception {

        Map<String, byte[]> map = imageRevolverDao.loadImagesPromo("src/img/revolver/promo");

        File directory = new File(dir1);
        File[] allFiles = directory.listFiles();

        String supportedImageTypes = "png";

        for(File file : allFiles){
            String fileExtension = file.getName().substring(file.getName().lastIndexOf(".") + 1);

            if(supportedImageTypes.equals(fileExtension)){
                images1.put(file.getName().substring(0,file.getName().lastIndexOf(".")), Files.readAllBytes(file.toPath()));
            }
        }


        assertEquals(map.keySet().toArray()[0],images1.keySet().toArray()[0]);
        // System.out.printf(images1.keySet().toArray()[0] + " ::" + images1.values().toArray()[0] );
        // System.out.printf(map.keySet().toArray()[0]  + " ::" + map.values().toArray()[0] );
    }

}
