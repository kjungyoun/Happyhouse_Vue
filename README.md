관통 프로젝트 제출 방법

# 📌 관통프로젝트: HappyHouse_Vue
### 📆 제출일: 2021.5.18
### 👨‍👦‍👦 참여 페어
- 김정윤(Vue.js), 박규동(Spring)

### 처리된 요구사항 목록
  
|난이도|구현기능|세부|작성여부(O/X)|
|:---:|---|---|:---:|
|기본|QnA 게시판 Vue를 적용한 웹페이지|게시글목록|o|
|기본|QnA 게시판 Vue를 적용한 웹페이지|게시글등록|o|
|기본|QnA 게시판 Vue를 적용한 웹페이지|게시글수정|o|
|기본|QnA 게시판 Vue를 적용한 웹페이지|게시글검색|o|
|기본|서버측 구현|게시글 등록|o|
|기본|서버측 구현|게시글 수정|o|
|기본|서버측 구현|게시글 삭제|o|
|기본|서버측 구현|게시글 상세검색|o|
|기본|서버측 구현|게시글 목록|o|
|추가|동네 업종 정보 조회||X|
|추가|동네 환경 점검 정보 조회||X|
|심화|메인페이지 or 추가 기능||X|

<span style="color:red">
* 작성된 기능은 반드시 캡쳐되어야 합니다.(GUI 실행화면, 콘솔 출력 등)<br>
* 추가로 구현한 기능을 표에 추가시키세요.
</span>

### 📌 실행화면 캡쳐 - 
TODO: 요구사항 목록에서 완료 처리된 사항의 캡쳐 이미지를 등록하세요.

✏️ 구현 기능: QnA 게시판 Vue를 적용한 웹페이지

### 1. QnA 목록

- QnA를 클릭하면 제일 첫 화면으로 아래와 같은 화면이 뜬다.

<img width="2558" alt="스크린샷 2021-05-18 오후 9 16 58" src="https://user-images.githubusercontent.com/48318620/118650731-baa7fb00-b81f-11eb-82dc-8b8db2bededc.png">

### 2. QnA 상세

- QnA 목록에서 제목을 클릭하면 아래와 같이 해당 게시글의 세부 정보를 볼 수 있고 이 곳에서 수정 & 삭제가 가능하다.
- 원래는 세션에서 로그인 정보를 가지고 와서 현재 로그인한 id와 작성자가 동일 할 때만 수정, 삭제 버튼을 보이게 구현하려고 하였으나 Vue에서 세션 정보를 가지고 오는 것을 구현하지 못해서 해당 기능은 미완성 되었다.
- 따라서 아래처럼 보일때도 안보일 때도 있다.

![스크린샷 2021-05-18 오후 9 30 29](https://user-images.githubusercontent.com/48318620/118651237-4ae64000-b820-11eb-9e4e-2964dc417404.png)

![스크린샷 2021-05-18 오후 9 39 50](https://user-images.githubusercontent.com/48318620/118652482-99e0a500-b821-11eb-8f35-c61f8dd42430.png)

### 3. QnA 수정

- 수정 버튼을 클릭하면 아래와 같이 수정할 수 있는 폼이 나오고 제대로 수정이 된다.

![스크린샷 2021-05-18 오후 9 41 40](https://user-images.githubusercontent.com/48318620/118652751-dad8b980-b821-11eb-918a-eef89dab1dcc.png)


### 4. 게시글 검색

- 아래 보이는 것과 같이 작성자 또는 제목으로 검색하여 검색 버튼을 클릭하면 검색이 된다.

![스크린샷 2021-05-18 오후 9 37 10](https://user-images.githubusercontent.com/48318620/118652124-3a829500-b821-11eb-9d1a-6fda18f3d6d7.png)

### 5. 게시글 삭제

- 삭제 버튼을 클릭하면 아래와 같이 팝업창이 뜨고 삭제가 된다.

<img width="640" alt="스크린샷 2021-05-18 오후 9 18 51" src="https://user-images.githubusercontent.com/48318620/118652854-f47a0100-b821-11eb-8c72-6a8fff6bdfd3.png">

<img width="647" alt="스크린샷 2021-05-18 오후 9 19 00" src="https://user-images.githubusercontent.com/48318620/118652867-f774f180-b821-11eb-99c5-528a33851769.png">

## 구현 정도

- 서버측은 완벽하게 구현하였으나 Vue와 Spring을 연결하지 못해 세션 정보를 가져오는 것에 대한 다른 시도를 하지 못했다.
- Vue에서 기능적인 부분은 완벽하게 동작하지만 로그인 유무에 따라 수정, 삭제 버튼이 보이고 안보이고의 기능은 구현하지 못했다.
- Vue를 위한 jsp 파일에서 부트 스트랩 템플릿까지 적용하였지만 연결이 불가능하였다.

