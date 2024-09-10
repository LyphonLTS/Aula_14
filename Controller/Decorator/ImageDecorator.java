package Controller.Decorator;

import Interface.IImage;

public abstract class ImageDecorator implements IImage {
  protected IImage decoratedImage;

  public ImageDecorator(IImage decoratedImage) {
    this.decoratedImage = decoratedImage;
  }

  public void display() {
    this.decoratedImage.display();
  }

  public IImage getDecoratedImage() {
    return this.decoratedImage;
  }
}
