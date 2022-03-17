package homeWorks;

public class Practice_1 {

    /*
    * String strOne = "2aw2awd2a23awd";
    // TODO delete '2's from string without using method delete and print out the result
    * */

    public static void main(String[] args) {
        String strOne = "2aw22awd22a23awd";
        //StringBuilder newStr = new StringBuilder();

        strOne = strOne.replace("2", "");

//        for(int i=0; i<strOne.length(); i++) {
//            while(strOne.charAt(i) == '2') {
//                i++;
//            }
//            newStr.append(strOne.charAt(i));
//        }
        System.out.println(strOne);
    }
}
