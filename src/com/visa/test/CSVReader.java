package com.visa.test;


import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import com.visa.dao.AirportsBean;

public class CSVReader {

    public static void main(String[] args) {

        getProducerMsg();

    }

	/**
	 * 
	 */
	public static ArrayList<String> getProducerMsg() {
		String csvFile = "D:\\poc\\data\\2008\\2008.csv";
        BufferedReader br = null;
        String line = "";
        String cvsSplitBy = ",";
        ArrayList<String> list = new ArrayList<String>();

        try {

        	
            br = new BufferedReader(new FileReader(csvFile));
            while ((line = br.readLine()) != null) {

            /*	AirportsBean airportsBean = new AirportsBean();
            	airportsBean = airportsBean.getInstanceAirportsBean(line);
            	
            	System.out.println(airportsBean.toString());*/
            	
            	list.add(line);
            	
                // use comma as separator
              /*  String[] country = line.split(cvsSplitBy);

                System.out.println("iata\t"+country[0]+"airport\t"+country[1]+"city\t"+country[2]+"state\t"+country[3]+"country\t"+country[4]+"lat\t"+country[5]+"long\t"+country[6]);
*/
                //System.out.println("Country [code= " + country[4] + " , name=" + country[5] + "]");

            
            }
            
            return list;

        } catch (FileNotFoundException e) {
            e.printStackTrace();
            return list;
        } catch (IOException e) {
            e.printStackTrace();
            return list;
        } finally {
            if (br != null) {
                try {
                    br.close();
                } catch (IOException e) {
                    e.printStackTrace();
                    return list;
                }
            }
        }
	}

}