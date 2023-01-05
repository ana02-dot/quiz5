package com.example.java_ana_chkhutiashvili;

import javax.swing.*;
import java.sql.SQLException;
import java.util.Map;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartPanel;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.CategoryAxis;
import org.jfree.chart.axis.CategoryLabelPositions;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.data.category.DefaultCategoryDataset;

import java.awt.*;


public class FlightUtil {

    private FlightUtil() {

    }


    public static void createTable() throws SQLException {
        String createSQL = "CREATE TABLE FLIGHTS(" +
                "DEPARTURE_TIME," +
                "DESTINATION VARCHAR(255)," +
                "PRICE INTEGER, SEATS INTEGER";

        JDBCUtil.getStatement().executeUpdate(createSQL);
        {
        }
        try {
            throw new SQLException(e);
        } catch (RuntimeException e) {
            return;
        }

        public static void insert (Flight flight){

            String insertSql = "INSERT INTO FLIGHTS(TIME, DESTINATION, SEATS, PRICE) VALUES(" +
                    "" + flight.getPrice() + "'," +
                    "" + flight.getSeats() + "'," +
                    "" + flight.getDestination() + "" +
                    "" + flight.getTime();
            try {
                JDBCUtil.getStatement().executeUpdate(CreateSql)
                }catch(SQLException e){
                    throw new RuntimeException(e);
                }


                class FlightChart extends JFrame {

                    
                    private Map<String, Integer> data;

                    public FlightChart(Map<String, Integer> data) {
                        super("Flights from Base");
                        this.data = data;

                        // Create the chart
                        JFreeChart chart = createChart(createDataset());
                        ChartPanel chartPanel = new ChartPanel(chart);
                        chartPanel.setPreferredSize(new Dimension(500, 270));
                        setContentPane(chartPanel);
                    }

                    private DefaultCategoryDataset createDataset() {
                        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
                        for (Map.Entry<String, Integer> entry : data.entrySet()) {
                            dataset.addValue(entry.getValue(), "Flights", entry.getKey());
                        }
                        return dataset;
                    }

                    private JFreeChart createChart(DefaultCategoryDataset dataset) {
                        JFreeChart chart = ChartFactory.createBarChart(
                                "Flights from Base",
                                "City of Departure",
                                "Number of Flights",
                                dataset,
                                PlotOrientation.VERTICAL,
                                false,
                                true,
                                false);
                        CategoryPlot plot = chart.getCategoryPlot();
                        CategoryAxis axis = plot.getDomainAxis();
                        axis.setCategoryLabelPositions(CategoryLabelPositions.createUpRotationLabelPositions(Math.PI / 2.0));
                        return chart;
                    }
                }
            }
        }
    }
}

