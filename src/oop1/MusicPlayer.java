package oop1;

public class MusicPlayer {

    int volume = 0;
    boolean isOn = false;

    void On(){
        isOn = true;
        System.out.println("음악 플레이어를 시작합니다.");
    }

    void Off(){
        isOn = false;
        System.out.println("음악 플레이어를 종료합니다.");
    }

    void VolumeUp(){
        volume++;
        System.out.println("볼륨 증가 volume= " + volume);
    }

    void VolumeDown(){
        volume--;
        System.out.println("볼륨 감소 volume= " + volume);
    }

    void PlayerStatus(){
        System.out.println("플레이어 상태 확인");
        if(isOn){
            System.out.println("플레이어가 실행중입니다.");
            System.out.println("현재 볼륨 volume= " + volume);
        }
        else System.out.println("플레이어가 종료되었습니다.");
    }
}
