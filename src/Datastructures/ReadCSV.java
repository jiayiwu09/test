package Datastructures;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ReadCSV {
    public static void main(String[] args){
        List<String[]> data = new ArrayList<String[]>();
        String filename = "account.csv";
        String dataRow;

        try(BufferedReader br = new BufferedReader(new FileReader(filename))) {
            //read data
            while (( dataRow=br.readLine()) != null){
                //parse the data by commas
                String[] line = dataRow.split(",");
                //Add the data to collection
                data.add(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
        for(String[] account: data){
            System.out.print("[");
            for (String field :account){
                System.out.print(field + " ");
            }
            System.out.println("]");
        }
    }
}

