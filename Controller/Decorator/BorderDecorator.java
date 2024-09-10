package Controller.Decorator;

import Interface.IImage;

public class BorderDecorator extends ImageDecorator {
  public BorderDecorator(IImage decoratedImage) {
    super(decoratedImage);
  }

  @Override
  public void display() {
    super.decoratedImage.display();
    addBorder();
  }

  private void addBorder() {
    System.out.println("Applying filter to image");
  }
}
