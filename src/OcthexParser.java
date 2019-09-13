public class OcthexParser {
    public static void octhexStatement(){
        Global.mCurrentIndex++;
        switch (Global.mInputData.charAt(Global.mCurrentIndex)){
            case ('x'):{
                hexParser.hexStatement();
                break;
            }
            case('1'):
            case('2'):
            case('3'):
            case('4'):
            case('5'):
            case('6'):
            case('7'):{
                OctParser.octStatement();
                break;
            }
            default:
                Global.errorMess();
        }
    }
}
