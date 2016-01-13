package skoczny.jedynak.poradnik.dataview;

import org.jfree.chart.ChartFactory;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.plot.PiePlot3D;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;
import org.jfree.data.general.DefaultPieDataset;
import org.jfree.util.Rotation;
import sun.misc.BASE64Encoder;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.Map;

/**
 * Created by Damian on 2016-01-11.
 */
public class ChartDrawer {
    public static String createPieChartImageURIFromData(Map<String, Double> categories, String tytul, boolean is3D) {

        DefaultPieDataset dataset = new DefaultPieDataset();
        for (Map.Entry<String, Double> entry : categories.entrySet()) {
            dataset.setValue(entry.getKey(), entry.getValue());
        }

        JFreeChart chart;
        if (is3D) {
            chart = ChartFactory.createPieChart3D(
                    tytul, // chart title
                    dataset, // data
                    true, // include legend
                    true,
                    false);

            final PiePlot3D plot = (PiePlot3D) chart.getPlot();
            plot.setStartAngle(200);
            plot.setDirection(Rotation.CLOCKWISE);
            plot.setForegroundAlpha(0.5f);
            plot.setNoDataMessage("No data to display");
        } else {
            chart = ChartFactory.createPieChart(
                    tytul, // chart title
                    dataset, // data
                    true, // include legend
                    true,
                    false);
        }

        int width = 620;
        int height = 430;

        String imageUri = getImageUri(chart, width, height);
        return imageUri;
    }

    private static String getImageUri(JFreeChart chart, int width, int height) {
        BufferedImage bufferedImage = chart.createBufferedImage(width, height);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        try {
            ImageIO.write(bufferedImage, "png", baos);
            baos.flush();
            baos.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        byte[] imageInByte = baos.toByteArray();
        BASE64Encoder base64Encoder = new BASE64Encoder();
        return "data:image/png;base64," + base64Encoder.encode(imageInByte);
    }

    public static String createBarChartImageURIFromData(Map<String, Double> categories, String tytul, String podTytulX, String podTytulY) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Double> entry : categories.entrySet()) {
            dataset.addValue(entry.getValue(), "", entry.getKey());
        }
        JFreeChart barChart = ChartFactory.createBarChart(
                tytul,
                podTytulX, podTytulY,
                dataset, PlotOrientation.VERTICAL,
                false, false, false);

        int width = 1900;
        int height = 380;

        String imageUri = getImageUri(barChart, width, height);
        return imageUri;
    }

    public static String createLineChartImageURIFromData(Map<String, Double> categories, String tytul, String podTytulX, String podTytulY) {
        final DefaultCategoryDataset dataset = new DefaultCategoryDataset();

        for (Map.Entry<String, Double> entry : categories.entrySet()) {
            dataset.addValue(entry.getValue(), "", entry.getKey());
        }

        JFreeChart lineChartObject = ChartFactory.createLineChart(
                tytul, podTytulX,
                podTytulY,
                dataset, PlotOrientation.VERTICAL,
                false, false, false);

        int width = 620;
        int height = 430;

        String imageUri = getImageUri(lineChartObject, width, height);
        return imageUri;
    }
}