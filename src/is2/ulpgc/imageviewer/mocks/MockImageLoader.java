package is2.ulpgc.imageviewer.mocks;

import is2.ulpgc.imageviewer.Image;
import is2.ulpgc.imageviewer.ImageLoader;

public class MockImageLoader implements ImageLoader {

    private final String[] imageFileNames = new String[] {"src/is2/ulpgc/imageviewer/image1.jpg",
            "is2/ulpgc/imageviewer/image2.jpg",
            "is2/ulpgc/imageviewer/image3.jpg","is2/ulpgc/imageviewer/image4.jpg","is2/ulpgc/imageviewer/image5.jpg"};
    @Override
    public Image load() {
        return imageAt(0);
    }

    private Image imageAt(int i) {
        return new Image() {
            @Override
            public String id() {
                return imageFileNames[i];
            }

            @Override
            public Image next() {
                return imageAt((i + 1) % imageFileNames.length);
            }

            @Override
            public Image prev() {
                return imageAt(i > 0 ? i - 1 : imageFileNames.length - 1);
            }
        };
    }
}
