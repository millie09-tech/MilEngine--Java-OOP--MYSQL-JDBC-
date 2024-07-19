import java.util.Scanner;

public class MilEngineUI {

    public static void main(String[] args){


        Scanner scanInput = new Scanner(System.in);

        while(scanInput.hasNextLine()){

            String InputFromU = scanInput.nextLine();

            if(InputFromU.isEmpty() || InputFromU.equals(" ") || InputFromU.equals("q")){
                return;
            }

            if(InputFromU.equalsIgnoreCase("ADDPATIENT")){
                System.out.println("I want to add patient");
            }else if(InputFromU.equalsIgnoreCase("ADDDOCTOR")){

            }


        }

    }
}