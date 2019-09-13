public class SignParser {
    public static void signStatement() {
        Global.mCurrentIndex++;
        switch (Global.mInputData.charAt(Global.mCurrentIndex)) {
            case ('0'):{
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
            default:
                Global.errorMess();
        }
    }
}