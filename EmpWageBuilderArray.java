package com.bl.empwagebuilder_day10;

import java.util.ArrayList;
import java.util.List;

/*
 * @Author: Rajesh Pal
 *Storing the daily wage along with the total wage.
 */
public class EmpWageBuilderArray implements EmpWageCalculation {
	
	public static final int IS_PART_TIME = 1;
    public static final int IS_FULL_TIME = 2;
    private List<CompanyEmpWage> companyEmpWageList;
    
    public EmpWageBuilderArray() {
        companyEmpWageList = new ArrayList<>();
    }
    
    /*
     * addCompanyEmpWage method is used to add company details in companyEmpWageArray
     */
	    
    public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth) {
        CompanyEmpWage companyEmpWage = new CompanyEmpWage(company, empRatePerHr, noOfWorkingDays, maxHrsPerMonth);
        companyEmpWageList.add(companyEmpWage);
    }

    public void computeEmpWage() {

        for (int i = 0; i < companyEmpWageList.size(); i++) {
            CompanyEmpWage companyEmpWage = companyEmpWageList.get(i);
            companyEmpWage.setTotalEmpWage(this.computeEmpWage(companyEmpWage));
            System.out.println("");
            companyEmpWage.printDailyWage();
            System.out.println("");
            System.out.println(companyEmpWage);
        }
    }

    public int computeEmpWage(CompanyEmpWage companyEmpWage) {
        int empHrs = 0;
        int totalWorkingDays = 0;
        int totalEmpHrs = 0;
        companyEmpWage.dailyWage = new int[companyEmpWage.noOfWorkingDays];
        // Computation
        System.out.println("Calculating Wage for Company: " + companyEmpWage.company);
        while (totalEmpHrs <= companyEmpWage.maxHrsPerMonth && totalWorkingDays < companyEmpWage.noOfWorkingDays) {
            totalWorkingDays++;
            int empCheck = (int) Math.floor(Math.random() * 10) % 3;
            // Case Checking
            switch (empCheck) {
                case IS_PART_TIME:
                    empHrs = 4;
                    break;
                case IS_FULL_TIME:
                    empHrs = 8;
                    break;
                default:
                    empHrs = 0;
                    break;
            }
            totalEmpHrs += empHrs;
            companyEmpWage.dailyWage[totalWorkingDays - 1] = empHrs * companyEmpWage.empRatePerHr;
            System.out.println("Day: " + totalWorkingDays + "\tEmp Hr: " + empHrs);
        }
        return totalEmpHrs * companyEmpWage.empRatePerHr;
    }
}
	
