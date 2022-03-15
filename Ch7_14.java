import java.util.Scanner;

public class Ch7_14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("1. 8글자 이상입니다.\n"
                + "2. 영문자와 숫자만 사용 가능합니다. \n"
                + "3. 숫자는 2개 이상이어야 합니다.\n"
                + "위의 패스워드 규칙에 따라 원하는 패스워드를 입력하시오: ");
        String s = input.nextLine();
        if (is_Valid_Password(s)) {
            System.out.println("적절한 패스워드입니다: " + s);
        } else {
            System.out.println("패스워드 규칙에 어긋납니다: " + s);
        }
    }

    static boolean is_Valid_Password(String str)
    {
        int numCount = 0;

        if (!(str.length() >= 8))
            return false;

        for (int i = 0; i < str.length(); i++)
        {
            if (str.charAt(i) >= '0' && str.charAt(i) <= '9')   // isDigit
                numCount++;
            else if (str.charAt(i) >= 'A' && str.charAt(i) <= 'Z') {}   // isAlphabet
            else if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z') {}  // isAlphabet
            else
                return false;
        }

        if (!(numCount >= 2))
            return false;

        return true;
    }
}
