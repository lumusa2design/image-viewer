package is2.ulpgc.imageviewer.model;

public interface Image {
    String id();
    Image next();
    Image prev();

}
