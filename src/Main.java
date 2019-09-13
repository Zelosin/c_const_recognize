import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        while (true) {
            Global.mCurrentIndex = 0;
            Global.mInputData = new Scanner(System.in).next();
            switch (Global.mInputData.charAt(Global.mCurrentIndex)) {
                case ('0'): {
                    OcthexParser.octhexStatement();
                    break;
                }
                case ('1'):
                case ('2'):
                case ('3'):
                case ('4'):
                case ('5'):
                case ('6'):
                case ('7'):
                case ('8'):
                case ('9'): {
                    DecParser.decStatement();
                    break;
                }
                case ('+'):
                case ('-'): {
                    SignParser.signStatement();
                    break;
                }
                default: {
                    Global.errorMess();
                    break;
                }
            }
        }
    }
}
