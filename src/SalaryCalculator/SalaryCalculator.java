package SalaryCalculator;
import java.util.Scanner;

public class SalaryCalculator {
    public static void main(String[] args) {
        Scanner scan= new Scanner(System.in);
        int Sunday = scan.nextInt();
        int Monday = scan.nextInt();
        int Tuesday = scan.nextInt();
        int Wednesday = scan.nextInt();
        int Thursday = scan.nextInt();
        int Friday = scan.nextInt();
        int Saturday = scan.nextInt();
        int totSalary, bonus, weeklyBonus, extraWeekSalary=0;
        int salaryMonday, salaryTuesday, salaryWednesday, salaryThursday, salaryFriday, extraHour=0;


        int salarySat= Saturday * 125;
        int salarySun= Sunday * 150;

        if(Monday > 8)
        {
            extraHour = Monday - 8;
            bonus = extraHour * 115;
            salaryMonday = bonus + 800;
        } 
        else
        {
            salaryMonday = Monday * 100;
        }


        if(Tuesday > 8)
        {
            extraHour = Tuesday - 8;
            bonus = extraHour * 115;
            salaryTuesday = bonus + 800;
        } 
        else
        {
            salaryTuesday = Tuesday * 100;
        }


        if(Wednesday > 8)
        {
            extraHour = Wednesday - 8;
            bonus = extraHour * 115;
            salaryWednesday = bonus + 800;
        } 
        else
        {
            salaryWednesday = Wednesday *100;
        }


        if(Thursday > 8)
        {
            extraHour = Thursday - 8;
            bonus = extraHour * 115;
            salaryThursday = bonus + 800;
        } 
        else
        {
            salaryThursday = Thursday * 100;
        }


        if(Friday > 8)
        {
            extraHour = Friday - 8;
            bonus = extraHour * 115;
            salaryFriday = bonus + 800;
        } 
        else
        {
            salaryFriday = Friday * 100;
        }

        int totalHours = Monday + Tuesday + Wednesday + Thursday + Friday;
        if(totalHours > 40)
        {
           weeklyBonus  = totalHours-40;
           extraWeekSalary = weeklyBonus * 125;
        }
        totSalary = salaryMonday + salaryTuesday + salaryWednesday + salaryThursday + salaryFriday + salarySat + salarySun + extraWeekSalary;
        System.out.println(totSalary);

    }
}

