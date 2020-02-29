import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.StandardChartTheme;
import org.jfree.data.general.DefaultPieDataset;

import javax.imageio.ImageIO;
import javax.swing.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class Chart {
    public static void main(String[] args) throws IOException {

        double num1;
        double num2;
        double num3;
        double num4;

        String str;
        String str2;

        num1 = 32.3;
        num2 = 20.2;
        num3 = 4.6;
        num4 = 42.3;

        str ="スマートフォンのシェア（2010年）";
        str2 = "円グラフ";

        ChartFactory.setChartTheme(StandardChartTheme.createLegacyTheme());

        DefaultPieDataset data = new DefaultPieDataset();
        data.setValue("iPhone", num1);
        data.setValue("Android", num2);
        data.setValue("BlackBerry", num3);
        data.setValue("Windows Mobile", num4);

        // 2D
        //JFreeChart chart = ChartFactory.createPieChart("スマートフォンのシェア（2010年）",data,true,false,false);

        // 3D
        JFreeChart chart = ChartFactory.createPieChart3D(str, data,true,false,false);

        BufferedImage image = chart.createBufferedImage(400,200);
        ImageIO.write(image, "PNG", new File("piechart.png"));

        JFrame frame = new JFrame(str2);
        frame.add(new ChartPanel(chart));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
