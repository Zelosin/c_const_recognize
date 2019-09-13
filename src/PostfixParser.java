public class PostfixParser {
    public static void postfixStatement(){
        Global.mCurrentIndex++;
        if(Global.mInputData.charAt(Global.mCurrentIndex) == ';')
            FinParser.finStatement();
        else
            Global.errorMess();
    }
}
