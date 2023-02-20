package com.hillel.homeTask15;
import java.io.*;

public class UserData {
    private String name;
    private String email;
    private String age;

    public UserData(String name, String email, String age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }
    public String getName() {
        return name;
    }
    public String getEmail() {
        return email;
    }
    public String getAge() {
        return age;
    }
    @Override
    public String toString() {
        return
                "name: " + name + '\n' +
                "email: " + email + '\n' +
                "age: " + age;
    }

    public static void main(String[] args) throws IOException {
        UserData userData2 = new UserData("Bob", "test@d.com","30");
        serialize(userData2);
        File source = new File("src/main/java/com/hillel/homeTask15/directory/file1.txt");
        File destination = new File("src/main/java/com/hillel/homeTask15/directory/file2.txt");
        deserialize(source, destination);
    }

    private static void deserialize(File source, File destination) throws IOException {
        BufferedReader fileReader = new BufferedReader(new FileReader(source));
        BufferedWriter fileWriter = new BufferedWriter(new FileWriter(destination));
        while (fileReader.ready()){
         String line = fileReader.readLine();
         System.out.println(line);
         fileWriter.write(line);
         fileWriter.newLine();
         fileWriter.flush();
        }
    }

    private static void serialize(UserData userData) throws IOException {
        File directory = new File("src/main/java/com/hillel/homeTask15/directory");
        if(!directory.exists()){
            directory.mkdir();
        }
        File file1 = new File(directory, "file1.txt");
        if(!file1.exists()){
            file1.createNewFile();
        }
        Writer writer1 = new FileWriter(file1);
            if  (userData.getName() != null) {
                writer1.write("name: " + userData.getName() + "\n");
            } if (userData.getEmail() != null) {
                writer1.write("email: " + userData.getEmail() + "\n");
            } if (userData.getAge() != null) {
                writer1.write("age: " + userData.getAge() + "\n");
            }
            writer1.close();
    }
}
