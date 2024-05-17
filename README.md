# java-basic

# 클래스와 배열
## 클래스는 왜 필요한가?
- 여러 학생의 정보를 관리한다고 했을 때, 학생 이름, 성적, 나이를 따로 관리하는 것이 아니라 한 학생의 정보를 한번에 관리하는 것이 좋다. 이를 관리하기 쉽게 만드는 것이 클래스이다. 학생이라는 개념을 하나로 묶어 그 안에 이름, 나이 성적을 입력하도록 하여 정보 관리가 가능하다.

## 클래스와 사용자 정의 타입
- 타입은 데이터의 종류나 형태를 의미함
- 사용자가 직접 정의하는 사용자 정의 타입을 만들려면 설계도가 필요함. 그 설계도를 **클래스**라고 함
- 설계도인 클래스를 사용해서 ** 실제 메모리에 만들어진 실체를 객체 또는 인스턴스**라 한다.
- 클래스를 통해 사용자가 원하는 종류의 데이터 타입 마음껏 정의 가능

## 객체와 인스턴스의 차이?
- 객체: 클래스에서 정의된 속성과 기능을 가진 실체
- 인스턴스: 특정 클래스로부터 생성된 객체
-> 둘을 나눠서 분리하여 사용하지는 않지만 인스턴스는 객체보다 좀 더 관계에 초점을 맞춘 단어를 말한다. student1은 Student의 객체이다. 라고 말하는 대신 Student의 인스턴스이다 라는 말을 더 많이 사용.

**자바에서 대입은 항상 변수에 들어있는 값을 복사해서 전달한다.**

## 배열에 있는 객체 사용
배열에 들어있는 객체를 사용하려면 먼저 배열에 접근하고, 그 다음에 객체에 접근해야 한다. 

---


# 기본형 VS 참조형
변수의 데이터 타입을 가장 크게 보면 기본형과 참조형으로 나뉜다.
사용하는 값을 변수에 직접 넣을 수 있는 기본형, 객체가 저장된 메모리의 위치를 가르키는 참조값을 넣을 수 있는 참조형으로 분류할 수 있다.
- 기본형(Primary Type): int, long, double, boolean처럼 변수에 사용할 값을 직접 넣을 수 있는 데이터 타입을 기본형이라 한다.
- 참조형(Reference Type): Student student1, int[] students와 같이 데이터에 접근하기 위한 참조(주소)를 저장하는 데이터 타입을 참조형이라 한다. 참조형은 객체 또는 배열에서 사용된다.

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
int b  = a;
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

객체를 참조할 때는 `.`을(dot) 사용한다. 이렇게 하면 참조값을 사용해서 해당 객체를 찾아갈 수 있다. 그런데 참조값이 null이라면 값이 없다는 뜻이므로, 찾아갈 수 있는 객체(인스턴스)가 없다. NullPointerException은 이처럼 nulldp .(dot)을 찍었을 때 발생한다.


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
지금까지 클래스를 사용해서 관련된 데이터를 하나로 묶고, 또 메서드를 사용해서 각각의 기능을 모듈화했다. 덕분에 깔끔하고 가독성 있고, 유지보수하기 좋은 코드를 작성할 수 있었다. 하지만 이를 더 개선하기 위해서는 어떻게 해야할까?

우리가 작성한 코드의 한계는 데이터와 기능이 분리되어있다는 것이다. 음악 플레이어의 데이터는 MusicPlayerData에 있는데 그 데이터를 사용하는 기능은 MusicPlayerMain3에 있는 각각의 메서드에 분리되어 있다. 그래서 음악 플레이어와 관련된 데이터는 MusicPlayerData를 사용하고, 음악 플레이어와 관련된 내용은 Main3에서 각 메서드를 사용해야 한다.

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
    void initMember(String name, int age, int grade){
        this.name = name;
        this.age = age;
        this.grade = grade;
    }
}
```
위의 코드를 보면 멤버 변수와 매서드의 매개변수의 이름이 같다.
이 경우 멤버 변수보다 매개변수가 코드 블럭의 더 안쪽에 있기 때문에 **매개변수가 우선순위를 가진다.** 따라서 initMeber(String name, ...)메서드 안에서 name이라고 적으면 매개변수에 접근하게 된다.
그렇기 때문에 멤버 변수에 접근하기 위해서는 this.를 앞에 붙여 사용한다. 이때 this는 인스턴스 자신의 참조값을 가리킨다.

**this를 제거한다면?**
- this를 제외하면 name = name이 된다. 즉, 둘 다 매개변수에 있는 name을 의미하게 되므로 멤버변수의 값이 변경되지 않는다.


**this의 생략**
this의 생략이 불가능한 것은 아니다. this를 생략할 경우 변수를 찾을 때 가까운 지역변수(매개변수도 지역변수임)를 찾고, 없으면 그 다음으로 멤버 변수를 찾게된다. 이때, 멤버 변수도 없으면 오류가 발생한다.

```java
public class MemberThis {
    String nameField;

    void initMember(String memberParameter){
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
new 클래스이름(생성자에 맞는 인수 목록);
```

```java
new MemberConstruct("user", 18, 98);
```
위와 같이 하면 인스턴스를 생성하고 즉시 해당 생성자를 호출한다. 이러한 방법을 통해 중복 호출을 제거할 수 있다.

## 기본 생성자
+ 매개변수가 없는 생성자를 기본 생성자라 한다.
+ 클래스에 생성자가 하나도 없으면 자바 컴파일러는 매개변수가 없고, 작동하는 코드가 없는 기본 생성자를 자동으로 만들어준다.
+ **생성자가 하나라도 있으면 자바는 기본 생성자를 만들지 않는다.**

기본 생성자를 만들어주는 이유는?
-> 자바가 기본 생성자를 만들어주지 않는다면 생성자 기능이 필요하지 않는 경우에도 모든 클래스에 개발자가 직접 기본 생성자를 정의해야 한다. 생성자 기능을 사용하지 않는 경우도 많기 때문에 이런 편의 기능을 제공한다.


## this()의 규칙
+ this()는 생성자 코드의 첫줄에만 작성할 수 있다.

```java
  public MemberConstruct(String name, int age){
  System.out.println("go");
  this(name, age, 15);
}
```
위의 경우에서는 this()가 첫번째 줄에 나오지 않고 출력문이 첫번째 줄에 나왔기 때문에 컴파일 오류가 발생한다.


---
# 패키지[

## 패키지의 사용
간단한 프로그램을 만든다면 패키지를 사용하지 않아도 괜찮지만 큰 프로젝트를 해서 많은 기능을 넣어야 한다면 어떻게 할까?
기능이 점점 추가되서 프로그램이 커지면 많은 클래스가 등장하면서 관련된 기능끼리 묶어서 사용하고 싶을 것이다. 컴퓨터는 보통 파일을 분류하기 위해 디렉토리의 개념을 사용하는데 자바에서는 파일을 분류하는 단위를 "패키지"라고 한다.

## 패키지 규칙()
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
접근 제어자를 명시하지 않으면 같은 패키지 안에서 호출을 허용하는 default 접근 제어자가 적용된다. default 라는 용어는 해당 접근 제어자가 기본값으로 사용되기 때문에 붙여진 이름이지만, 실제로는 package-private이 더 정확한 표현이다.
해당 접근 제어자를 사용하는 멤버는 동일한 패키지 내의 다른 클래스에서만 접근이 가능하기 때문이다.

**접근 제어자의 사용 위치**
접근 제어자는 필드와 메서드, 생성자에 사용된다.
++ 클래스 레벨에도 일부 접근 제어자의 사용이 가능하다.

**접근제어자 예시**
```java
public class Speaker {
  private int volume; // 필드
  public Speaker(int volume){} // 생성자
  public void volumeUp(){} // 메서드
  public void volumeDown(){} // 메서드
  public void showVolume(){} // 메서드
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
캡슐화(Encapsulation)은 객체 지향 프로그래밍의 중요한 개념 중 하나이다. 캡슐화는 데이터와 해당 데이터를 처리하는 메서드를 하나로 묶어서 외부에서의 접근을 제한하는 것을 말한다. 캡슐화를 통해 데이터의 직접적인 변경을 방지하거나 제한할 수 있다.
다시 말하면, 속성과 기능을 하나로 묶고, 외부에 필요한 기능만 노출하고 나머지는 모두 내부로 숨기는 것을 말한다.

1. **데이터를 숨겨라**
객체에는 속성(데이터)와 기능(method)가 있다. 캡슐화에서 가장 필수로 숨겨야 하는 것은 속성이다. Speaker의 volume을 생각하자. 객체 내부의 데이터를 외부에서 함부로 접근하게 두면 클래스 안에서 데이터를 다루는 모든 로직을 무시하고 데이터를 변경할 수 있다. 결국 모든 안전망을 빠져나가게 되는 것이다.

**객체의 데이터는 객체가 제공하는 기능인 메서드를 이용해야 한다.**

2. **기능을 숨겨라**
객체의 기능 중에서 외부에서 사용하지 않고 내부에서만 사용하는 기능들이 있다. 이런 기능도 모두 감추는 것이 좋다.
예를들어 자동차를 운전하기 위해 자동차가 제공하는 복잡한 엔진 조절 기능, 배기 기능까지 우리가 다 알 필요는 없다. 우리는 단지 엑셀과 핸들 정도의 기능만 알면 된다.
사용자에게 필요하지 않은 기능까지 모두 알려준다면, 사용자가 자동차에 대해 너무 많은 것을 알아야 한다. 사용자 입장에서 꼭 필요한 기능만 외부에 노출하고 나머지 기능은 모두 내부로 숨기는 것이 좋다.




