package io.algorithm;


import lombok.*;

/**
 * 문제 설명
 * 첫 번째 분수의 분자와 분모를 뜻하는 numer1, denom1, 두 번째 분수의 분자와 분모를 뜻하는 numer2, denom2가 매개변수로 주어집니다. 두 분수를 더한 값을 기약 분수로 나타냈을 때 분자와 분모를 순서대로 담은 배열을 return 하도록 solution 함수를 완성해보세요.
 *
 * 제한사항
 * 0 <numer1, denom1, numer2, denom2 < 1,000
 * 입출력 예
 * numer1	denom1	numer2	denom2	result
 * 1	2	3	4	[5, 4]
 * 9	2	1	3	[29, 6]
 * 입출력 예 설명
 * 입출력 예 #1
 *
 * 1 / 2 + 3 / 4 = 5 / 4입니다. 따라서 [5, 4]를 return 합니다.
 * 입출력 예 #2
 *
 * 9 / 2 + 1 / 3 = 29 / 6입니다. 따라서 [29, 6]을 return 합니다.
 */
public class PlusDiv {

    @Getter @Setter
    @AllArgsConstructor
    class Bunsu {
        private int ja;
        private int mo;

        public boolean moBiggerThen(Bunsu target) {
            if (this.mo >= target.getMo()) {
                return true;
            }
            return false;
        }
    }

    public int[] solution(int numer1, int denom1, int numer2, int denom2) {
        int ja = numer1 * denom2 + numer2 * denom1;
        int mo = denom1 * denom2;
        Bunsu bunsu1 = new Bunsu(numer1,denom1);
        Bunsu bunsu2 = new Bunsu(numer2,denom2);
        Bunsu bigMoBunsu  = null;
        Bunsu smallMoBunsu  = null;
        if (bunsu1.moBiggerThen(bunsu2))  {
            bigMoBunsu = bunsu1;
            smallMoBunsu = bunsu2;
        } else {
            bigMoBunsu = bunsu2;
            smallMoBunsu = bunsu1;
        }

        if (isDivPossible(bigMoBunsu.getMo(), smallMoBunsu.getMo())) {
            mo = bigMoBunsu.getMo();
            ja = bigMoBunsu.getJa() + smallMoBunsu.getJa() * bigMoBunsu.getMo() / smallMoBunsu.getMo();
        } else {
            mo = bigMoBunsu.getMo() * smallMoBunsu.getMo();
            ja = bigMoBunsu.getMo() * smallMoBunsu.getJa() + smallMoBunsu.getMo() * bigMoBunsu.getJa();
        }

        return new int[]{ja, mo};
    }

    protected boolean isDivPossible(int bigInt, int smallInt) {
        if (bigInt % smallInt == 0)
            return true;
        return false;
    }



}
