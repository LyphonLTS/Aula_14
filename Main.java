import Controller.Adapter.ImageAdapter;
import Controller.Adapter.LegacyImage;
import Controller.Decorator.BorderDecorator;
import Controller.Decorator.FilterDecorator;
import Controller.Proxy.ProxyImage;
import Interface.IImage;

class Main {
  public static void main(String[] args) {
    IImage image1 = new ProxyImage("image1.png");
    IImage image2 = new ProxyImage("image2.svg");

    IImage decoratedImage1 = new BorderDecorator(new FilterDecorator(image1));
    IImage decoratedImage2 = new BorderDecorator(image2);

    LegacyImage legacyImage = new LegacyImage("legacyImage.bmp");
    IImage imageAdapter = new ImageAdapter(legacyImage);

    System.out.println("Image 1");
    image1.display();

    System.out.println();
    System.out.println("Image 2");
    image2.display();

    System.out.println();
    System.out.println("Image decorated 1");
    decoratedImage1.display();

    System.out.println();
    System.out.println("Image decorated 2");
    decoratedImage2.display();

    System.out.println();
    System.out.println("Adapted image");
    imageAdapter.display();
  }
}