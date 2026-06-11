package ProxyPatternExample;

public class RealImage implements Image{
    private String filename;

    public RealImage(String filename){
        this.filename=filename;
        loadImage();
    }

    public void loadImage(){
        System.out.println("Image Loaded in server "+filename);
    }
    @Override
    public void display(){
        System.out.println("Real image displayed "+filename);
    }
}
