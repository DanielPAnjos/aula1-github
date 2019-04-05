package entities;

public class Employee {
	
	public String name;
	public double grossSalary;
	public double tax;
	
	public double NetSalary() {
		return grossSalary - tax;
	}
	
	public void IncreaseSalary(double percentage) {
		double x = percentage/100;
		grossSalary += grossSalary * x;
		
	}
	
	public String toString() {
		
		return name + ", $ " + String.format("%.2f", NetSalary());
	}

}
