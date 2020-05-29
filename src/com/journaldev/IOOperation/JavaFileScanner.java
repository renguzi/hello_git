package com.journaldev.IOOperation;

import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 * @Author: Asher Huang
 * @Date: 2020-03-23
 * @Description: com.journaldev.IOOperation
 * @Version:1.0
 */
public class JavaFileScanner {
    public static void main(String[] args) throws IOException {
        String fileName = "/Users/asher/imooc/imooc1.txt";
        Path path = Paths.get(fileName);
        Scanner scanner = new Scanner(path);

//        read file line by line
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            System.out.println("Lines: " + scanner.next());
        }
        scanner.close();

        scanner = new Scanner(Paths.get("/Users/asher/imooc/imooc1.csv"));
        scanner.useDelimiter(System.getProperty("line.separator"));
        while (scanner.hasNext()) {
            Employee employee = parseCSVLine(scanner.next());
            System.out.println(employee.toString());
        }
        scanner.close();

        System.out.println("Read from system input:");
        scanner = new Scanner(System.in);
        System.out.println("Input first word:" + scanner.next());

    }

    private static Employee parseCSVLine(String line) {
        Scanner scanner = new Scanner(line);
        scanner.useDelimiter("\\s*,\\s*");
        String name = scanner.next();
        int age = scanner.nextInt();
        String gender = scanner.next();
        JavaFileScanner javaFileScanner = new JavaFileScanner();
        return javaFileScanner.new Employee(name, age, gender);
//        return new JavaFileScanner.Employee(name,age,gender)

    }

    public class Employee{
        private String name;
        private int age;
        private String gender;

        public Employee(String name, int age, String gender) {
            this.name = name;
            this.age = age;
            this.gender = gender;
        }

        @Override
        public String toString() {
            return "Employee{" +
                    "name='" + name + '\'' +
                    ", age=" + age +
                    ", gender='" + gender + '\'' +
                    '}';
        }
    }
}
