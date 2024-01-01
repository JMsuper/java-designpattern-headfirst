### 컴포지트

객체들을 트리 구조로 구성하여 부분과 전체를 나타내는 계층구조로 만들 수 있다. 

이 패턴을 이용하면 클라이언트에서 개별 객체와 다른 객체들로 구성된 복합 객체(composite)를 똑같은 방법으로 다룰 수 있다.

<image width=500 height=400 src="https://private-user-images.githubusercontent.com/80041449/293578776-47e80016-28ef-4514-917c-86d278916689.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQxMDI5NzIsIm5iZiI6MTcwNDEwMjY3MiwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1Nzg3NzYtNDdlODAwMTYtMjhlZi00NTE0LTkxN2MtODZkMjc4OTE2Njg5LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA5NTExMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTRlNWIxZjZkNjlhNTg0MTg1M2Y1NThhNzUwNjFiOTljY2JlZjI5MTg2Y2UxMmVhMzAzYzhmNmU2MmNlM2Y4ODAmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.Wb8kKlroZFzK-JXmdNk6ZblgiRW-OeVW7naJlSCCRJw">

- 얻는 것
    - 중첩된 구조를 나타내는데 효과적이며, 클라이언트는 컴포지트와 리프를 구분하지 않고 동일한 인터페이스로 다룰 수 있다.
    - 클라이언트 입장에서 다루기 쉽다.
- 잃는 것
    - 컴포넌트 인터페이스의 구현체를 만드는 것은 어려울 수 있다.
    - 만들어진 컴포넌트에 추가적인 기능이나 변경이 어렵다.
