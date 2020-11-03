public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
	}
}
//Check Employee is Present or absent
public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
		// Constants
		int IS_FULL_TIME = 1;
		// Computation
		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME){
			System.out.println("Employee is Present");
			}
		else{
			System.out.println("Employee is Absent");
		     }
}
}

//Calculate Employee DailyWage
public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
		int IS_FULL_TIME = 1;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 2;
		if (empCheck == IS_FULL_TIME){
		empHrs = 8;
		}
	   	else{
		empHrs = 0;
		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
		}
   }
}

//Part Time
public class EmpWageComputation {
	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation.");
		int IS_PART_TIME = 1;
		int IS_FULL_TIME = 2;
		int EMP_RATE_PER_HOUR = 20;

		int empHrs = 0;
		int empWage = 0;

		double empCheck = Math.floor(Math.random() * 10) % 3;

		if (empCheck == IS_PART_TIME){
			empHrs = 4;
		else if (empCheck == IS_FULL_TIME) {
			empHrs = 8;
			}
			}
		else{
			empHrs = 0;
			empWage = empHrs * EMP_RATE_PER_HOUR;
			System.out.println("Emp Wage: " +empWage);
		}
   }
}

//Switch Case
public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee wage Computation.");

		int empHrs = 0;
		int empWage = 0;

		int empCheck = (int) Math.floor(Math.random() * 10) % 3;

		switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
		}

		empWage = empHrs * EMP_RATE_PER_HOUR;
		System.out.println("Emp Wage: " +empWage);
   }
}

//Monthly wages
public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation.");

		int empHrs = 0;
		int empWage = 0;
		int totalEmpWage = 0;

		for (int day = 0; day < NUM_OF_WORKING_DAYS; day++) {
		int empCheck = (int) Math.floor(Math.random() * 10) % 3;
		switch (empCheck) {
			case IS_PART_TIME:
				empHrs = 4;
				break;
			case IS_FULL_TIME:
				empHrs = 8;
				break;
			default:
				empHrs = 0;
			}
			empWage = empHrs * EMP_RATE_PER_HOUR;
			totalEmpWage += empWage;
			System.out.println("Emp Wage: " +empWage);
		}
		System.out.println("Total Emp Wage: " +totalEmpWage);
   }
}

//Wages Till Condition

public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
	public static final int NUM_OF_WORKING_DAYS = 20;
	public static final int MAX_HRS_IN_MONTH = 100;

	public static void main(String[] args) {
		System.out.println("Welcome to Employee Wage Computation.");

		int empHrs = 0;
		int totalEmpHrs = 0;
		int totalWorkingDays = 0;

		while (totalEmpHrs <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS) {
			totalWorkingDays++;
			int empCheck = (int) Math.floor(Math.random() * 10) % 3;
			switch (empCheck) {
				case IS_PART_TIME:
					empHrs = 4;
					break;
				case IS_FULL_TIME:
					empHrs = 8;
					break;
				default:
					empHrs = 0;
				}
			totalEmpHrs += empHrs;
			System.out.println("Day#: " +totalWorkingDays + "Emp Hr:" +empHrs);
			}
			int totalEmpWage = totalEmpHrs * EMP_RATE_PER_HOUR;
			System.out.println("Total Emp Wage: " +totalEmpWage);
   }
}


//Refactoring the code UC-7

public class EmpWageComputation {
        public static final int IS_PART_TIME = 1;
        public static final int IS_FULL_TIME = 2;
        public static final int EMP_RATE_PER_HOUR = 20;
        public static final int NUM_OF_WORKING_DAYS = 20;
        public static final int MAX_HRS_IN_MONTH = 100;

        public static void EmpWagesMonthly(){
                int empHours=0;
                int totalWorkingDays=0, totalEmpHours=0;
                int empCheck=(int) Math.floor(Math.random() * 10) % 3;
                while (totalEmpHours <= MAX_HRS_IN_MONTH && totalWorkingDays < NUM_OF_WORKING_DAYS){
                        totalWorkingDays++;
                        switch(empCheck){
                                case IS_PART_TIME:
                                        empHours=8;
                                        break;
                                case IS_FULL_TIME:
                                        empHours=4;
                                        break;
                                default:
                                        empHours=0;
                        }
                totalEmpHours += empHours;
                }
        System.out.println("Total Employee Working Hour - "+totalEmpHours);
        System.out.println("Total Employee Working Days - "+totalWorkingDays);
        int totalEmpWage = totalEmpHours * EMP_RATE_PER_HOUR;
        System.out.println("Total employee wage - "+totalEmpWage);
        }

        public static void main(String[] args){
                System.out.println("Welcome to Employee Wage Computation");
                EmpWagesMonthly();
        }
}


//UC8 Multiple Companies Employee Wages
import java.util.Scanner;
public class EmpWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	public static void empMonthlyWages(int wagePerHour,int workingDays,int workingHours){
		int empHours=0;
		int totalWorkingDays=0, totalEmpHours=0;
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		while (totalEmpHours <= workingHours && totalWorkingDays < workingDays){
                        totalWorkingDays++;
			switch(empCheck){
				case IS_PART_TIME:
					empHours=8;
					break;
				case IS_FULL_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
		totalEmpHours += empHours;
		}
	System.out.println("Total Employee Working Hour - "+totalEmpHours);
        System.out.println("Total Employee Working Days - "+totalWorkingDays);
        int totalEmpWage = totalEmpHours * wagePerHour;
        System.out.println("Total employee wage - "+totalEmpWage);
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the wage per hour");
		int wagePerHour=sc.nextInt();
		System.out.println("enter the number of working days");
		int numWorkingDays=sc.nextInt();
		System.out.println("enter the number of working hour");
		int numWorkingHours=sc.nextInt();
		empMonthlyWages(wagePerHour,numWorkingDays,numWorkingHours);
	}
}

//UC9-Save Total Wage of company

import java.util.Scanner;
public class EmployeeWageComputation {
	public static final int IS_PART_TIME = 1;
	public static final int IS_FULL_TIME = 2;

	private String company;
	private int wagePerHour;
	private int workingDays;
	private int workingHours;
	private int totalEmpWage;

	public EmployeeWageComputation(String company ,int wagePerHour,int workingDays,int workingHours){
		this.company=company;
		this.wagePerHour=wagePerHour;
		this.workingDays=workingDays;
		this.workingHours=workingHours;
	}

	//Calculating monthly wage of employee
	public void employeeMonthlyWage(){
		//variables
		int empHours=0;
		int totalWorkingDays=0, totalEmpHours=0;
		int empCheck=(int) Math.floor(Math.random() * 10) % 3;
		while (totalEmpHours <= workingHours && totalWorkingDays < workingDays){
                        totalWorkingDays++;
			switch(empCheck){
				case IS_PART_TIME:
					empHours=8;
					break;
				case IS_FULL_TIME:
					empHours=4;
					break;
				default:
					empHours=0;
			}
		totalEmpHours += empHours;
		}
	System.out.println("total employee working hour - "+totalEmpHours);
        System.out.println("total employee working days - "+totalWorkingDays);
        totalEmpWage = totalEmpHours * wagePerHour;
	}

	public String toString(){
        	return "Total employee wage for company : "+company+" is - "+totalEmpWage;
	}

	public static void main(String[] args){
		System.out.println("Welcome to Employee Wage Computation");
		//take user input for each company
		EmployeeWageComputation tata = new EmployeeWageComputation("Tata",20,20,100);
		EmployeeWageComputation reliance = new EmployeeWageComputation("Jio",10,25,150);
		tata.employeeMonthlyWage();
		System.out.println(tata);
		jio.employeeMonthlyWage();
		System.out.println(jio);
	}
}

