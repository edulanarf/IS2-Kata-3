package ulpgc.es.view;

import ulpgc.es.model.Histogram;

import javax.swing.*;

public class MainFrame extends JFrame {
    HistogramDisplay display;
    public MainFrame(){
        this.setTitle("model.Histogram.Display");
        this.setSize(800,600);
        this.setLocationRelativeTo(null);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.display = new JFreeChartHistogramDisplay();
        add((JPanel)display);
    }

    public void displayhistogram(Histogram histogram){
        display.display(histogram);
    }
}