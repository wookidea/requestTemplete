package com.company;

import com.sun.deploy.net.HttpRequest;

import java.io.*;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class Main {

    public static void main(String[] args) throws IOException, InterruptedException {


        // write your code here

        File file = new File("C:\\Users\\Sangwook\\Desktop\\test1.txt");

        FileReader fr = new FileReader(file);

        BufferedReader bufReader = new BufferedReader(fr);
        String line = "";
        while ((line = bufReader.readLine()) != null) {

            String finalLine = line;

            System.out.println(finalLine);
            URL url = new URL(finalLine);
            HttpURLConnection con = null;
            con = (HttpURLConnection) url.openConnection();
            con.setRequestMethod("GET");
            con.setConnectTimeout(3000);
//                        con.setReadTimeout(10000);
            int responseCode = con.getResponseCode();
            con.disconnect();

            Thread.sleep(5000);
        }
        fr.close();
    }
}
