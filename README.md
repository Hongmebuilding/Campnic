# Campnic - JPA, Thymeleaf 프로젝트

## Team
**이수민**(팀장) : 
캠핑용품(유저), 캠핑용품 (관리자), 날씨api<br/>
**남기문** : 
캠핑(유저), 캠핑(관리자), 쿠폰 등록, 포인트 적립<br/>
**박찬미** : 
권한인증/인가, QnA, 로그인api, 헤더/메인, 마이페이지

> 개발기간 2023-03-20 ~ 2023-04-10

## 기술 스택 ##

에디터 : IntelliJ</br>
개발 툴 : SpringBoot 3.0.4</br>
자바 : JAVA 17</br>
빌드 : Maven 4.0</br>
서버 : localhost</br>
데이터베이스 : MySql</br>
필수 라이브러리 : SpringBoot Web, MySQL, Spring Data JPA, Lombok, Spring Security6.0, Spring Boot DevTools, Thymeleaf, Validation 

## 개발환경 

[![HTML5](https://img.shields.io/badge/HTML5-E34F26?style=flat-square&logo=html5&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/HTML)
[![CSS3](https://img.shields.io/badge/CSS3-1572B6?style=flat-square&logo=css3&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/CSS)
[![JavaScript](https://img.shields.io/badge/JavaScript-F7DF1E?style=flat-square&logo=javascript&logoColor=black)](https://developer.mozilla.org/en-US/docs/Web/JavaScript)
[![jQuery](https://img.shields.io/badge/jQuery-0769AD?style=flat-square&logo=jquery&logoColor=white)](https://jquery.com/)
[![JSON](https://img.shields.io/badge/JSON-000000?style=flat-square&logo=json&logoColor=white)](https://www.json.org/json-en.html)
[![Ajax](https://img.shields.io/badge/Ajax-336791?style=flat-square&logo=ajax&logoColor=white)](https://developer.mozilla.org/en-US/docs/Web/Guide/AJAX)
[![Bootstrap](https://img.shields.io/badge/Bootstrap-7952B3?style=flat-square&logo=bootstrap&logoColor=white)](https://getbootstrap.com/docs/3.4/)
[![Java](https://img.shields.io/badge/Java-007396?style=flat-square&logo=java&logoColor=white)](https://www.java.com/)
[![Spring](https://img.shields.io/badge/Spring-6DB33F?style=flat-square&logo=spring&logoColor=white)](https://spring.io/)
[![Spring Security](https://img.shields.io/badge/Spring_Security-6DB33F?style=flat-square&logo=spring&logoColor=white)](https://spring.io/projects/spring-security)
[![Maven](https://img.shields.io/badge/Maven-C71A36?style=flat-square&logo=apache-maven&logoColor=white)](https://maven.apache.org/)
[![JDBC](https://img.shields.io/badge/JDBC-007ACC?style=flat-square&logo=jdbc&logoColor=white)](https://docs.oracle.com/en/database/oracle/oracle-database/19/jjdbc/introducing-JDBC.html)
[![MySQL](https://img.shields.io/badge/MySQL-4479A1?style=flat-square&logo=mysql&logoColor=white)](https://www.mysql.com/)
[![JPA](https://img.shields.io/badge/JPA-3498DB?style=flat-square&logo=jpa&logoColor=white)](https://docs.oracle.com/javaee/6/tutorial/doc/bnbpz.html)
[![IntelliJ IDEA](https://img.shields.io/badge/IntelliJ_IDEA-000000?style=flat-square&logo=intellij-idea&logoColor=white)](https://www.jetbrains.com/idea/)
[![Apache Tomcat](https://img.shields.io/badge/Apache_Tomcat-F8DC75?style=flat-square&logo=apache-tomcat&logoColor=black)](http://tomcat.apache.org/)
[![Lombok](https://img.shields.io/badge/Lombok-BC2E86?style=flat-square&logo=lombok&logoColor=white)](https://projectlombok.org/)
[![Thymeleaf](https://img.shields.io/badge/Thymeleaf-005F0F?style=flat-square&logo=thymeleaf&logoColor=white)](https://www.thymeleaf.org/)
	
## 프로젝트
📺 프로젝트 메인페이지
![image](https://github.com/namgimun99/Campnic/assets/124684039/1d92e361-ce2b-4a3e-ae17-544c08b40b14)


## 🔍 프로젝트 특징 및 기능
- 웹 사용자는 캠핑장 예약과 캠핑용품을 대여할 수 있고, 관리자가 되어 캠핑장과 캠핑용품점을 등록하여 사업할 수 있습니다. 최상위 관리자는 권한과 서비스지역을 관리합니다.
- Spring Framework를 이용해 더 편리하고 쉽게 개발하였습니다.
- 주요 개발 기능
    - 회원가입, 로그인, kakao 로그인
    - 지역 검색을 통해 원하는 지역의 캠핑장, 렌탈샵 찾기
    - 캠핑 예약 및 렌탈 요청
    - 예약 후 쿠폰 번호 발급 및 사용시 포인트 적립, 발급되지 않은 쿠폰번호이거나 이미 사용한 쿠폰 번호일시 X
    - Qna 작성 가능
    - 캠핑장 또는 렌탈 예약날짜가 지났을 시 취소 불가 그 외에는 취소 가능
    
  
  **일반유저**</br>
  - 캠핑장 등록이나 렌탈샵 등록을 할 수 있는 권한 요청
  
 
  **렌탈 관리자 권한을 가진 유저**</br>
  - 관리자가 만들어 놓은 지역 내 본인의 렌탈샵 등록
  - 본인의 회사 등록 후 렌탈 아이템 등록, 수정, 삭제

 
  **캠핑 관리자 권한을 가진 유저**</br>
  - 관리자가 만들어 놓은 지역 내 본인의 캠핑장 등록
  - 캠핑장 내부에 존재하는 구역 등록, 수정, 삭제


  **최상위 관리자**</br>
  - 일반유저가 관리자 권한을 요청 시 승인/거부 할 수 있음
  - 적절치 못한 Qna 삭제 가능
  - Qna 공지글 작성 시 맨 위에 나오도록 처리
  - 캠핑장이나 렌탈샵을 등록할 수 있는 지역 등록
  - 허위 캠핑장이나 렌탈샵 삭제 가능
</br>

📋 ERD 및 로직 프로세스
![image](https://github.com/namgimun99/Campnic/assets/124684039/796e2963-dc85-4cd6-814e-2d13c06a8e58)

![image](https://github.com/namgimun99/Campnic/assets/124684039/6914ed06-9bc1-48ce-b998-48f18d37d94b)

