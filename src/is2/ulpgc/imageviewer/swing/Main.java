package is2.ulpgc.imageviewer.swing;

import is2.ulpgc.imageviewer.model.Image;
import is2.ulpgc.imageviewer.presenter.ImagePresenter;
import is2.ulpgc.imageviewer.mocks.MockImageLoader;

public class Main {
    public static void main(String[] args) {
        MainFrame frame = new MainFrame();
        ImagePresenter presenter = new ImagePresenter(frame.getImageDisplay());
        presenter.show(image());
        frame.setVisible(true);
    }

    private static Image image() {
        return new MockImageLoader().load();
    }
}
