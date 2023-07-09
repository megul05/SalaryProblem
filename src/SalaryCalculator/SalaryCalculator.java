package SalaryCalculator;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int Sun = sc.nextInt();
        int Mon = sc.nextInt();
        int Tue = sc.nextInt();
        int Wed = sc.nextInt();
        int Thu = sc.nextInt();
        int Fri = sc.nextInt();
        int Sat = sc.nextInt();
        int totSalary, bonus, weeklyBonus, extraWeeklySalary=0;
        int salaryMon, salaryTue, salaryWed, salaryThu, salaryFri, extraHour=0;


        int salarySat= Sat * 125;
        int salarySun= Sun * 150;

        if(Mon > 8){
            extraHour = Mon-8;
            bonus = extraHour*115;
            salaryMon = bonus + 800;
        } else{
            salaryMon = Mon*100;
        }


        if(Tue > 8){
            extraHour = Tue-8;
            bonus = extraHour*115;
            salaryTue = bonus + 800;
        } else{
            salaryTue = Tue*100;
        }


        if(Wed > 8){
            extraHour = Wed-8;
            bonus = extraHour*115;
            salaryWed = bonus + 800;
        } else{
            salaryWed = Wed*100;
        }


        if(Thu > 8){
            extraHour = Thu-8;
            bonus = extraHour*115;
            salaryThu = bonus + 800;
        } else{
            salaryThu = Thu*100;
        }


        if(Fri > 8){
            extraHour = Fri-8;
            bonus = extraHour*115;
            salaryFri = bonus + 800;
        } else{
            salaryFri = Fri*100;
        }

        int totalHours = Mon + Tue + Wed + Thu + Fri;
        if(totalHours > 40){
           weeklyBonus  = totalHours-40;
           extraWeeklySalary = weeklyBonus * 125;
        }
        totSalary = salaryMon + salaryTue + salaryWed + salaryThu + salaryFri + salarySat + salarySun + extraWeeklySalary;
        System.out.println(totSalary);



    }
}

