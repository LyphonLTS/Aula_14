package Controller.Adapter;

public class LegacyImage {
  private String file;

  public LegacyImage(String file) {
    this.file = file;
  }

  public String getFile() {
    return this.file;
  }

  public void setFile(String file) {
    this.file = file;
  }

  public void loadAndShow() {
    System.out.println("Loading and showing legacy system image: " + file);
  }
}
