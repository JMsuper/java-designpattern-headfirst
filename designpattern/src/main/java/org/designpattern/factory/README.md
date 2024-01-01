### 팩토리 메서드

객체를 생성하기 위한 인터페이스를 정의하는데, 어떤 클래스의 인스턴스를 만들지는 서브클래스에서 결정하게 만든다. 

팩토리 메서드 패턴을 이용하면 클래스의 인스턴스를 만드는 일을 서브클래스에게 맡기는 것이다.

<image width=700 height=400 src="https://private-user-images.githubusercontent.com/80041449/293573347-69e3b74d-775d-4ad8-8969-b0b017ca8f23.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTM5OTksIm5iZiI6MTcwNDA5MzY5OSwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzMzNDctNjllM2I3NGQtNzc1ZC00YWQ4LTg5NjktYjBiMDE3Y2E4ZjIzLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA3MjEzOVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTMzYTA1NjNmYzg2YjU0YjcwYTgyNjQ4ZWViMzQ1MTU5NDlhNGU5NzQ5YjhmMTgyOWJhNDdjN2QzMDQxMDYyMTYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.N5Hxxp5TpugCzzKtqcJPNEe5AEpIcL5PIHNDdYFreNc">

- 얻는 것
    - 제품을 생산하는 부분과 사용하는 부분을 분리시킨다.
    - 객체에 대한 사전 지식없이, 팩토리를 통해 객체를 생성할 수 있다.
- 잃는 것
    - 클래스 계층의 복잡도를 증가 시킬 수 있다.
