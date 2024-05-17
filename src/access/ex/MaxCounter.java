package access.ex;

public class MaxCounter {
    int count;
    int max;

    MaxCounter(int max) {
        this.max = max;
    }

    public void increment() {
        if (count >= max){
            System.out.println("최대값입니다. 더이상 더할 수 없습니다.");
        } else {
            count++;
            System.out.println("현재 count = " + count);
        }
    }

    public int getCount(){
        return count;
    }
}
