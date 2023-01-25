package com.bridgelabz.day3.employeewagecalculator;
import java.util.Random;
public class UC_9_EmployeeWageBuilder {
    public class EmployeeWagesBuilder {

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

        public EmployeeWagesBuilder(int WageperHr, int NoOfWorkingDays, int TotalHrsinMonth, String company) {

            this.WageperHr = WageperHr;
            this.NoOfWorkingDays = NoOfWorkingDays;
            this.TotalHrsinMonth = TotalHrsinMonth;
            this.company = company;
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
            System.out.println("\nEmployee's Wage Computation in "+company+" :\n");
            System.out.println("Employee's Working Hours for Month : "+TotalEmpHrs);
            TotalEmpWage = TotalEmpHrs * WageperHr;
            System.out.println("Employee's Wages for Month : "+TotalEmpWage);
        }

        public void main(String[] args) {

            EmployeeWagesBuilder company1 = new EmployeeWagesBuilder(20, 25, 100, "Google");
            company1.CompaniesTotalWage();
            EmployeeWagesBuilder company2 = new EmployeeWagesBuilder(25, 20, 150, "Amazon");
            company2.CompaniesTotalWage();
            EmployeeWagesBuilder company3 = new EmployeeWagesBuilder(30, 30, 200, "Tata");
            company3.CompaniesTotalWage();
        }
}}
