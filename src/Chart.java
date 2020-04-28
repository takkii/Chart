import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.general.DefaultPieDataset;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;

class PieChart {
    void en() {
        try {
            double num0;
            double num1;
            double num2;
            double num3;
            double num4;

            String str;
            String str1;

            num0 = 30.61;
            num1 = 18.45;
            num2 = 7.91;
            num3 = 7.27;
            num4 = 6.07;

            str = "プログラミング言語の人気ランキング（2020年4月）";
            str1 = "円グラフ";

            ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());

            DefaultPieDataset data = new DefaultPieDataset();
            data.setValue("Python", num0);
            data.setValue("Java", num1);
            data.setValue("JavaScript", num2);
            data.setValue("C#", num3);
            data.setValue("PHP", num4);

            // 2D
            //JFreeChart chart = ChartFactory.createPieChart(str, data, true, false, false);

            // 3D
            JFreeChart chart = ChartFactory.createPieChart3D(str, data, true, false, false);

            BufferedImage image = chart.createBufferedImage(399, 200);
            ImageIO.write(image, "PNG", new File("piechart_lang.png"));

            JFrame frame = new JFrame(str1);
            frame.add(new ChartPanel(chart));
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.pack();
            frame.setVisible(true);
        } catch (Exception e) {
            System.err.println("Exception error");
            e.printStackTrace(System.out);
        }
    }
}

public class Chart {
    public static void main(String[] args) {
        final PieChart obj = new PieChart();
        obj.en();
    }
}
