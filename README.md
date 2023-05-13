# SpringBoot-Photostagram
### 스프링 부트 + SNS 커뮤니티 사이트
![image](https://user-images.githubusercontent.com/111489868/234818706-7a3d5d16-7bf7-4f30-b681-aefc4f563a6e.png)

## 🖥️  프로젝트 소개 
인스타그램을 참고하여 다양한 사람들과 사진과 동영상 등 시각적인 콘텐츠로 일상을 공유하고, <br><br>유저 간 채팅을 통해 소통할 수 있는 웹 공간 내 작은 소셜 미디어 플랫폼을 만들고 싶었습니다.
<br>
<br>
유튜브 시연영상 : [유튜브 시연영상 보러가기](https://www.youtube.com/watch?v=4bwgKEtKQTU&list=PLdNUPp-e20Fs1uU6FnW8bYvA6bnGarajD)  
  
## ⚙️ Architecture
![image](https://user-images.githubusercontent.com/111489868/235429335-a5ed5fc5-cfc4-45b0-8907-dbd1477a896b.png)

## ERD
![image](https://user-images.githubusercontent.com/111489868/235422148-4b622412-c095-4a8e-819d-839605b5a20f.png)

## 🧑‍ 참여 인원
 -  팀장 박가영(coding0818@gmail.com)
 - 팀원1 조주영(jojuyeong03@gmail.com)
 - 팀원2 조광호(jgh0609@gmail.com)
 - 팀원3 김진우(kimwoo232800@naver.com)
 - 팀장4 이왕근(wanggeuni37@gmail.com)
## 🕰️ 개발 기간
 - 23.2.28일 ~ 23.4.14일
 
### 🧑‍🤝‍🧑 멤버 구성
 -  팀장 박가영 : - ERD작성, 검색, 게시물업로드, 알림 서비스, 게시물 수정&삭제, 실시간 채팅, 통합 및 형상관리
 - 팀원1 조주영 : - 프로필, 프로필 수정, 비밀번호 변경, 회원 탈퇴, 내 활동 좋아요/댓글, PPT제작
 - 팀원2 조광호 : - 메인 페이지 콘텐츠 및 기능, 구독(팔로잉)게시글 조건 노출, 통합 및 형상관리
 - 팀원3 김진우 : - 로그인, 회원가입, 아이디 찾기, 비밀번호 찾기, 실시간 채팅
 - 팀장4 이왕근 : - 게시물 상세보기 기능 구현, 탐색 탭 화면/기능 구현

### ⚙️ 개발 환경
 - `Java 11` `JavaScript ES 6` `thymeleaf`
 - **IDE** : `IntelliJ IDEA Community Edition 2022.3.1`, `HeidiSQL`
 - **Framework** : `Spring Boot(2.7.10-SNAPSHOT)`
 - **DataBase** : `MySQL 8.0 (서비스 환경 : Maria DB 5.5.68)`
 - **ORM** : `Mybatis`
 - **형상관리** : `Git 2.37.2`
 - **배포** : `AWS EC2`
## 📌 주요 기능
#### 로그인
 - 회원, 비회원 구분
 - ID, PW 찾기
 - 아이디 기억하기
#### 회원가입
 - 아이디, 이메일, 이름 중복 검사
 - 아이디, 이메일, 이름, 비밀번호 유효성 검사
 - 이메일 코드 발송
#### 사진 및 동영상 업로드
 - 사진 & 동영상, 컨텐츠(내용) 및 해시태그 구분 업로드
 - 사진 클릭으로 계정 태그
#### 메인 페이지 - [[메인페이지 상세보기]](https://github.com/JGwanghou/Photostagram_/wiki/%EA%B8%B0%EB%8A%A5%EC%86%8C%EA%B0%9C(%EB%A9%94%EC%9D%B8%ED%8E%98%EC%9D%B4%EC%A7%80))
 - 구독자 콘텐츠만 조건 노출 
 - 게시글 좋아요 / 댓글 남기기 / 댓글 좋아요 / 답글 남기기 커뮤니티 활동
 - 팔로잉(구독) 추천 유저 리스트
#### 콘텐츠 상세보기
 - 게시물 삭제, 수정
 - 콘텐츠 요소 출력(이미지,동영상) 출력
 - 커뮤니티(댓글/답글, 좋아요) 출력
#### 실시간 채팅
 - websocket을 이용한 실시간 채팅
 - 자신이 속한 채팅방만 입장 가능
#### 검색
 - 해시태그 & 계정 검색
 - 검색 기록 삭제
#### 회원 프로필
- 회원 정보, 업로드 게시물이 있는 개인 화면 출력
- 회원 정보 수정 화면 정보 출력, 변경
- 회원 비밀번호 변경
- 회원 탈퇴
#### 팔로우, 팔로잉
- 프로필 내에서 팔로우, 언팔로우
- 팔로우, 언팔로우 목록 출력
