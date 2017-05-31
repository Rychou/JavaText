package text7;


public class email {

    public void checkEmail(String eml) throws emailException{
        if (eml.indexOf("@") == -1)
            throw  new emailException("邮件地址中没有”@”符号");
        else {
            String s = eml.substring(0,eml.indexOf("@"));
            if (s.length()<6)
                throw new emailException(" @前面不得少于6位");
        }

    }
}

