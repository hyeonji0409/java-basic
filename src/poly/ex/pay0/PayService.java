package poly.ex.pay0;

public class PayService {

    public void processPay(String option, int amount) {

        System.out.println("결제를 시작합니다: option=" + option + ", amount=" + amount);

        // 결제 수단 선택 -> 메서드 변환 가능
        Pay pay = PayStore.findPay(option);
       /* if(option.equals("kakao")) {
            pay = new KakaoPay();
        } else if(option.equals("naver")) {
            pay = new NaverPay();
        } else {
            pay = null;
            System.out.println("결제 수단이 없습니다.");
        }*/

        boolean result = pay.pay(amount);

        if(result) {
            System.out.println("결제가 성공했습니다.");
        } else {
            System.out.println("결제가 실패했습니다.");
        }

    }

    // 결제수단이 추가되어도 수정이 없게 하기 위해 PayStore라는 abstract class 생성
    /*public Pay findPay(String option) {
        if(option.equals("kakao")) {
            return new KakaoPay();
        } else if(option.equals("naver")) {
            return new NaverPay();
        } else {
            System.out.println("결제 수단이 없습니다.");
            return null;
        }
    }*/
}
