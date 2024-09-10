package Controller.Proxy;

import Interface.IImage;

public class ProxyImage implements IImage {
  private RealImage realImage;
  private String filename;

  public ProxyImage(String filename) {
    this.filename = filename;
  }

  public void display() {
    if (this.realImage == null) {
      this.realImage = new RealImage(this.filename);
    }

    realImage.display();
  }
}
