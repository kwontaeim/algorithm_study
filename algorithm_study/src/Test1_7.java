/*문제 11718번
입력 받은 대로 출력하는 프로그램을 작성하시오.

입력
입력이 주어진다. 입력은 최대 100줄로 이루어져 있고, 알파벳 소문자, 대문자, 공백, 숫자로만 이루어져 있다.
각 줄은 100글자를 넘지 않으며, 빈 줄은 주어지지 않는다. 또, 각 줄은 공백으로 시작하지 않고, 공백으로 끝나지 않는다.

출력
입력받은 그대로 출력한다.*/

public class Test1_7 {

  public static void main(String args[]) {


    java.util.Scanner keyBoard = new java.util.Scanner(System.in);

    StringBuilder sb = new StringBuilder();
    String line = null;

    while (keyBoard.hasNext()) {
    System.out.println(keyBoard.next());
    }

    keyBoard.close();
    /*for (int i = 0; i < outPut.length; i++) {

     if (keyBoard.hasNext() == true) {
      checkEmpty = keyBoard.nextLine();
      } else {
        System.out.println();
        checkEmpty = keyBoard.toString();
      }
      System.out.println(checkEmpty);

      
     if (checkEmpty == "" || checkEmpty.length() > 100 || !keyBoard.hasNextLine()) {
        break;

      } else {

        outPut[i] = checkEmpty;

      }
    }
  
    keyBoard.close();
    
    for (int j = 0; j < outPut.length; j++) {
      
      System.out.println(outPut[j].trim());
    }*/
  }
}


