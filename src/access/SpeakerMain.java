package access;

public class SpeakerMain {
    public static void main(String[] args) {
        Speaker speaker = new Speaker(90);
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        speaker.volumeUp();
        speaker.showVolume();

        // 필드에 직접 접근
        System.out.println("volume 필드에 직접 접근 수정");
        // 클래스 Speaker에서 private int volume으로 접근 제어자를 설정했기 때문에 SpeakerMain 클래스에서의 접근이 불가능하다.
        // speaker.volume = 200;
        speaker.showVolume();
    }
}
