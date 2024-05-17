package access;

public class Speaker {
    // 내부에서만 관리할 수 있도록 제한을 걸어둠.
    private int volume;

    Speaker(int volume){
        this.volume = volume;
    }

    // 볼륨 증가
    void volumeUp(){
        if(volume >= 100){
            System.out.println("최대 음량입니다. 볼륨을 증가시킬 수 없습니다.");
        } else {
            volume += 10;
            System.out.println("볼륨을 10 증가합니다. 현재 볼륨: " + volume);
        }
    }

    // 볼륨 감소
    void volumeDown(){
        if(volume < 0) {
            System.out.println("최저 음량입니다. 볼륨을 감소시킬 수 없습니다.");
        } else {
            volume -= 10;
            System.out.println("볼륨을 10 줄입니다. 현재 볼륨: " + volume);
        }
    }

    // 현재 상태
    void showVolume(){
        System.out.println("현재 볼륨: " + volume);
    }
}
