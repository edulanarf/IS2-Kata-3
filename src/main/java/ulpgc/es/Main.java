package ulpgc.es;

import java.io.File;
import java.io.IOException;
import java.util.List;
import java.util.Map;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) throws IOException {
        TitleReader reader = new TsvTitleReader(new File("./title.basics.tsv"), true);
        generateHistogram(reader);
    }

    private static void generateHistogram(TitleReader reader) throws IOException {
        List<Title> titles = reader.read();
        HistogramGenerator generator = new HistogramGenerator();
        Map<Title.TitleType, Integer> histogram = generator.generate(titles);
    }
}