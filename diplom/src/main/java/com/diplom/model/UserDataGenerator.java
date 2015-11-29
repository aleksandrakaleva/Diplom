package com.diplom.model;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class UserDataGenerator {

  
	public static void main(String[] args) throws IOException {
		 if (args.length < 3) {
			  System.out.println("please specify parametrs: <amount of test data> <file> <format>");
			  return;
		  }
		  
		  int amount = Integer.parseInt(args[0]);
		  File file = new File(args[1]);
		  String format = args[2];
		  
		  if(file.exists()) {
			  System.out.println("File exists, please remote it manually: " + file);
			  return;
		  }

	
		  List<User> user = generateRandomUser(amount);
		  if ("csv".equals(format)) {
			  saveUserToCsvFile(user, file);
		  }	else { System.out.println("Unknown format " + format);
		  return;
		  }
	 }


	private static void saveUserToCsvFile(List<User> users, File file) throws IOException {
		FileWriter writer = new FileWriter(file);
		for (User user : users) {
			writer.write(user.getEmail() + "," + user.getName() + "," + user.getPassword() + ",!" + "\n");
		}
		writer.close();
	}

	public static List<User> LoadUserFromCsvFile(File file) throws IOException {
		List<User> list = new ArrayList<User>();
		FileReader reader = new FileReader(file); 
		BufferedReader bufferedReader = new BufferedReader(reader);
		String line = bufferedReader.readLine();
		while (line !=null) {
			String[] part = line.split(",");
			User user = new User()
					.setEmail(part[0])
					.setName(part[1])
					.setPassword(part[2]);
			list.add(user);
			line = bufferedReader.readLine();
		}
		bufferedReader.close();
		return list; 
   
	} 


	public static List<User> generateRandomUser(int amount) {
		List<User> list = new ArrayList<User>();
		for (int i = 0; i < amount; i++) {
			User user	= new User()
					.setEmail("")
					.setName("")
					.setPassword("");
			list.add(user);
		}
		return list; 
	}

	public static String generateRandomString() {
		Random rnd = new Random();
		if (rnd.nextInt(3) == 0) {
			return "";	
		} else {
			return "test" + rnd.nextInt(); 	
		}
	}

}
