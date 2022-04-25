package com.bl.empwagebuilder_day10;
/*
 * @Author: Rajesh Pal
 *Storing the daily wage along with the total wage.
 */
public interface EmpWageCalculation {
	public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
