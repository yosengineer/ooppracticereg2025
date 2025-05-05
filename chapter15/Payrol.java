package chapter15;

import chapter13.Intern;

import java.io.*;
import java.util.StringTokenizer;

public class Payrol {
    public static void calculatePayRol(
            String prevEmpFile,     // Employee_May.dat
            String currHoursFile,   // Hours_June.dat
            String nextEmpFile      // Employee_June.dat
    ) {
        try(
                BufferedReader prevBr = new BufferedReader(new FileReader(prevEmpFile));
                BufferedReader currBr = new BufferedReader(new FileReader(currHoursFile));
                BufferedWriter nextBw = new BufferedWriter(new FileWriter(nextEmpFile))
                ) {
            String hours = currBr.readLine();
            StringTokenizer stHours = new StringTokenizer(hours);

            String emp = prevBr.readLine();
            while (emp != null) {
                StringTokenizer stEmp = new StringTokenizer(emp, ",");
                while (stEmp.hasMoreTokens()) {
                    String name = stEmp.nextToken().trim();
                    String ssn = stEmp.nextToken().trim();
                    int rate = Integer.parseInt(stEmp.nextToken().trim());
                    int salaryToDate = Integer.parseInt(stEmp.nextToken().trim());
                    int hoursWorked = Integer.parseInt(stHours.nextToken());

                    salaryToDate += hoursWorked * rate;

                    nextBw.write(name + ", " + ssn + ", " + rate + ", " + salaryToDate);
                    nextBw.newLine();
                }
                emp = prevBr.readLine();
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found!");
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }


    public static void main(String[] args) {
        calculatePayRol(
                "/Users/yosephabate/Employee_May.dat",
                "/Users/yosephabate/Hours_June.dat",
                "/Users/yosephabate/Employee_June.dat"
        );
    }
}
