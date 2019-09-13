

public class DecParser {
    public static void decStatement(){
        Global.mCurrentIndex++;
        switch (Global.mInputData.charAt(Global.mCurrentIndex)){
            case('0'):
            case('1'):
            case('2'):
            case('3'):
            case('4'):
            case('5'):
            case('6'):
            case('7'):
            case('8'):
            case('9'):{
                decStatement();
                break;
            }
            case(';'):{
                FinParser.finStatement();
                break;
            }
            case('h'):
            case('H'):
            case('u'):
            case('U'):
            case('l'):
            case('L'):{
                PostfixParser.postfixStatement();
                break;
            }
            default:
                Global.errorMess();
        }
    }
}
