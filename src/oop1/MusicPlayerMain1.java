package oop1;

// 절차지향 프로그래밍 TEST
public class MusicPlayerMain1 {
    public static void main(String[] args) {
        int volume = 0;
        boolean isOn = false;

        // 음악 플레이어 켜기
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");

        // volume 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // volume 증가
        volume++;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // volume 감소
        volume--;
        System.out.println("음악 플레이어 볼륨: " + volume);

        // 음악 플레이어 상태
        System.out.println("음악 플레이어 상태 확인: " + isOn);

        // 음악 플레이어 끄기
        isOn = false;
        System.out.println("음악 플레이어 상태 확인: " + isOn);

    }
}
