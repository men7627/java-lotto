package domain;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class PurchsedLottoCreator implements Creator {
        @Override
        public LottoNumber create() {
                List<Integer> numbers = new ArrayList<Integer>();
                Random random = new Random();
                while(numbers.size()<numberOfLotto){
                        addOneNumberWithoutDuplication(numbers,random.nextInt(maxLottoNumber)+1);
                }
                Lotto lotto = new Lotto(numbers);
                return lotto;
        }

        private void addOneNumberWithoutDuplication(List<Integer> numbers,int number){
                if(!numbers.contains(number)) {
                        numbers.add(number);
                }
        }
}
