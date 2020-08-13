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
import java.net.ServerSocket;
import java.net.Socket;

/**
 *
 * @author RITIK
 */
public class SocServer {
    public static void main(String[] args) throws Exception{
        
           System.out.println("Server is started");
        ServerSocket ss=new ServerSocket(9799);
        System.out.println("Server is waiting for client request");
        Socket s = ss.accept();
        
        System.out.println("Client connected");
      
        BufferedReader br= new BufferedReader(new InputStreamReader(s.getInputStream()));
                String str = br.readLine();
                System.out.println("Client Data :" +str);
                String nickName = str.substring(0,3);
                
                OutputStreamWriter os = new OutputStreamWriter(s.getOutputStream());
                PrintWriter out = new PrintWriter(os);
                out.println(nickName);
                out.flush();
                System.out.println("S : dta sent from Server to Client");
    }
    
}
