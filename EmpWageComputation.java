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
