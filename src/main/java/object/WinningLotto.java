package object;

import domain.LottoNumber;
import domain.Rank;
import object.Lotto;

/**
 * 당첨 번호를 담당하는 객체
 */
public class WinningLotto implements LottoNumber {
        private final Lotto lotto;
        private final int bonusNo;

        public WinningLotto(Lotto lotto, int bonusNo) {
                this.lotto = lotto;
                this.bonusNo = bonusNo;
        }

        public Rank match(Lotto userLotto) {
                // TODO 로직 구현
                return null;
        }
}
