package Controller.Decorator;

import Interface.IImage;

public class WatermarkDecorator extends ImageDecorator {
  public WatermarkDecorator(IImage decoratedImage) {
    super(decoratedImage);
  }

  @Override
  public void display() {
    super.decoratedImage.display();
    applyFilter();
  }

  private void applyFilter() {
    System.out.println("Applying watermark to image");
  }
}
