import java.util.regex.Matcher;
import java.util.regex.Pattern;

class IsbnVerifier {

    boolean isValid(String stringToVerify) {

        Pattern pattern = Pattern.compile("([0-9]{9}X)|([0-9]{10})");
        stringToVerify = stringToVerify.replace("-","");
        Matcher matcher = pattern.matcher(stringToVerify);

        int sum = 0;
        boolean validResult = false;

        if (matcher.matches()) {

            String[] arr = stringToVerify.split("") ;

            if (arr[arr.length-1].equals("X")) {
                arr[arr.length-1] = "10";
            }

            for (int i = 0; i < arr.length; i++) {

                switch (i) {
                    case 0:
                        sum += Integer.parseInt(arr[i]) * 10;
                        break;
                    case 1:
                        sum += Integer.parseInt(arr[i]) * 9;
                        break;
                    case 2:
                        sum += Integer.parseInt(arr[i]) * 8;
                        break;
                    case 3:
                        sum += Integer.parseInt(arr[i]) * 7;
                        break;
                    case 4:
                        sum += Integer.parseInt(arr[i]) * 6;
                        break;
                    case 5:
                        sum += Integer.parseInt(arr[i]) * 5;
                        break;
                    case 6:
                        sum += Integer.parseInt(arr[i]) * 4;
                        break;
                    case 7:
                        sum += Integer.parseInt(arr[i]) * 3;
                        break;
                    case 8:
                        sum += Integer.parseInt(arr[i]) * 2;
                        break;
                    case 9:
                        sum += Integer.parseInt(arr[i]) * 1;
                        break;
                }
            }

            if (sum % 11 == 0) {
                validResult = true;
            }
        }

        return validResult;
    }

}
