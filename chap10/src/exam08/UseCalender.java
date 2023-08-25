package exam08;

import java.text.SimpleDateFormat;
import java.util.Calendar; // 자바가 Calendar라는 참조자료형을 제공해주고 있음
import java.util.Date;

public class UseCalender {
	public static void main(String[] args) {
		//Calendar today = new Calendar(); //싱글톤으로 정의가 되어있어서 에러가 남.
		// Calendar(달력): 현재 날짜. => 필드가 많이 선언되어져 있음(static으로 선언되어짐)
		//현재 날짜와 시간은 정보가 달라지는 것이 아니기 때문에 하나의 인스턴스로부터 공유하고자 한다.
		// - 필요로하는 사람들한테 똑같은 영역을 쳐다볼 수 있게끔 자바는 그 환경을 제공해준다.
		Calendar today = Calendar.getInstance(); //따라서 메소드를 통해서 인스턴스를 생성할 수 있다. - 미리하나 생성해놓고 공유해서 사용한다고 생각
		//***싱글톤처럼 new로 인스턴스 생성하는 것을 막아주고 있다고 생각을 하면 된다. (실습처럼 완전히 동일하게 구현되어져 있는 것은 아니다.) - 매핑적인 기억
		//내부클래스의 localClass에서도 메소드를 통해서 반환받을 수 있었지만 반환되는 자료형이 달랐다.
		
		//new Calendar(); //정확하게 말하자면 추상클래스로 정의가 되어있어서 new를 할 수 없는 것이다.
		
		// 년, 월, 일 구하기 (현재 정보들이 출력된다.)
		int year = today.get(Calendar.YEAR);
		int month = today.get(Calendar.MONTH)+1; //월정보는 인덱스형태로 출력해줌. 따라서 +1
		//유의할 점) 이때 MONTH는 카운팅이 될 때 0부터 시작한다. => 따라서 +1을 해야 우리가 원하는 월을 인지할 수 있다.
		int day = today.get(Calendar.DATE);
		
		System.out.printf("%d년 %d월 %d일\n", year, month, day);
		
		// 시, 분, 초 구하기
		int hour = today.get(Calendar.HOUR_OF_DAY);// 0~23 //(Calendar.HOUR); => 12시 단위로 출력, 0~12
		//HOUR_OF_DAY: 24시의 표현단위로 시간을 출력해준다.
		int minute = today.get(Calendar.MINUTE);
		int second = today.get(Calendar.SECOND);
		
		System.out.printf("%d:%d:%d\n", hour, minute, second);
		
		// 요일 구하기
		String[] DAY_OF_WEEK = {"일", "월", "화", "수", "목", "금", "토"}; //배열의 참조변수 생성 및 초기화
		//요일에서 한글자만 출력하고 싶을 때 배열로 생성
		System.out.println("오늘은 " + DAY_OF_WEEK[today.get(Calendar.DAY_OF_WEEK)-1] + "요일 입니다.");
		//DAY_OF_WEEK => 숫자로 1부터 시작하여 요일의 정보를 나타내고 있다. 
		//               그렇기 때문에 배열로 값을 정의해놓았으면 -1을 해줘야 한다.
		
		
		
		// Date 자료형 - 날짜와 시간정보와 관련된 기능을 제공해주고 있다.
		Date now = new Date(); 
		System.out.println("현재 시간: " + now.toString()); 
		//세계 표준 시간의 포맷으로 하여 출력이 되어진다.
		System.out.println("현재 시간: " + now); 
		//값이 같을 수 밖에 없음. 호출안해줘도 자바가 내부적으로 .toString()으로 호출해줌
		//이렇게 출력하게 되면 직관적이지 않다.
		
		//우리가 보기 쉬운 형태로도 출력할 수 있다. => SimpleDateFormat
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy년 MM월 dd일 HH:mm:ss a"); //자동완성으로 추가하면 자바가 import도 해줌
		//괄호안에 보고싶은 포맷을 작성해주면 된다. => 대문자에 신경을 써줘야 한다.(다른거는 다 소문자인데 월, 시간이 대문자이다.)
		//오전오후인지 표시: a
		String date = sdf.format(now); //format에 들어갈 값은 Date로 날짜와 시간에 대한 정보이다. -> 반환되는 자료형은 String이다.
		System.out.println(date);
		
		//***Date와 SimpleDateFormat는 같이 사용하는 것으로 기억.
		
		// Calendar -> Date 변환 
		Date d1 = new Date(today.getTimeInMillis()); 
		
		
		// Date -> Calendar 변환
		Date d2 = new Date();
		
		Calendar cal = Calendar.getInstance();
		cal.setTime(d2); //현재 가지고 온 값으로 새롭게 셋팅을 해줌.
		//특정시간은 셋팅을 해서 그 시간부터 무언가를 체크를 하고 싶다고 할 때 이러한 코드를 작성한다.
		
		//기능변환에 대해서 이 기능들을 사용할 수도 있다.
		
		
	}
}


//Calendar 내부구현에서 디테일한 설명 (정확한 이유)
//Calendar클래스는 abstract class Calendar{}로 선언이 되어져 있다.
//                 여기에서 추상 메소드만 이 안에 있으면 인터페이스로 바꿔줄 수 있다. 
//                  -> abstract클래스가 무조건 추상메소드만 있어야 하는 것은 아니였음.
//추상메소드가 하나라도 있으면 추상클래스로 정의해야 한다. (반대일 경우 추상메소드가 없어도 추상클래스로 정의할 수 있음)
//abstract가 클래스에 붙어있으면 new를 할 수가 없다는 의미이다. (부모자료형으로만 사용하겠다는 의미)



//java.sql.Date => 데이터베이스에서 사용하는 그 date와 매핑을 시켜서 정의하고 있는 자료형이다.
//데이터베이스에서 date를 자바에서 삽입하거나 읽어올 때 이 자료형을 이용할 수 있도록 자바개발자들이 패키지 안에 별도로 정의를 해서 제공을 해주고 있다.
//java.util.Date => 자바에서 사용하고 있는 날짜 데이터
//Date들은 heap영역에 보관됨
//heap영역은 프로그램이 종료되면 사라짐
//=>하드디스크에 저장한다면 내가 지우기 전까지 보관되어 그 부분을 이용하면 좋다.(나중에 살펴볼 예정)
