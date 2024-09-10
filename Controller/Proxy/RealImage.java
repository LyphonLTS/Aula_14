package Controller.Proxy;

import Interface.IImage;

public class RealImage implements IImage {
  private String filename;

  public RealImage(String filename) {
    this.filename = filename;
    loadImage();
  }

  private void loadImage() {
    System.out.println("Loading: " + this.filename);
  }

  public void display() {
    System.out.println("Display: " + filename);
  }

  public String getFilename() {
    return this.filename;
  }
}