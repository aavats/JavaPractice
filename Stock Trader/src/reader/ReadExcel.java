package reader;

//package com.core.testscripts;

import java.io.File;
import java.io.IOException;

import jxl.Cell;
import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class ReadExcel 
{

    private String inputFile;

    public void setInputFile(String inputFile) 
    {
        this.inputFile = inputFile;
    }

    public void read() throws IOException  
    {
        File inputWorkbook = new File(inputFile);
        Workbook w;
        try 
        {
            w = Workbook.getWorkbook(inputWorkbook);
            // Get the first sheet
            Sheet sheet = w.getSheet(0);
            // Loop over first 10 column and lines

            for (int j = 0; j < sheet.getColumns(); j++) 
            {
                for (int i = 0; i < sheet.getRows(); i++) 
                {
                    Cell cell = sheet.getCell(j, i);
                    System.out.println(cell.getContents());
                }
            }
        } 
        catch (BiffException e) 
        {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) throws IOException {
        ReadExcel axis = new ReadExcel();
        axis.setInputFile("E:/Stocks Data/AXISBANK.csv");
        axis.read();
        ReadExcel bajaj = new ReadExcel();
        bajaj.setInputFile("E:/Stocks Data/BAJFINANCE.csv");
        bajaj.read();
        ReadExcel rel = new ReadExcel();
        rel.setInputFile("E:/Stocks Data/RELIANCE.csv");
        rel.read();
        ReadExcel sun = new ReadExcel();
        sun.setInputFile("E:/Stocks Data/SUNPHARMA.csv");
        sun.read();
        ReadExcel titan = new ReadExcel();
        titan.setInputFile("E:/Stocks Data/TITAN.csv");
        titan.read();
        public ReadExcel() /
        {
        ReadExcel=new findprofit(); 
        }
        
    }

}