package Controller.Adapter;

import Interface.IImage;

public class ImageAdapter implements IImage {
  private LegacyImage legacyImage;

  public ImageAdapter(LegacyImage legacyImage) {
    this.legacyImage = legacyImage;
  }

  @Override
  public void display() {
    this.legacyImage.loadAndShow();
  }

}
