
package bloodbank;

import java.awt.Color;
import java.awt.GradientPaint;
import java.time.LocalDate;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import org.jfree.chart.ChartFactory;
import org.jfree.chart.ChartFrame;
import org.jfree.chart.JFreeChart;
import org.jfree.chart.axis.NumberAxis;
import org.jfree.chart.plot.CategoryPlot;
import org.jfree.chart.plot.PlotOrientation;
import org.jfree.chart.renderer.category.BarRenderer;
import org.jfree.data.category.DefaultCategoryDataset;

public class Graph {

    private LinkedList AccABPos;
    private LinkedList AccABNeg; 
    private LinkedList AccAPos;
    private LinkedList AccANeg; 
    private LinkedList AccBPos;
    private LinkedList AccBNeg;
    private LinkedList AccOPos;
    private LinkedList AccONeg;

    private LinkedList RejABPos;
    private LinkedList RejABNeg;
    private LinkedList RejAPos;
    private LinkedList RejANeg;
    private LinkedList RejBPos;
    private LinkedList RejBNeg;
    private LinkedList RejOPos;
    private LinkedList RejONeg;
    
    private String bloodType;
    private LocalDate from;
    private LocalDate to;
    private String period;
    
    
    public Graph(Controller control){
        
        dataInit(control);
    }
    
    public void setBloodType(String bloodType){
        this.bloodType = bloodType;
    }
    
    public void setDates(LocalDate from, LocalDate to){
        this.from = from;
        this.to = to;
    }
    
    private void dataInit(Controller control){
        
        AccABPos = new LinkedList();
        AccABNeg = new LinkedList();
        AccAPos = new LinkedList();
        AccANeg = new LinkedList();
        AccBPos = new LinkedList();
        AccBNeg = new LinkedList();
        AccOPos = new LinkedList();
        AccONeg = new LinkedList();

        RejABPos = new LinkedList();
        RejABNeg = new LinkedList();
        RejAPos = new LinkedList();
        RejANeg = new LinkedList();
        RejBPos = new LinkedList();
        RejBNeg = new LinkedList();
        RejOPos = new LinkedList();
        RejONeg = new LinkedList();
        
        for (Donation accdonation : control.getAccDonations()) {
            int b = accdonation.getD().getBloodType();

            switch (b) {
                //case 0:
                //   continue;
                case 1:
                    AccABPos.add(accdonation);
                    break;
                case 2:
                    AccABNeg.add(accdonation);
                    break;
                case 3:
                    AccAPos.add(accdonation);
                    break;
                case 4:
                    AccANeg.add(accdonation);
                    break;
                case 5:
                    AccBPos.add(accdonation);
                    break;
                case 6:
                    AccBNeg.add(accdonation);
                    break;
                case 7:
                    AccOPos.add(accdonation);
                    break;
                case 8:
                    AccONeg.add(accdonation);
                    break;

            }
        }
          for (Donation rejdonation : control.getRejDonations()) {
            int b1 = rejdonation.getD().getBloodType();
            switch (b1) {
                //  case 0:
                //     continue;
                case 1:
                    RejABPos.add(rejdonation);
                    break;
                case 2:
                    RejABNeg.add(rejdonation);
                    break;
                case 3:
                    RejAPos.add(rejdonation);
                    break;
                case 4:
                    RejANeg.add(rejdonation);
                    break;
                case 5:
                    RejBPos.add(rejdonation);
                    break;
                case 6:
                    RejBNeg.add(rejdonation);
                    break;
                case 7:
                    RejOPos.add(rejdonation);
                    break;
                case 8:
                    RejONeg.add(rejdonation);
                    break;

            }
        }
       
    }
    
    public void drawGraph1() {

        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        
        dataset.addValue(AccABPos.size(), "Accepted", "AB+");
        dataset.addValue(AccABNeg.size(), "Accepted", "AB-");
        dataset.addValue(AccAPos.size(), "Accepted", "A+");
        dataset.addValue(AccANeg.size(), "Accepted", "A-");
        dataset.addValue(AccBPos.size(), "Accepted", "B+");
        dataset.addValue(AccBNeg.size(), "Accepted", "B-");
        dataset.addValue(AccOPos.size(), "Accepted", "0+");
        dataset.addValue(AccONeg.size(), "Accepted", "0-");

        dataset.addValue(RejABPos.size(), "Rejected", "AB+");
        dataset.addValue(RejABNeg.size(), "Rejected", "AB-");
        dataset.addValue(RejAPos.size(), "Rejected", "A+");
        dataset.addValue(RejANeg.size(), "Rejected", "A-");
        dataset.addValue(RejBPos.size(), "Rejected", "B+");
        dataset.addValue(RejBNeg.size(), "Rejected", "B-");
        dataset.addValue(RejOPos.size(), "Rejected", "0+");
        dataset.addValue(RejONeg.size(), "Rejected", "0-");

        chartConstruct("Quantity vs Blood Type", "Blood Type", "Number of Blood Bags", dataset, true);
    }
    
    public void drawGraph2(){
        
        int[] accQuantity = null;
        int[] rejQuantity = null;
        int size = -1;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        size = calcSize();
        if(size != -1){
            accQuantity = new int[size];
            rejQuantity = new int[size];
            
            for (int i = 0 ; i < size ; i++){
                accQuantity[i] = 0;
                rejQuantity[i] = 0;
            }
            
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            for (int i = 0 ; i < accQuantity.length ; i++){
                if (period.equals("Year"))
                    dataset.addValue(accQuantity[i]+rejQuantity[i], "Quantity", from.getYear()+i+"");
                else if (period.equals("Month"))
                    dataset.addValue(accQuantity[i]+rejQuantity[i], "Quantity", from.getMonthValue()+i+"");
                else
                    dataset.addValue(accQuantity[i]+rejQuantity[i], "Quantity", from.getDayOfMonth()+i+"");

            }
            chartConstruct(bloodType + " Quantity vs. " + period, period, "Quantity", dataset, false);
        }

    }
    
    public void drawGraph3(){
        
        int[] accQuantity = null;
        int[] rejQuantity = null;
        int size;
        DefaultCategoryDataset dataset = new DefaultCategoryDataset();
        size = calcSize();
        if (size!=-1){
            
            accQuantity = new int[size];
            rejQuantity = new int[size];
            
            for (int i = 0 ; i < size ; i++){
                accQuantity[i] = 0;
                rejQuantity[i] = 0;
            }
            
            this.bloodType = "AB+";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "AB-";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "A+";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "A-";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "A-";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "B+";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "B-";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "O+";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
            this.bloodType = "O-";
            calculateQuantity("accepted",accQuantity);
            calculateQuantity("rejected",rejQuantity);
            
             for (int i = 0 ; i < accQuantity.length ; i++){
                if (period.equals("Year")){
                    dataset.addValue(accQuantity[i], "Accepted", from.getYear()+i+"");
                    dataset.addValue(rejQuantity[i], "Rejected", from.getYear()+i+"");
                }
                else if (period.equals("Month")){
                    dataset.addValue(accQuantity[i], "Accepted", from.getMonthValue()+i+"");
                    dataset.addValue(rejQuantity[i], "Rejected", from.getMonthValue()+i+"");
                }
                else{
                    dataset.addValue(accQuantity[i], "Accepted", from.getDayOfMonth()+i+"");
                    dataset.addValue(rejQuantity[i], "Rejected", from.getDayOfMonth()+i+"");
                }

            }
            chartConstruct(" Accepted/Rejected vs. " + period, period, "Quantity", dataset, true);
            
        }
        
    }
    
    private int calcSize(){
        
        int size = -1;
        if (from.getYear() == to.getYear()){
            if (from.getMonth() == to.getMonth()){
                if (from.getDayOfMonth() > to.getDayOfMonth()){
                    JOptionPane.showMessageDialog(null, "Wrong period, please re-enter the period again.");
                }
                else{
                    period = "Day";
                    size = to.getDayOfMonth() - from.getDayOfMonth() + 1;
                }
            }
            else if(from.getMonthValue() > to.getMonthValue()){
                JOptionPane.showMessageDialog(null, "Wrong period, please re-enter the period again.");
                
            }
            else {
                period = "Month";
                size = to.getMonthValue() - from.getMonthValue() + 1;
            }
        }
        else if (from.getYear() > to.getYear()){
            JOptionPane.showMessageDialog(null, "Wrong period, please re-enter the period again.");
        }
        else {
            period = "Year"; 
            size = to.getYear() - from.getYear() + 1;
            
        }
        return size;
        
    }
    
    private void chartConstruct(String title, String xAxis, String yAxis,DefaultCategoryDataset dataset,boolean dble){

        JFreeChart chart = ChartFactory.createBarChart(title, xAxis, yAxis, dataset);
        CategoryPlot p = chart.getCategoryPlot();
        p.setOrientation(PlotOrientation.VERTICAL);
        p.setBackgroundPaint(Color.WHITE);
        p.setDomainGridlinePaint(Color.white);
        p.setRangeGridlinePaint(Color.white);
        NumberAxis rangeAxis = (NumberAxis) p.getRangeAxis();
        rangeAxis.setStandardTickUnits(NumberAxis.createIntegerTickUnits());
        BarRenderer renderer = (BarRenderer) p.getRenderer();
        renderer.setDrawBarOutline(false);
        
        if (dble){
            GradientPaint gp0 = new GradientPaint(0.0f, 0.0f, Color.RED, 0.0f, 0.0f, Color.RED);
            GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.GREEN, 0.0f, 0.0f, Color.GREEN);
            renderer.setSeriesPaint(0, gp1);
            renderer.setSeriesPaint(1, gp0);
        }
        else{
            GradientPaint gp1 = new GradientPaint(0.0f, 0.0f, Color.BLUE, 0.0f, 0.0f, Color.BLUE);
            renderer.setSeriesPaint(0, gp1);
        }
           
        ChartFrame frame = new ChartFrame(title, chart);
        frame.setSize(500, 270);
        frame.setLocation(685, 170);
        frame.setVisible(true);
        
    }
    
    private void calculateQuantity (String accOrRej, int[] quantity){
        
        LinkedList<Donation> acc = null;
        
        switch (this.bloodType) {
            case "AB+":
                if (accOrRej.equals("accepted"))
                    acc = this.AccABPos;
                else
                    acc = this.RejABPos;
                break;
            case "AB-":
                if (accOrRej.equals("accepted"))
                    acc = this.AccABNeg;
                else
                    acc = this.RejABNeg;
                break;
            case "A+":
                if (accOrRej.equals("accepted"))
                    acc = this.AccAPos;
                else
                    acc = this.RejAPos;
                break;
            case "A-":
                if (accOrRej.equals("accepted"))
                    acc = this.AccANeg;
                else
                    acc = this.RejANeg;
                break;
            case "B+":
                if (accOrRej.equals("accepted"))
                    acc = this.AccBPos;
                else
                    acc = this.RejBPos;
                break;
            case "B-":
                if (accOrRej.equals("accepted"))
                    acc = this.AccBNeg;
                else
                    acc = this.RejBNeg;
                break;
            case "O+":
                if (accOrRej.equals("accepted"))
                    acc = this.AccOPos;
                else
                    acc = this.RejOPos;
                break;
            case "O-":
                if (accOrRej.equals("accepted"))
                    acc = this.AccONeg;
                else
                    acc = this.RejONeg;
                break;
            default:
                break;
        }
        
        
        switch (period) {
            case "Year":
                for (int i = 0 ; i < acc.size() ; i++){
                    for (int j = 0 ; j < quantity.length ; j++){
                        if (j == 0){
                            if (acc.get(i).getDate().isEqual(from) ||(acc.get(i).getDate().isAfter(from) && acc.get(i).getDate().isBefore(LocalDate.of(from.getYear(), 12, 31))) || acc.get(i).getDate().isEqual(LocalDate.of(from.getYear()+j, 12, 31)))
                                quantity[j]++;
                        }
                        else if (j == quantity.length -1){
                            if (acc.get(i).getDate().isEqual(LocalDate.of(to.getYear(), 1, 1)) || (acc.get(i).getDate().isAfter(LocalDate.of(to.getYear(), 1, 1)) && acc.get(i).getDate().isBefore(to)) || acc.get(i).getDate().isEqual(to))
                                quantity[j]++;
                        }
                        else{
                            if (acc.get(i).getDate().isEqual(LocalDate.of(from.getYear()+j, 1, 1)) || (acc.get(i).getDate().isAfter(LocalDate.of(from.getYear()+j, 1, 1)) && acc.get(i).getDate().isBefore(LocalDate.of(from.getYear()+j, 12, 31))) || acc.get(i).getDate().isEqual(LocalDate.of(from.getYear()+j, 12, 31)))
                                quantity[j]++;
                            
                        }
                        
                        
                    }
                    
                }   break;
        
            case "Month":
                for (int i = 0 ; i < acc.size() ; i++){
                    for (int j = 0 ; j < quantity.length ; j++){
                        if (j == 0){
                            if (acc.get(i).getDate().isEqual(from) || (acc.get(i).getDate().isAfter(from) && acc.get(i).getDate().isBefore(LocalDate.of(from.getYear(), from.getMonthValue(), from.lengthOfMonth()))) ||  acc.get(i).getDate().isEqual(LocalDate.of(from.getYear(), from.getMonthValue(), from.lengthOfMonth())))
                                quantity[j]++;
                        }
                        else if (j == quantity.length -1){
                            if (acc.get(i).getDate().isEqual(LocalDate.of(to.getYear(), to.getMonthValue(), 1)) || (acc.get(i).getDate().isAfter(LocalDate.of(to.getYear(), to.getMonthValue(), 1)) && acc.get(i).getDate().isBefore(to)) || acc.get(i).getDate().isEqual(to))
                                quantity[j]++;
                        }
                        else{
                            if (acc.get(i).getDate().isEqual(LocalDate.of(from.getYear(), from.getMonthValue()+1 , 1)) || (acc.get(i).getDate().isAfter(LocalDate.of(from.getYear(), from.getMonthValue()+j, 1)) && acc.get(i).getDate().isBefore(LocalDate.of(from.getYear(), from.getMonthValue()+j,LocalDate.of(1900, from.getDayOfMonth()+j, 20).lengthOfMonth() ))) || acc.get(i).getDate().isEqual(LocalDate.of(from.getYear(), from.getMonthValue()+j,LocalDate.of(1900, from.getDayOfMonth()+j, 20).lengthOfMonth() )))
                                quantity[j]++;
                            
                        }
                    }
                    
                }   break;
            default:
                for (int i = 0 ; i < acc.size() ; i++){
                    for (int j = 0 ; j < quantity.length ; j++){
                        if (acc.get(i).getDate().isEqual(LocalDate.of(from.getYear(),from.getMonthValue(),from.getDayOfMonth()+j)))
                            quantity[j]++;
                        
                    }
                    
                }   break;
        }
    }
    
}
