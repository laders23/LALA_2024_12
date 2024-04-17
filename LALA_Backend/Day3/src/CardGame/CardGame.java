package CardGame;
import java.util.Scanner;


public class CardGame{
    static int P1_iNum;
    static int P1_iSign;
    static String P1_sNum;
    static String P1_sSign;
    static int P2_iNum;
    static int P2_iSign;
    static String P2_sNum;
    static String P2_sSign;

    public static int draw(int card[][],int P) {
        int random_num = 0;
        int random_sign = 0;

        while(true) {
            random_num = (int) (Math.random() * 13) + 2;
            random_sign = (int) (Math.random() * 4);
            if(card[random_sign][random_num] != -1) {
                break;
            }
        }
        if(P == 1) {
            P1_iNum = random_num;
            P1_iSign = random_sign;
        }
        else if(P == 2){
            P2_iNum = random_num;
            P2_iSign = random_sign;
        }

        card[random_sign][random_num] = -1;

        return card[random_sign][random_num];
    }

    public static void Winner(){
        if(P1_iNum > P2_iNum){
            System.out.println("Player 1 Win");
        }
        else if(P1_iNum < P2_iNum){
            System.out.println("Player 2 Win");
        }
        else{
            if(P1_iSign > P2_iSign){
                System.out.println("Player 1 Win");
            }
            else{
                System.out.println("Player 2 Win");
            }
        }
    }

    public static void Convert(int P){
        int P_iSign;
        int P_iNum;
        String P_sSign = null;
        String P_sNum= null;

        if(P == 1){
            P_iSign = P1_iSign;
            P_iNum = P1_iNum;
        }
        else{
            P_iSign = P2_iSign;
            P_iNum = P2_iNum;
        }

        switch (P_iSign) {
            case 3:
                P_sSign = "SPADE";
                break;
            case 2:
                P_sSign = "DIAMOND";
                break;
            case 1:
                P_sSign = "HEART";
                break;
            case 0:
                P_sSign = "CLOVER";
                break;
        }

        switch (P_iNum) {
            case 11:
                P_sNum = "JACK";
                break;
            case 12:
                P_sNum = "QUEEN";
                break;
            case 13:
                P_sNum = "KING";
                break;
            case 14:
                P_sNum = "ACE";
                break;
            default:
                P_sNum = Integer.toString(P_iNum);
                break;
        }

        if(P == 1){
            P1_sSign = P_sSign;
            P1_sNum = P_sNum;
        }
        else{
            P2_sSign = P_sSign;
            P2_sNum = P_sNum;
        }
        System.out.println(P_sSign + " " + P_sNum);
    }

    public static void main(String args[]){
        int Card[][] = new int[5][15]; //2차원 배열 선언

        for(int i = 0; i<4; i++){
            for(int k =2; k<15; k++){
                Card[i][k] = k+2;
            }
        }
        
        draw(Card,1);
        draw(Card,2);

        Winner();

        Convert(1);
        Convert(2);

    }


}
