package util;

import domain.*;

public class PrintUtil {
        public void printPurchaseInputMessage(){
                System.out.println("구입금액을 입력해 주세요.");
        }

        public void printPurchaseConfirmMessage(int numberOfLotto){
                System.out.println(numberOfLotto+"개를 구매했습니다.");
        }

        public void printPurchasedLottoList(Lotto[] lottos){
                for(Lotto lotto : lottos){
                        printPurchasedLotto(lotto);
                }
        }

        public void printPurchasedLotto(Lotto lotto){
                String message = lotto.getNumbers().toString();
                System.out.println(message);
        }

        public void printLastWeekWinningNumberInputMessage(){
                System.out.println("지난 주 당첨 번호를 입력해 주세요.");
        }
}
