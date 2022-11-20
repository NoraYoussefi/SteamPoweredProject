package fr.ubo.steam.steampowered.ImageRevolver.DAO;

public class Image {
    private Integer  Id;
    private String url;
    Type type ;

    public Integer getId() {
        return Id;
    }

    public void setId(Integer id) {
        Id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public Type getType() {
        return type;
    }

    public void setType(Type type) {
        this.type = type;
    }

    public Image() {}

    public Image(Integer id, String url, Type type) {
        Id = id;
        this.url = url;
        this.type = type;
    }
}
