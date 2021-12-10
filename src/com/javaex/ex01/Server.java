package com.javaex.ex01;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

	public static void main(String[] args) throws IOException {
			
		ServerSocket serverSocket= new ServerSocket();
		serverSocket.bind(new InetSocketAddress("192.168.0.60", 10001));
		
		System.out.println("<서버 시작>");
		System.out.println("====================================");
		System.out.println("[연결을 기다리고있습니다.]");
		
		Socket socket = serverSocket.accept();
		
		System.out.println("[클라이언트가 연결되었습니다]");
		
		InputStream is = socket.getInputStream();
		InputStreamReader isr = new InputStreamReader(is, "UTF-8");
		BufferedReader br = new BufferedReader(isr);
		
		OutputStream os = socket.getOutputStream();
		OutputStreamWriter isw = new OutputStreamWriter(os, "UTF-8");
		BufferedWriter bw = new BufferedWriter(isw);
		
		String msg = br.readLine();
		System.out.println("받은 메세지: "+msg);
		
		bw.write(msg);
		bw.newLine();
		bw.flush();
		
		socket.close();
		serverSocket.close();
	
	}



}
