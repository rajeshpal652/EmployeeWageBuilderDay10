package com.bl.empwagebuilder_day10;
/*
 * @Author: Rajesh Pal
 *Managing employee wage using interface approach.
 */
public interface EmpWageCalculation {
	public void addCompanyEmpWage(String company, int empRatePerHr, int noOfWorkingDays, int maxHrsPerMonth);
    public void computeEmpWage();
    public int computeEmpWage(CompanyEmpWage companyEmpWage);
}
