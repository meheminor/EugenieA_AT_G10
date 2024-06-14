package src.assignments.asgn3.task1.playground.utils;

public class DirectionGenerator {
    public static String generateDirection(){
        int minNumber = 1;
        int maxNumber = 40;
        int randomNumber =(int) (Math.random() * (maxNumber-minNumber) +minNumber);

        if (randomNumber <=9){
            return "North";
        }
        if (randomNumber <=19){
            return "South";
        }if (randomNumber <=29){
            return "West";
        }if (randomNumber <=39) {
            return "East";
        }else{
            return "We are not going anywhere";
        }

    }

//    public static void main(String[] args) {
//        System.out.println(generateDirection());
//    }
}
