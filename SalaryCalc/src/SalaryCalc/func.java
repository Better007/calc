package SalaryCalc;

public class func {
	 public double pribil (double stavka, double hours, double days) {
		 return stavka * hours * days;
	 }
	 
	 public double prem (double pribil) {
		 return pribil*0.1;
	 }
	 
	 public double nalog (double stavkaNalog, double stavka, double hours, double days) {
		 double pribil = stavka * hours * days;
		 double prem = pribil*0.1;
		 return (pribil + prem) * stavkaNalog / 100;
	 }
	 
	 public double result (double stavkaNalog, double stavka, double hours, double days) {
		 double pribil = stavka * hours * days;
		 double prem = pribil*0.1;
		 double nalog = (pribil + prem) * stavkaNalog / 100;
		 return pribil + prem - nalog;
	 }

}
