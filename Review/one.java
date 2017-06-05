package Review;

//1、给出字符串“Thank you,i like you,do you like me?”
//        （1）请查找该字符串中字符串“you”最后一次出现的位置；
//        （2）请统计字符“k”出现的次数；
//        （ 3）截取子串“me”。

public class one {
    public static void main(String[] args) {
        String str = "Thank you,i like you,do you like me?";
        int num = str.lastIndexOf("you"); //num为位置信息
        char[] c = new char[str.length()];
        c = str.toCharArray();
        int kCounter = 0;
        for (char i :c){
            String s = String.valueOf(i);
            if (s.equals("k"))
                kCounter++;
        }
        String me = str.substring(str.indexOf("me"),str.indexOf("me")+2);
        System.out.println("“you”最后出现的位置:"+num);
        System.out.println("“k” 出现的次数"+kCounter);
        System.out.println(me);

    }
}
