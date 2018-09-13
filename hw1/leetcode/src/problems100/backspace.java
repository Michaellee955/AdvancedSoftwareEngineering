package problems100;
import java.util.Stack;

public class backspace {

    private static boolean app(String S, String T){
        Stack<Character> resS = new Stack<>();
        Stack<Character> resT = new Stack<>();

        for (char temp: S.toCharArray()){
            if (resS.size()>0 && temp=='#'){
                resS.pop();
            }else if (temp!='#'){
                resS.push(temp);
            }
        }
        for (char temp: T.toCharArray()){
            if (resT.size()>0 && temp=='#'){
                resT.pop();
            }else if (temp!='#'){
                resT.push(temp);
            }
        }

        if (resS.size()!=resT.size())
            return false;
        else{
            while (resS.size()!=0){
                char tempS = resS.pop();
                char tempT = resT.pop();
                if (tempS != tempT)
                    return false;
            }
        }
        return true;
    }

}
