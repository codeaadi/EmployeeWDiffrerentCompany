package com.bridgelabz.day3.employeewagecalculator;
import java.util.Random;
public class UC_10_MultipleCompany {


    public class CompanyEmpWage {

        public static final int FULL_TIME = 1;
        public static final int PART_TIME = 2;
        int WageperHr;
        int NoOfWorkingDays;
        int TotalHrsinMonth;
        int WorkingHr;
        int TotalEmpWage;
        int TotalEmpHrs;
        int TotalWorkingDays;
        String company;
        int NoOfCompanies;
        int index;
        CompanyEmpWage[] companies;

        public CompanyEmpWage(String company, int WageperHr, int NoOfWorkingDays, int TotalHrsinMonth) {

            this.WageperHr = WageperHr;
            this.NoOfWorkingDays = NoOfWorkingDays;
            this.TotalHrsinMonth = TotalHrsinMonth;
            this.company = company;
            companies = new CompanyEmpWage[NoOfCompanies];
            index = 0;
        }

        void addCompany(String company, int WageperHr, int NoOfWorkingDays, int TotalHrsinMonth) {
            companies[index++] = new CompanyEmpWage(company, WageperHr, NoOfWorkingDays, TotalHrsinMonth);
        }

        void CompaniesTotalWage() {

            Random random = new Random();
            for(int day=1; day<=NoOfWorkingDays; day++) {

                int EmployeeCheck = random.nextInt(3);
                switch(EmployeeCheck) {
                    case FULL_TIME:
                        WorkingHr = 8;
                        break;

                    case PART_TIME :
                        WorkingHr = 4;
                        break;

                    default :
                        WorkingHr = 0;
                }
                TotalEmpWage = WorkingHr*WageperHr;
                TotalEmpHrs += WorkingHr;
            }
            System.out.println("\nEmployee's Wage Computation for "+company+" :\n");
            System.out.println("Employee's Working Hours for Month : "+TotalEmpHrs);
            TotalEmpWage = TotalEmpHrs * WageperHr;
            System.out.println("Employee's Wages for Month : "+TotalEmpWage);
        }
}
}
