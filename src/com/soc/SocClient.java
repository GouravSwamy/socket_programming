/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.soc;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.net.Socket;

/**
 *
 * @author RITIK
 */
public class SocClient {
    public static void main(String[] args) throws Exception{
        
          // TODO code application logic here
        String ip="localhost";
        int port =9799; //0-1023 to 65535
        Socket s = new Socket(ip,port);
        
        String str ="Gourav Swamy this socket programming";
        
        OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
        PrintWriter out = new PrintWriter(os);
        out.println(str);
        os.flush();
        
         BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
         String nickName = br.readLine();
         System.out.println("C: Data from server "+nickName);
        
    }
}
