package Chap1andd2;

public class IfSwitch {
    public static void main(String[] args) {

        double annualIncome = 65000;
        double taxBracket = 0;
        String maritalStatus = "married";
        if (maritalStatus.equals("single")) {
            if (annualIncome < 9875) {
                taxBracket = 0.1;
            }


        } else if (maritalStatus.equalsIgnoreCase("married")) {

        }

        switch(maritalStatus){
            case "single":
                switch ((int) annualIncome){

                }
                break;


            case "married":
                break;
            default:
                System.out.println("");
        }

    }
}
