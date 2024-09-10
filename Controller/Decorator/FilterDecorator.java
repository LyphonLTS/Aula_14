package Controller.Decorator;

import Interface.IImage;

public class FilterDecorator extends ImageDecorator {
  public FilterDecorator(IImage decoratedImage) {
    super(decoratedImage);
  }

  @Override
  public void display() {
    super.decoratedImage.display();
    applyFilter();
  }

  private void applyFilter() {
    System.out.println("Applying filter to image");
  }
}
