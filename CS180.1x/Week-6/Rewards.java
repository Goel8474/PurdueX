/*
Purpose: to complete FRQ #1 in week 6 exam
Name: Vishesh Goel
Date: 02/22/2023
 */

import java.util.Scanner;

public class Rewards {
    public static String showRewards(int points) {
        if (points >= 50 && points < 100) {
            return "1) free coffee - 50 points";
        }
        if (points >= 100 && points < 200) {
            return "1) free coffee - 50 points\n2) free baked good - 100 points";
        }
        if (points >= 200 && points < 5000) {
            return "1) free coffee - 50 points\n2) free baked good - 100 points\n3) free specialty coffee - 200 points";
        }
        if (points >= 5000) {
            return "1) free coffee - 50 points\n2) free baked good - 100 points\n3) free specialty coffee - 200 points\n4) 1% store ownership - 5000 points";
        }
        else {
            return "You do not have enough points to select a reward";
        }

    }

    public static String getReward(int points, int selection) {
        switch (selection) {
            case 1:
                if (points >= 50) {
                    return "You have selected a free coffee!";
                } else {
                    return "You do not have enough points for that reward.";
                }
            case 2:
                if (points >= 100) {
                    return "You have selected a free baked good!";
                } else {
                    return "You do not have enough points for that reward.";
                }
            case 3:
                if (points >= 200) {
                    return "You have selected a free specialty coffee!";
                } else {
                    return "You do not have enough points for that reward.";
                }
            case 4:
                if (points >= 5000) {
                    return "You have selected 1% store ownership!";
                } else {
                    return "You do not have enough points for that reward.";
                }
            default: return "Please select one of the reward choices";
        }
    }
    public static void main(String[] args) {
        System.out.println("Please enter the number of point you have earned: ");
        Scanner s = new Scanner(System.in);
        int points = s.nextInt();
        System.out.println(showRewards(points));
        System.out.println("Please enter a reward choice of your selection: ");
        int selection = s.nextInt();
        System.out.println(getReward(points, selection));
        s.close();
    }
}
