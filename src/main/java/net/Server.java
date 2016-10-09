package net;

import java.awt.HeadlessException;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.net.UnknownHostException;

public class Server implements Runnable{
	static private Socket connection; //соединение новое
	static private ObjectOutputStream output;
	static private ObjectInputStream input;	
	static private ServerSocket server;
	
	
	public void run() {
		System.out.print("1");
		try {
			server=new ServerSocket(5678,10);
			while (true){
				connection = server.accept();
				output = new ObjectOutputStream(connection.getOutputStream());
				input = new ObjectInputStream(connection.getInputStream());
				output.writeObject("вы прислали :"+(String)input.readObject());
			}
		}catch (UnknownHostException e) {
		}catch (IOException e) {
		} catch (HeadlessException e) {
		} catch (ClassNotFoundException e) {}
	}

}
