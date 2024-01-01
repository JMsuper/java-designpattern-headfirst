### 커맨드
    
요구사항을 객체로 캡슐화하며, 매겨변수를 써서 여러 가지 다른 요구 사항을 집어넣을 수 있다. 

또한 요청 내역을 큐에 저장하거나 로그로 기록할 수 있으며, 작업취소 기능도 지원 가능하다.

<image width=650 height=400 src = "https://private-user-images.githubusercontent.com/80041449/293575919-e2c66d86-c317-415a-b92d-128e820cedc4.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTg4MjcsIm5iZiI6MTcwNDA5ODUyNywicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzU5MTktZTJjNjZkODYtYzMxNy00MTVhLWI5MmQtMTI4ZTgyMGNlZGM0LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA4NDIwN1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWExOTljMzRhOTQ1N2FhMzFjMjBjZTU0Njc3MGY4MjU1OWFlOTFlYjhlNGE4MTJlMjU2MjFmYWJkYWExYTkwZWQmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.HgId6MsBPWdZZLaiJ014GUexEjdyCHX57MLXAKVP4bQ">

- 얻는 것
  - 오퍼레이션의 실제 실행과 오퍼레이션을 실행하는 실행자를 분리할 수 있다.
  - 기존 코드를 수정하지 않고, 새롭게 커맨드를 추가할 수 이다.
- 잃는 것
  - 클래스와 오브젝트가 많아지며, 각각의 커맨드가 어떤 커맨드인지 주의해서 다뤄야 한다.
  - 커멘드의 함수 시그내처가 모두 동일하여, 어떤 동작을 수행하는지, 호출자는 알 수 없다.
