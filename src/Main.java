import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the score to achieve");

        int scoreToAchieve=scanner.nextInt();

        int maxSamHelp = findSamHelp(scoreToAchieve);
        System.out.println("Max Help to get from Sam : "+maxSamHelp);
    }

    private static int findSamHelp(int scoreToAchieve) {
        int samHelp=1;
        int currentNum=1;
        for(int iterator=1;iterator<=scoreToAchieve;iterator*=2){
            currentNum=iterator;
        }
        samHelp+=(scoreToAchieve-currentNum);
        return samHelp;
    }
}