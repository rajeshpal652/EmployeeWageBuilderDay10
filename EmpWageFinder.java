package com.bl.empwagebuilder_day10;
/*
 * @Author: Rajesh Pal
 *Storing the daily wage along with the total wage.
 */
import java.util.Scanner;

public class EmpWageFinder {
	public static void main(String[] args) throws Exception {
        System.out.println("Welcome to Employee Wedge Builder...");
        System.out.println("************************************\n");
        int num;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter No. of Companies");
        num = scanner.nextInt();
        EmpWageCalculation empWageBuilder = new EmpWageBuilderArray();
        for (int i = 0; i < num; i++) {
            System.out.println(
                    "Enter Company Details as given:\n CompanyName EmployeeRatePerHr NoOfWorkingDays MaxHrsPerMonth");
            empWageBuilder.addCompanyEmpWage(scanner.next(), scanner.nextInt(), scanner.nextInt(), scanner.nextInt());
        }
        System.out.println("");
        empWageBuilder.computeEmpWage();

    }
}
