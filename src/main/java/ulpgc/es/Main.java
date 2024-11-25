package ulpgc.es;

import ulpgc.es.control.TitleReader;
import ulpgc.es.control.TitleTypeHistogram;
import ulpgc.es.control.TsvTitleReader;
import ulpgc.es.model.Histogram;
import ulpgc.es.view.MainFrame;
import java.io.File;
import java.io.IOException;


//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        TitleReader reader = new TsvTitleReader(new File("./title.basics.tsv"));
        Histogram histogram = new TitleTypeHistogram(reader.read());
        MainFrame mainFrame = new MainFrame();
        mainFrame.displayhistogram(histogram);
        mainFrame.setVisible(true);
    }
}