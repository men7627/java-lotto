package object;

import domain.LottoNumber;

public class BonusBall implements LottoNumber {
        public final int number;

        public BonusBall(int bonusBallNumber) {
                this.number = bonusBallNumber;
        }
}
