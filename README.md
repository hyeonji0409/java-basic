# java-basic

> 김영한의 실전 자바 - 기본편을 참고하여 작성하였습니다.

# 클래스와 배열

## 클래스는 왜 필요한가?

- 여러 학생의 정보를 관리한다고 했을 때, 학생 이름, 성적, 나이를 따로 관리하는 것이 아니라 한 학생의 정보를 한번에 관리하는 것이 좋다. 이를 관리하기 쉽게 만드는 것이 클래스이다. 학생이라는 개념을 하나로
  묶어 그 안에 이름, 나이 성적을 입력하도록 하여 정보 관리가 가능하다.

## 클래스와 사용자 정의 타입

- 타입은 데이터의 종류나 형태를 의미함
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요함. 그 설계도를 **클래스**라고 함
- 설계도인 클래스를 사용해서 ** 실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
- 클래스를 통해 사용자가 원하는 종류의 데이터 타입 마음껏 정의 가능

## 객체와 인스턴스의 차이?

- 객체: 클래스에서 정의된 속성과 기능을 가진 실체
- 인스턴스: 특정 클래스로부터 생성된 객체
  -> 둘을 나눠서 분리하여 사용하지는 않지만 인스턴스는 객체보다 좀 더 관계에 초점을 맞춘 단어를 말한다. student1은 Student의 객체이다. 라고 말하는 대신 Student의 인스턴스이다 라는 말을 더
  많이 사용.

**자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다.**

## 배열에 있는 객체 사용

배열에 들어있는 객체를 사용하려면 먼저 배열에 접근하고, 그 다음에 객체에 접근해야 한다.

---

# 기본형 VS 참조형

변수의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 나뉜다.
사용하는 값을 변수에 직접 넣을 수 있는 기본형, 객체가 저장된 메모리의 위치를 가르키는 참조값을 넣을 수 있는 참조형으로 분류할 수 있다.

- 기본형(Primary Type): int, long, double, boolean처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형이라 한다.
- 참조형(Reference Type): Student student1, int[] students와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형이라 한다. 참조형은 객체 또는 배열에서
  사용된다.

## 기본형과 참조형의 계산

- 기본형은 들어있는 값을 그대로 계산에 사용할 수 있다.
    - ex) +, -, 사용하는 등등(숫자 등은 바로 계산 가능)
- 참조형은 들어있는 참조값을 그대로 사용할 수 없다. 주소지만 가지고 있어서 할 수 있는게 없다. 주소지에 가야 실체가 존재함!!
    - ex) +, -, 사용하는 등등 못함. 참조값만 가지고는 계산할 수 있는 것이 없음.

## 참고 - String

자바에서의 String은 특별하다. String은 사실 클래스이다. 따라서 참조형을 의미한다. 하지만, 기본형처럼 문자 값을 바로 대입할 수 있다.
문자는 매우 자주 다루기 때문에 자바에서 특별히 편의기능을 제공한 것이다.

## 기본형과 참조형에서의 변수의 대입

**자바는 항상 변수의 값을 복사해서 대입한다.**
자바에서 변수에 값을 대입하는 것은 ㅂ녀수에 들어이쓴 값을 복사해서 대입하는 것을 의미한다.
기본형, 참조형 모두 항상 변수에 있는 값을 복사해서 대입한다. 기본형이면 변수에 들어 있는 실제 사용하는 값을 복사해서 대입하고, 참조형이면 변수에 들어 있는 참조값을 복사해서 대입한다.

기본형 대입

```java
int a = 10;
int b = a;
```

참조형 대입

```java
import class1.Student;

Student s1 = new Student();
Student s2 = s1;
```

기본형은 변수에 값을 대입하더라도 실제 사용하는 값이 변수에 바로 들어있기 때문에 해당 값만 복사해서 대입한다고 생각하면 쉽게 이해가 가능하다.
하지만 **참조형의 경우 실제 사용하는 객체가 아니라 객체의 위치를 가르키는 참조값만 복사**된다. 건물이 복사가 되는 것이 아니라, 건물의 주소를 복사하는 것과 같다.

## 기본형과 참조형의 메서드 호출

메서드를 호출할 때 사용하는 매개변수(파라미터)도 변수일 뿐이다. 메서드를 호출할 때 매개변수에 값을 전달하는 것도 위와 같이 값을 복사해서 전달한다.

자바에서 메서드의 매개변수(파라미터)는 항상 값에 의해 전달된다. 그러나 이 값이 실제 값인지, 참조(메모리 주소)값인지에 따라 동작이 달라진다.

+ 기본형: 메서드로 기본형 데이터를 전달하면, 해당 값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터의 값을 변경해도, 호출자의 변수 값에는 영향이 없다.
+ 참조형: 메서드로 참조형 데이터를 전달하면, 참조값이 복사되어 전달된다. 이 경우, 메서드 내부에서 파라미터로 전달된 객체의 멤버 변수를 변경하면, 호출자의 객체도 변경된다.

## 변수와 초기화

+ 멤버 변수: 자동 초기화
    + 인스턴스의 멤버 변수는 인스턴스를 생성할 때 자동으로 초기화된다.
    + 숫자(int)=0, boolean = false, 참조형 = null(null 값은 참조할 대상이 없다는 뜻으로 사용)
    + 개발자가 초기값을 직접 지정할 수 있다.
+ 지역변수: 수동 초기화
    + 지역 변수는 항상 직접 초기화해야 한다.

## NULL

참조형 변수에는 항상 객체가 있는 위치를 가리키는 참조값이 들어간다. 그런데 앙직 가리키는 대상이 없거나, 가리키는 대상을 나중에 입력하고 싶다면?
참조형 변수에 아직 가리키는 대상이 없다면 null 이라는 특별한 값을 넣을 수 있다. null은 값이 존재하지 않는, 값이 없다는 뜻을 말한다.

## NullPointerException

참조값이 없이 객체를 찾아가면 어떤 문제가 발생할까?
이 경우 NullPointerException이 발생한다. 개발자를 많이 괴롭히는 예외이다.
NullPointerException은 이름 그대로 null을 가리키다는 뜻인데 이때 발생하는 예외를 말한다. null은 없다는 뜻을 말하므로 즉, 주소가 없는 곳을 찾아갈 때 발생하는 예외이다.

객체를 참조할 때는 `.`을(dot) 사용한다. 이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다. 그런데 참조값이 null이라면 값이 없다는 뜻이므로, 찾아갈 수 있는 객체(인스턴스)가 없다.
NullPointerException은 이처럼 nulldp .(dot)을 찍었을 때 발생한다.


---

# 객체 지향 프로그래밍

## 절차 지향 프로그래밍 VS 객체 지향 프로그래밍

**절차 지향 프로그래밍**

+ 절차 지향 프로그래밍은 이름 그대로 절차를 지향하는 것을 의미한다. 프로그램의 흐름을 순차적으로 따르면서 처리하는 방식으로 C언어를 예로들 수 있다.
+ "어떻게"를 중심으로 프로그래밍

**객체 지향 프로그래밍**

+ 객체 지향 프로그래밍은 이름 그대로 객체를 지향하는 것을 말한다. 실제 세계의 사물이나 사건을 객체로 보고, 이러한 객체들 간의 상호작용을 중심으로 프로그래밍하는 방식을 말한다.
+ "무엇을"을 중심으로 프로그래밍 한다.

**차이점?**

- 절차 지향은 데이터와 해당 데이터에 대한 처리 방식이 분리되어 있다. 반면에 객체 지향에서는 데이터와 그 데이터에 대한 행동(메서드)이 하나의 "객체" 안에 함께 포함되어 있다.

**장점**
각각의 기능을 메서드로 만들어서 사용하기 때문에 각 기능이 모듈화 된다.

- 중복 제거: 로직 중복의 제거. 같은 로직이 필요함녀 해당 메서드를 여러번 호출하면 된다.
- 변경 영향 범위: 기능을 수정할 때 해당 메서드 내부만 변경하면 된다.
- 메서드 이름 추가: 메서드 이름을 통해 코드를 더 쉽게 이해할 수 있다.

### 모듈화

필요한 블럭을 가져다 선택해서 사용할 수 있다. 음악 플레이어의 기능이 필요하다면 해당 기능을 메서드 호출만으로 손쉽게 사용이 가능하다.

## 절차 지향 프로그래밍의 한계

지금까지 클래스를 사용해서 관련된 데이터를 하나로 묶고, 또 메서드를 사용해서 각각의 기능을 모듈화했다. 덕분에 깔끔하고 가독성 있고, 유지보수하기 좋은 코드를 작성할 수 있었다. 하지만 이를 더 개선하기 위해서는
어떻게 해야할까?

우리가 작성한 코드의 한계는 데이터와 기능이 분리되어있다는 것이다. 음악 플레이어의 데이터는 MusicPlayerData에 있는데 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는 각각의 메서드에
분리되어 있다. 그래서 음악 플레이어와 관련된 데이터는 MusicPlayerData를 사용하고, 음악 플레이어와 관련된 내용은 Main3에서 각 메서드를 사용해야 한다.

"객체지향 프로그래밍"을 사용하면 데이터와 기능을 온전히 하나로 묶어서 사용할 수 있다.

## 클래스와 메서드

+ 클래스는 데이터인 멤버 변수 뿐 아니라 기능 역할을 하는 메서드도 포함할 수 있다.
+ 객체는 자신의 메서드를 통해 자신의 멤버 변수에 접근할 수 있다.
    + 객체의 메서드 내부에서 접근하는 멤버 변수는 객체 자신의 멤버 변수이다.

## 객체 지향 프로그래밍

절차 지향 프로그래밍에서 해왔던 것들은 데이터와 기능이 분리되어 있었다. 이제 데이터와 기능을 하나로 묶어서 하나의 개념을 온전히 클래스에 담아보려 한다.
프로그램을 작성하는 절차도 중요하지만 음악 플레이어의 개념을 객체로 온전히 만드는 것이 중요하기 때문에 객체를 만들어보도록 한다. (oop package)
객체에 집중하기 위해서는 순서가 아니라 클래스를 만드는 것에 집중해야 한다. 어떤 속성을 가지고 어떤 기능을 제공하는지 초점을 둬야 한다.

**캡슐화**
MusicPlayer를 보면 음악 플레이어를 구성하기 위한 속성과 기능이 하나의 캡슐에 쌓여있는 것처럼 보인다. 이렇게 속성과 기능을 하나로 묶어서 필요한 기능을 메서드를 통해 외부에 제공하는 것을 캡슐화라 한다.
속성과 기능이 한 곳에 있기 때문에 변경도 쉬워지고, 코드의 가독성도 좋아지며 사용자 입장에서 사용이 편해진다.

--- 

# 생성자

## 생성자가 왜 필요할까?

객체를 생성하는 시점에 어떤 작업을 하고 싶다면 생성자(construct)를 이용해야 한다.
우리가 어떤한 객체를 사용한다면 "초기화"라는 작업을 거쳐야 한다. 하지만 "생성자(Construct)"를 사용한다면 **객체가 생성되는 시점부터 인스턴스(초기값)을 설정할 수 있다.**

## this

멤버 벼수와 메서드의 매개변수의 이름이 같으면 둘을 어떻게 구분할까?

```java
public class MemberInit {
    String name;
    int age;
    int grade;

    // Main3 사용을 위한 추가
    void initMember(String name, int age, int grade) {
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```

위의 코드를 보면 멤버 변수와 매서드의 매개변수의 이름이 같다.
이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 **매개변수가 우선순위를 가진다.** 따라서 initMeber(String name, ...)메서드 안에서 name이라고 적으면 매개변수에
접근하게 된다.
그렇기 때문에 멤버 변수에 접근하기 위해서는 this.를 앞에 붙여 사용한다. 이때 this는 인스턴스 자신의 참조값을 가리킨다.

**this를 제거한다면?**

- this를 제외하면 name = name이 된다. 즉, 둘 다 매개변수에 있는 name을 의미하게 되므로 멤버변수의 값이 변경되지 않는다.

**this의 생략**
this의 생략이 불가능한 것은 아니다. this를 생략할 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수임)를 찾고, 없으면 그 다음으로 멤버 변수를 찾게된다. 이때, 멤버 변수도 없으면 오류가 발생한다.

```java
public class MemberThis {
    String nameField;

    void initMember(String memberParameter) {
        nameField = memberParameter; // 앞에 this 생략된 사례.
    }
}
```

위의 경우에는 nameField가 먼저 지역변수에 같은 이름이 찾고, 없기 때문에 멤버 변수에서 찾게 된다.
nameParameter는 먼저 지역변수에서 같은 이름이 있는지 찾는다. 이 경우 매개변수가 있기 때문에 매개변수를 사용한다.

this.를 항상 사용하는 경우도 있다. this를 사용하면 이 코드가 멤버 변수를 사용한다는 것을 눈으로 쉽게 확인할 수 있다. 그래서 과거에는 this를 항상 붙이는 스타일을 사용하기도 했다.

**생성자 특징**

- 생성자의 이름은 **클래스 이름과 같아야 한다**. (첫글자는 대문자로 시작한다)
- 생성자는 반환 타입이 없다.
- 나머지는 메서드와 동일하다.

**생성자 호출**
생성자는 인스턴스를 생성하고 나서 즉시 호출된다. 생성자를 호출하는 방법은 다음과 같이 new 명령어 다음에 생성자 이름과 매개변수에 맞춰 인수를 전달하면 된다.

```java
new 생성자이름(생성자에 맞는 인수 목록);
new

클래스이름(생성자에 맞는 인수 목록);
```

```java
new MemberConstruct("user",18,98);
```

위와 같이 하면 인스턴스를 생성하고 즉시 해당 생성자를 호출한다. 이러한 방법을 통해 중복 호출을 제거할 수 있다.

## 기본 생성자

+ 매개변수가 없는 생성자를 기본 생성자라 한다.
+ 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어준다.
+ **생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.**

기본 생성자를 만들어주는 이유는?
-> 자바가 기본 생성자를 만들어주지 않는다면 생성자 기능이 필요하지 않는 경우에도 모든 클래스에 개발자가 직접 기본 생성자를 정의해야 한다. 생성자 기능을 사용하지 않는 경우도 많기 때문에 이런 편의 기능을
제공한다.

## this()의 규칙

+ this()는 생성자 코드의 첫줄에만 작성할 수 있다.

```java
  public MemberConstruct(String name, int age) {
    System.out.println("go");
    this(name, age, 15);
}
```

위의 경우에서는 this()가 첫번째 줄에 나오지 않고 출력문이 첫번째 줄에 나왔기 때문에 컴파일 오류가 발생한다.


---

# 패키지

## 패키지의 사용

간단한 프로그램을 만든다면 패키지를 사용하지 않아도 괜찮지만 큰 프로젝트를 해서 많은 기능을 넣어야 한다면 어떻게 할까?
기능이 점점 추가되서 프로그램이 커지면 많은 클래스가 등장하면서 관련된 기능끼리 묶어서 사용하고 싶을 것이다. 컴퓨터는 보통 파일을 분류하기 위해 디렉토리의 개념을 사용하는데 자바에서는 파일을 분류하는 단위를 "
패키지"라고 한다.

## 패키지 규칙

+ 패키지의 이름과 위치는 폴더(디렉토리) 위치와 같아야 한다.
+ 패키지 이름은 모두 소문자를 사용한다.
+ 패키지 이름의 앞 부분에는 일반적으로 회사의 도메인이름을 거꾸로 사용한다. ex)com.company.myapp 과 같이 사용
    + 이 부분은 필수는 아니지만 수 많은 외부 라이브러리가 함께 사용되면 같은 패키지에 같은 클래스 이름이 존재할 수 있기 때문에 도메인 이름을 거꾸로 사용하면 이런 문제를 방지할 수 있다.
    + 직접 오픈소스나 라이브러리를 만들어서 외부에 제공한다면 지키는 것이 좋음
    + 내가 만든 애플리케이션을 다른 곳에 공유하지 않고, 직접 배포한다면 보통 문제되지 않음

---

# 접근 제어자

자바는 public, private 같은 접근 제어자(access modifier)를 제공한다. 접근 제어자를 사용함녀 해당 클래스 외부에서 특정 필드나 메서드에 접근하는 것을 허용하거나 제한할 수 있다.

## 접근 제어자의 종류

- private: 모든 외부 호출을 막는다
- default(package-private): 같은 패키지 안에서의 호출은 허용한다. (아무것도 적지 않으면 자동 적용)
- protected: 같은 패키지 안에서의 호출은 허용한다. 패키지가 달라도 상속 관계의 호출은 허용한다.
- public: 모든 외부 호출을 허용한다.
  private -> default -> protected -> public 의 순서로 차단한다.

**package-private**
접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 default 접근 제어자가 적용된다. default 라는 용어는 해당 접근 제어자가 기본값으로 사용되기 때문에 붙여진 이름이지만, 실제로는
package-private이 더 정확한 표현이다.
해당 접근 제어자를 사용하는 멤버는 동일한 패키지 내의 다른 클래스에서만 접근이 가능하기 때문이다.

**접근 제어자의 사용 위치**
접근 제어자는 필드와 메서드, 생성자에 사용된다.
++ 클래스 레벨에도 일부 접근 제어자의 사용이 가능하다.

**접근제어자 예시**

```java
public class Speaker {
    private int volume; // 필드

    public Speaker(int volume) {
    } // 생성자

    public void volumeUp() {
    } // 메서드

    public void volumeDown() {
    } // 메서드

    public void showVolume() {
    } // 메서드
}
```

접근 제어자의 핵심은 속성과 기능을 외부로부터 숨기는 것이다.

+ private은 나의 클래스 안으로 속성과 기능을 숨길 때 사용, 외부 클래스에서 해당 기능을 호출할 수 없다.
+ default는 나의 패키지 안으로 속성과 기능을 숨길 때 사용, 외부 패키지에서 해당 기능을 호출할 수 없다.
+ protected는 상속관계로 속성과 기능을 숨길 때 사용, 상속 관계가 아닌 곳에서 해당 기능을 호출할 수 없다.
+ public은 기능을 숨기지 않고 어디서든 호출할 수 있게 공게한다.

## 접근제어자 사용 - 클래스 레벨

**클래스 레벨의 접근 제어자 규칙**

+ 클래스 레벨의 접근 제어자는 public, default만 사용할 수 있다.
    + private, protected는 사용할 수 없다.
+ public 클래스는 반드시 파일명과 이름이 같아야 한다.
    + 하나의 자바 파일에 public 클래스는 하나만 등장할 수 있다.
    + 하나의 자바 파일에 default 접근 제어자를 사용하는 클래스는 무한정 만들 수 있다.

## 캡슐화

캡슐화(Encapsulation)은 객체 지향 프로그래밍의 중요한 개념 중 하나이다. 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다. 캡슐화를 통해 데이터의
직접적인 변경을 방지하거나 제한할 수 있다.
다시 말하면, 속성과 기능을 하나로 묶고, 외부에 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것을 말한다.

1. **데이터를 숨겨라**
   객체에는 속성(데이터)와 기능(method)가 있다. 캡슐화에서 가장 필수로 숨겨야 하는 것은 속성이다. Speaker의 volume을 생각하자. 객체 내부의 데이터를 외부에서 함부로 접근하게 두면 클래스
   안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변경할 수 있다. 결국 모든 안전망을 빠져나가게 되는 것이다.

**객체의 데이터는 객체가 제공하는 기능인 메서드를 이용해야 한다.**

2. **기능을 숨겨라**
   객체의 기능 중에서 외부에서 사용하지 않고 내부에서만 사용하는 기능들이 있다. 이런 기능도 모두 감추는 것이 좋다.
   예를들어 자동차를 운전하기 위해 자동차가 제공하는 복잡한 엔진 조절 기능, 배기 기능까지 우리가 다 알 필요는 없다. 우리는 단지 엑셀과 핸들 정도의 기능만 알면 된다.
   사용자에게 필요하지 않은 기능까지 모두 알려준다면, 사용자가 자동차에 대해 너무 많은 것을 알아야 한다. 사용자 입장에서 꼭 필요한 기능만 외부에 노출하고 나머지 기능은 모두 내부로 숨기는 것이 좋다.

--- 

# 자바 메모리 구조와 static

## 자바 메모리 구조

자바의 메모리 구조는 크게 메서드 영역, 스택 영역, 힙 영역 3개로 나뉜다.

+ 메서드 영역: 클래스 정보를 보관한다. (붕어빵 틀)
+ 스택 영역: 실제 프로그램이 실행되는 영역. 메서드를 실행할 때마다 하나씩 쌓인다.
+ 힙 영역: 객체(인스턴스)가 생성되는 영역. new 명령어를 사용하면 이 영역을 사용한다. 쉽게 말하면 붕어빵 틀로부터 생성된 붕어빵이 존재하는 공간.

+ **메서드 영역(Method Area)**: 메서드 영역은 프로그램을 실행하는데 필요한 공통 데이터를 관리한다. 이 영역은 프로그램의 모든 영역에서 공유한다.
    + 클래스 정보: 클래스의 실행 코드(바이트 코드), 필드, 메서드와 생성자 코드 등 모든 실행 코드가 존재한다.
    + static 영역: static 변수들을 보관한다.
    + 런타임 상수 풀: 프로그램을 실행하는데 필요한 공통 리터럴 상수를 보관한다. ex) "hello"라는 리터럴 문자가 있으면 이런 문자를 공통으로 묶어서 관리한다. 이외에도 프로그램을 효율적으로 관리하기
      위한 상수들을 관리한다.
+ **스택영역(Stack Area)**: 자바 실행 시, 하나의 실행 스택이 생성된다. 각 스택 프레임은 지역 변수, 중간 연산 결과, 메서드 호출 정보 등을 포함한다.
    + 스택 프레임: 스택 영역에 쌓이는 네모 박스가 하나의 스택 프레임이다. 메서드를 호출할 때 마다 하나의 스택 프레임이 쌓이고, 메서드가 종료되면 해당 스택 프레임이 제거된다.
+ **힙 영역(Heap Area)**: 객체(인스턴스)와 배열이 생성되는 영역이다. 가비지 컬렉션(GC)이 이루어지는 주요 영역이며, 더 이상 참조되지 않는 객체는 GC에 의해 제거된다.

> 스택 영역은 더 정확히는 각 스레드별로 하나의 실행 스택이 생성된다. 따라서 스레드 수 만큼 스택 영역이 생성된다. 지금은 스레드를 1개만 사용하므로 스택 영역도 하나이다. 스레드에 대한 부분은 멀티 스레드를
> 학습하면 이해할 수 있다.


**메서드 코드는 메서드 영역에!**
자바에서 특정 클래스로 100개의 인스턴스를 생성하면, 힙 메모리에 100개의 인스턴스가 생긴다. 각각의 인스턴스는 내부에 변수와 메서드를 가진다. 같은 클래스로부터 생성된 객체라도, 인스턴스 내부의 변수 값은 서로
다를 수 있지만, 메서드는 공통도니 코드를 공유한다. 따라서 객체가 생성될 때, 인스턴스 변수에는 메모리가 할당되지만, 메서드에 대한 새로운 메모리 할당은 없다. 메서드는 메서드 영역에서 공통으로 관리되고,
실행된다.
-> 인스턴스의 메서드를 호출하면 실제로는 메서드 영역에 있는 코드를 불러서 수행

## static 변수

```java
public class Data3 {
    public String name;
    public static int count; // static 변수
}
```

**멤버 변수(필드)의 종류**

+ **인스턴스 변수**: static이 붙지 않은 멤버 변수. ex) name
    + static이 붙지 않은 멤버 변수는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 변수라 한다.
    + 인스턴스 변수는 인스턴스를 만들 때마다 새로 만들어진다.
+ **클래스 변수**: static이 붙은 멤버 변수. ex) count
    + 클래스 변수, 정적 변수, static 변수 등으로 부른다. 용어를 모두 사용함.
    + static이 붙은 멤버 변수는 인스턴스와 무관하게 클래스에 바로 접근해서 사용할 수 있고, 클래스 자체에 소속되어 있다.
    + 클래스 변수는 자바 프로그램을 시작할 때 1개만 만들어진다. 인스턴스와는 다르게 보통 여러 곳에서 공유하는 목적으로 사용된다.

## 변수와 생명주기

+ **지역 변수(매개변수 포함)**: 지역 변수는 스택 영역에 있는 스택 프레임 안에 보관된다. 메서드가 종료되면 스택 프레임도 제거 되는데 이때 해당 스택 프레임에 포함된 지역 변수도 함께 제거된다. ==> 생명
  주기가 짧다.
+ **인스턴스 변수**: 인스턴스에 있는 멤버 변수를 인스턴스 변수라 한다. 인스턴스 변수는 힙 영역을 사용한다. 힙 영역은 GC(가비지 컬렉션)가 발생하기 전까지는 생존하기 때문에 보통 지역 변수보다 생존주기가
  짧다.
+ **클래스 변수**: 클래스 변수는 메서드 영역의 static 영역에 보관되는 변수이다. 메서드 영역은 프로그램 전체에서 사용하는 공용 공간이다. 클래스 변수는 해당 클래스가 JVM에 로딩되는 순간 생성된다.
  그리고 JVM이 종료될 때까지 생명주기가 이어진다. 따라서 긴 생명주기를 가진다.

static이 정적이라는 이유는 바로 여기에 있다. 힙 영역에 생성되는 인스턴스 변수는 동적으로 생성되고, 제거된다. 반면에 static인 정적 변수는 거의 프로그램 실행 시점에 딱 만들어지고, 프로그램 종료 시점에
제거된다. 정적 변수는 이름 그대로 정적이다.


> 정적 변수의 경우 인스턴스를 통한 접근을 추천하지 않는다. 그 이유는 코드를 읽을 때까지 마치 인스턴스 변수에 접근하는 것 처럼 오해할 수 있기 때문이다.
> 정적 변수는 클래스에서 공용으로 관리하기 때문에 클래스를 통해서 접근하는 것이 더 명확ㅎ다. 따라서 정적 변수에 접근할 때는 클래스를 통해 접근하는 것을 추천한다.

## static 메서드

**클래스 메서드**
메서드 앞에도 static을 붙일 수 있다. 이것을 `정적 메서드` 또는 `클래스 메서드`라 한다. 정적 메서드라는 용어는 static이 정적이라는 뜻이기 때문이고, 클래스 메서드라는 용어는 인스턴스 생성 없이 마치
클래스에 있는 메서드를 바로 호출하는 것 처럼 느껴지기 때문이다.

**인스턴스 메서드**
static이 붙지 않은 메서드는 인스턴스를 생성해야 호출할 수 있다. 이것을 `인스턴스 메서드`라 한다.

**정적 메서드**
정적 메서드는 객체 생성 없이 클래스에 있는 메서드를 바로 호출할 수 있다는 장점이 있다. 하지만 언제나 사용할 수 있는 것은 아니다.

**정적 메서드 사용법**

+ static 메서드는 static만 사용할 수 있다.
    + 클래스 내부의 기능을 사용할 때, 정적 메서드는 static이 붙은 **정적 메서드나 정적 변수만 사용할 수 있다.**
    + 클래스 내부의 기능을 사용할 때, 정적 메서드느 인스턴스 변수나, 인스턴스 메서드를 사용할 수 없다
+ 반대로 모든 곳에서 static 호출이 가능하다
    + 정적 메서드는 공용 기능이다. 따라서 접근 제어자만 허락한다면 클래스를 통해 모든 곳에서 static 호출이 가능하다.

**정적 메서드가 인스턴스의 기능을 사용할 수 없는 이유**
정적 메서드는 클래스의 이름을 통해 바로 호출할 수 있다. 그래서 인스턴스처럼 참조값의 개념이 없다.
특정 인스턴스의 기능을 사용하려면 참조값을 알아야 한다.하지만 정적 메서드는 참조값 없이 호출한다. 따라서 정적 메서드 내부에서 인스턴스 변수나 인스턴스 메서드를 사용할 수 없다.

**멤버 메서드**

+ 인스턴스 메서드
+ 클래스 메서드

static이 붙지 않은 멤버 메서드는 인스턴스를 생성해야 사용할 수 있고, 인스턴스에 소속되어 있다. 따라서 인스턴스 메서드라 한다. static이 붙은 멤버 메서드는 인스턴스와 무관하게 클래스에 바로 접근해서
사용할 수 있고, 클래스 자체에 소속되어 있다. 따라서 클래스 메서드라 한다.

**정적 메서드의 활용**
정적 메서드는 객체 생성이 필요 없이 메서드의 호출만으로 필요한 기능을 수행할 때 주로 사용한다.
예를 들어 간단한 메서드 하나로 끝나는 유틸리티성 메서드에 자주 사용한다. 수학의 여러가지 기능을 담은 클래스를 만들 수 있는데, 이 경우 인스턴스 변수 없이 입력한 값을 계산하고 반환하는 것이 대부분이다. 이럴 때
정적 메서드를 사용해서 유틸리티성 메서드를 만들면 좋다.

## 정적 메서드의 접근

static 메서드는 static 변수와 마찬가지로 클래스를 통한 직접 접근이 가능하며 인스턴스를 통한 접근 또한 가능하다.

## main() 메서드는 정적 메서드

인스턴스 생성 없이 실행하는 가장 대표적인 메서드는 main() 메서드이다.
main() 메서드는 프로그램을 시작하는 시작점이 되는데, 생각해보면 객체를 생성하지 않아도 main() 메서드가 작동한다. 이것은 main() 메서드가 static 이기 때문이다.

정적 메서드는 정적 메서드 호출만 가능하다. 따라서 정적 메서드인 main()이 호출하는 메서드에는 정적 메서드를 사용했다.

# Final 변수

## Final 변수와 상수

final이라는 키워드는 이름 그대로 마지막, 끝을 의미한다. 변수에 final 키워드가 붙으면 더는 값을 변경할 수 없다.

+ final을 지역변수에 설정할 경우 최초 한번만 할당이 가능하다. 이후에 변수의 값을 변경하려면 컴파일 오류가 발생한다.
+ final을 지역변수 선언시 바로 초기화 한 경우 이미 값이 할당되었기 때문에 값을 할당할 수 없다.
+ 매개변수에 final이 붙으면 메서드 내부에서 매개변수의 값을 변경할 수 없다. 따라서 메서드 호출 시점에 사용된 값이 끝까지 사용된다.

**final 필드(멤버변수)**
ConstructInit과 같이 생성자를 사용해서 final 필드를 초기화 하는 경우, 각 인스턴스마다 final 필드에 다른 값을 할당할 수 있다. 물론 final을 사용했기 때문에 생성 이후에 이 값을 변경하는
것은 불가능하다.

+ FieldInit과 같이 final 필드를 필드에서 초기화 하는 경우, 모든 인스턴스가 같은 값을 가진다. 왜냐하면 생성자 초기화와 다르게 필드 초기화는 필드의 코드에 해당 값이 미리 정해져 있기 때문이다.
+ 모든 인스턴스가 같은 값을 사용하기 때문에 결과적으로 메모리를 낭비하게 된다. (JVM에 따라서 내부 최적화를 시도할 수 있다.) 또 메모리 낭비를 떠나서 같은 값이 계속 생성되는 것은 개발자가 보기에 명확한
  중복이다. 이럴 때 사용함녀 좋은 것이 바로 static 영역이다.

**static final**

+ FieldInit.CONST_VALUE는 static 영역에 존재한다. 그리고 final 키워드를 사용해서 초기화 값이 변하지 않는다.
+ static 영역은 단 하나만 존재하는 영역이다. CONST_VALUE 변수는 JVM 상에서 하나만 존재하므로 위에서 말한 설명한 중복과 메모리 비효율 문제를 모두 해결할 수 있다.

**상수(Constant)**
`상수`는 변하지 않고, 항상 일정한 값을 갖는 수를 말한다. 자바에서는 보통 단 하나만 존재하는, 변하지 않는 고정된 값을 상수라 한다.

**자바 상수 특징**

+ static final 키워드를 사용한다.
+ 대문자를 사용하고, 구분은 `_`로 한다.
    + 일반적인 변수와 상수를 구분하기 위함
+ 필드를 직접 접근해서 사용한다.
    + 상수는 기능이 아니라 고정된 값 자체를 사용하는 것이 목적이다
    + 상수는 값을 변경할 수 없다. 따라서 필드에 직접 접근해도 데이터가 변하는 문제가 발생하지 않는다.

```java
package final1;

public class Constant {
    // 수학 상수
    public static final double PI = 3.14;

    // 시간 상수
    public static final int HOURS_IN_DAY = 24;
    public static final int MINUTES_IN_HOUR = 60;
    public static final int SECONDS_IN_MINUTE = 60;

    // 애플리케이션 설정 상수
    public static final int MAX_USERS = 1000;
}
```

애플리케이션 안에는 다양한 상수가 존재할 수 있다. 수학, 시간 등등 실생활에서 사용하는 상수부터 애플리케이션의 다양한 설정을 위한 상수들도 있다.
보통 이런 상수들은 애플리케이션 전반에서 사용되기 때문에 public을 자주 사용한다. 물론 특정 위치에서만 사용된다면 달느 접근 제어자를 사용하면 된다.
상수는 중앙에서 값을 하나로 관리할 수 있다는 장점이 있으며 런타임에 변경할 수 없다는 특징이 있다. 상수를 변경하기를 원한다면 프로그램을 종료하고, 코드를 변경한 다음에 프로그램을 다시 실행해야 한다.

## Final 변수와 참조

final은 변수의 값을 변경하지 못하게 막는 것을 말한다. 변수의 값은 무엇을 의미할까?

+ 변수는 크게 기본형 변수와 참조형 변수로 나뉜다
+ 기본형 변수는 10, 20과 같은 값들을 보관하고, 참조형 변수는 객체의 참조값을 보관한다.
    + final을 기본형 변수에 사용하면 값을 변경할 수 없다.
    + final을 참조형 변수에 사용하면 참조값을 변경할 수 없다.

---

# 상속

## 상속 관계

상속은 객체 지향 프로그래밍의 핵심 요소 중 하나로, 기존 클래스의 필드와 메서드를 새로운 클래스에서 재사용하게 해준다. 이름 그대로 기존 클래스의 속성과 기능을 그대로 물려받는 것이다. 상속을 사용하려면
extends 키워드를 사용하면 된다. 그리고 **extends 대상은 하나만 선택할 수 있다.**

+ **부모 클래스(Super Class)**: 상속을 통해 자신의 필드와 메서드를 다른 클래스에게 제공하는 클래스
+ **자식 클래스(Sub Class)**: 부모 클래스로부터 필드와 메서드를 상속받는 클래스

> 상속은 부모의 기능을 자식이 물려받는 것이다. 즉, 자식이 부모의 기능을 물려 받아서 사용하는 것이므로 부모 클래스는 자식 클래스에 접근할 수 없다. 자식 클래스는 부모 클래스의 기능을 물려받기 위해
> extends Parent를 통해 부모에게 접근하는 정보가 있지만, 부모 코드에는 자식에 대한 정보가 없다.

**단일 상속**
자바는 다중 상속을 지원하지 않는다. 그래서 extend 대상은 하나만 선택할 수 있다.

## 상속과 메모리 구조

+ 상속 관계의 객체를 생서아면 그 내부에는 부모와 자식이 무도 생성된다
+ 상속 관계의 객체를 호출할 때, 대상 타입을 정해야 한다. 이때 호출자의 타입을 통해 대상 타입을 찾는다
+ 현재 타입에서 기능을 찾지 못하면 상위 부모 타입으로 기능을 찾아서 실행한다. 기능을 찾지 못하면 컴파일 오류가 발생한다.

## 상속과 메서드 오버라이딩

부모 타입의 기능을 자식에서는 다르게 재정의 하고 싶을 수 있다.
예를 들어 Car.move()라는 기능은 단순히 "차를 이동합니다."라고 출력한다. 전기차의 경우 보통 더 빠르기 때문에 전기차가 move()를 호출한 경우에 "전기차를 빠르게 이동합니다."라고 출력을 변경하고
싶다면?

부모에게서 상속 받은 기능을 자식이 **재정의 하는 것을 메서드 오버라이딩(Overriding)**이라 한다.

### @Override

`@`이 붙은 부분은 애노테이션이라 한다. 애노테이션은 주석과 비슷한데 프로그램이 읽을 수 있는 특별한 주석이라 생각하면 된다.
`@Override`는 상위 클래스의 메서드를 오버라이드하는 것을 나타낸다. 오버라이딩한 메서드 위에 이 애노테이션을 붙이는 것으로 오버라이딩함을 나타낼 수 있다.
컴파일러는 이 애노테이션을 보고 메서드가 정확히 오버라이드 되었는지를 확인하고, 조건을 만족시키지 않으면 Compile Error를 발생시킨다. 예를 들어 부모 클래스에 move()라는 메서드가 있는데 자식
클래스에서 Move()로 오버라이드 할 경우 컴파일 오류가 발생하는 것이다.
이때, @Override를 입력하지 않아도 기능이 작동하지만, 실수가 생겼을 때, 오류를 수정할 수 있도록 사용하는 것이 좋다.

### 오버로딩(Overloading) Vs 오버라이딩(Overriding)

+ **메서드 오버로딩**: 메서드 이름이 같고 매개변수(파라미터)가 다른 메서드를 여러개 정의하는 것을 메서드 오버로딩이라 한다. 오버로딩은 과적을 뜻하는데, 물건을 과하게 담았다는 뜻이다. 따라서 같은 이름의
  메서드를 여러개 정의 했다고 이해하면 된다.
+ **메서드 오버라이딩**: 메서드 오버라이딩은 하위 클래스에서 상위 클래스의 메서드를 재정의하는 과정을 말한다. 상속 관계에서 사용하며 부모의 기능을 자식이 다시 정의하는 것이다. 오버라이딩을 단순히 해석하면
  무언가를 넘어 타는 것을 말하는데 자식의 새로운 기능이 부모의 기존 기능을 넘어서 기존 기능을 새로운 기능으로 덮는다고 생각하면 된다. 오버라이딩을 우리 말로 번역하면 **재정의**이다. 상속 관계에서는 기존
  기능을 다시 정의한다고 이해하면 된다.

## 메서드 오버라이딩 조건

+ **메서드 이름**: 메서드 이름이 같아야 한다.
+ **메서드 파라미터**: 메서드 파라미터의 타입, 순서, 개수가 같아야 한다.
+ **반환 타입**: 반환 타입이 같아야 한다. 단, 반환 타입이 하위 클래스 타입일 수 있다.
+ **접근 제어자**: 오버라이딩의 접근 제어자는 상위 클래스의 메서드보다 더 제한적이어서는 안된다. 예를 들어, 상위 클래스의 메서드가 protected로 선언되어 있으면 하위 클래스에서 이를 public 또는
  protected로 오버라이드할 수 있지만, private, default로는 오버라이드 할 수 없다.
+ **예외**: 오버라이딩 메서드는 상위 클래스의 메서드보다 더 많은 체크 예외를 throws로 선언할 수 없다. 하지만 더 적거나 같은 수의 예외, 또는 하위 타입의 예외는 선언할 수 있다. 예외를 학습해야 이해
  가능
+ **static, final, private**: 키워드가 붙은 메서드는 오버라이딩 불가
    + static은 클래스 레벨에서 작동하므로 인스턴스 레벨에서 사용하는 오버라이딩이 의미가 없다. 쉽게 말하면 클래스 이름을 통해 필요한 곳에 "직접 접근"하면 된다.
    + final 메서드는 재정의를 금한다.
    + private 메서드는 해당 클래스에서만 접근 가능하기 때문에 하위 클래스에서 보이지 않는다. 따라서 오버라이딩 불가
+ **생성자 오버라이딩**: 생성자는 오버라이딩할 수 없다.

## 상속과 접근 제어

### 접근제어자의 종류

+ public(+): 모든 외부 호출을 막는다
+ default(~): 같은 패키지 안에서의 호출 허용
+ protected(#): 같은 패키지 안에서의 호출을 허용. 패키지가 달라도 상속 관계의 호출 허용
+ private(-): 모든 외부 호출 허용

## Super - 부모 참조

부모와 자식의 필드명이 같거나 메서드가 오버라이딩 되어 있으면, 자식에서 부모의 필드나 메서드를 호출할 수 없다. 이때 super 키워드를 사용하면 부모를 참조할 수 있다. super는 이름 그대로 부모 클래스에
대한 참조를 나타낸다.

## Super - 생성자

상속 관계의 인스턴스를 생성하면 결국 메모리 내부에는 자식과 부모 클래스가 각각 다 만들어진다. Child를 만들면 부모인 Parent까지 함께 만들어지는 것이다. 따라서 각각의 생성자도 모두 호출히야 한다.
**상속 관계를 사용하면 자식 클래스의 생성자에서 부모 클래스의 생성자를 반드시 호출히야 한다.**

+ 부모 클래스의 생성자가 기본 생성자(파라미터가 없는 경우)일 때는 super()를 생략할 수 있다.
    + 상속 관계에서 첫줄에 super(...)를 생략하면 자바는 부모의 기본 생성자를 호출하는 super()를 자동으로 만들어준다.
    + 참고로 기본 생성자를 많이 사용하기 때문에 편의상 해당 기능을 제공하는 것이다.
    + 예외적으로 첫줄에 super() 대신에 this()의 사용이 가능하다. 하지만 super()는 자식의 생성자 안에서 언젠가는 반드시 호출히야 한다.

## 클래스와 메서드의 final

+ 클래스에 final
    + 상속의 끝을 의미
    + final로 선언된 클래스는 확장될 수 없으며, 다른 클래스가 final로 선언된 클래스를 상속받을 수 없다.

```java
   public final class MyFinalClass() {...
}
```

+ 메서드에 final
    + 오버라이딩 끝
    + final로 선언된 메서드는 오버라이드될 수 없다. 상속받은 서브 클래스에서 이 메서드를 변경할 수 없다.

```java
   public final void myFinalMethod() {...}
```

--- 

# 다형성

객체지향 프로그래밍의 대표적인 특징에는 캡슐화, 상속, 다형성이 있다. 그 중에서 다형성은 객체지향 프로그래밍의 꽃이라 불린다.
캡슐화나 상속은 직관적으로 이해하기 쉽다. 반면 다형성은 제대로 이해하기도 어렵고, 잘 활용하기는 더 어렵다.

`다형성(Polymorphism)`은 이름 그대로 '다양한 형태', '여러 형태'를 뜻한다.
프로그래밍에서 다형성은 한 객체가 여러 타입의 객체로 취급될 수 있는 능력을 뜻한다. 보통 하나의 객체는 하나의 타입으로 고정되어 있다. 그런데 다형성을 사용하면 하나의 객체가 다른 타입으로 사용될 수 있다는 것을
말한다.

## 다형적 참조

그동안의 참조 대입은 항상 같은 타입에 대입했다. 즉, 보통 한 가지 형태만 참조할 수 있었다.

```java
Parent parent = new Parent();
Child child = new Child();
```

그런데 Parent 타입의 변수는 다음과 같이 자신인 Parent는 물론, 자식 타입까지 참조할 수 있다. 그 밑의 손자가 있다면 손자, 더 나아가 그 하위 타입도 참조할 수 있다.

```java
Parent poly = new Parent();
Parent poly = new Child();
Parent poly = new Grandson(); // Child 하위에 손자가 있다면 가능
```

**다형적 참조와 인스턴스 실행**
Parent -> Child: poly.parentMethod();
poly.parentMethod()를 호출하면 참조값을 사용해서 인스턴스를 찾는다. 그리고 다음으로 인스턴스 안에서 실행할 타입도 찾아야 한다. poly는 Parent 타입니다. 따라서 Parent 클래스부터
시작해서 필요한 기능을 찾는다. 인스턴스의 Parent 클래스에 parentMethod()가 있기 때문에 해당 메서드가 호출된다.

**다형적 참조의 한계**
Parent -> Child: poly.childMethod();
`Parent poly = new Child();`로 자식을 참조한 상황에서 poly가 자식타입인 Child에 있는 childMethod()를 호출하면 어떻게 될까?
poly.childMethod()를 실행하면 먼저 참조값을 통해 인스턴스를 찾는다. 그리고 다음으로 인스턴스 안에서 실행할 타입을 찾아야 한다. 호출자인 poly는 Parent 타입니다. 따라서 Parent
클래스부터 시작해서 필요한 기능을 찾는다. 그런데 상속 관계는 부모 방향으로 찾아 올라갈 수는 있지만 자식 방향으로 찾아 내려갈 수는 없다. Parent는 부모 타입이고 상위에 부모가 없기 때문에
childMethod()를 찾을 수 없으므로 컴파일 오류가 발생한다

이 경우 childMethod()를 호출하고 싶다면? -> 캐스팅 필요

## 메서드 오버라이딩


