### 전략 패턴
알고리즘군을 정의하고 각각을 캡슐화(인터페이스화)하여,  교환해서 사용할 수 있도록 만든다. 

클라이언트는 아래 QuackBehavior , FlyBehavior를 멤버 변수로 두고, 구현 알고리즘을 자유롭게 변경가능하다.

<image src="https://private-user-images.githubusercontent.com/80041449/293571683-fd0aee6a-2c6a-460f-ae50-9e4ff68111a1.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTE4NTksIm5iZiI6MTcwNDA5MTU1OSwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzE2ODMtZmQwYWVlNmEtMmM2YS00NjBmLWFlNTAtOWU0ZmY2ODExMWExLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA2NDU1OVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTBlYmNkYjM5ZjM0ZmQ1ZTdjY2RjZDcxOGU2ZGZmMGNkZTcwYTY5NzliMDEzMDhhMGFjMmQwMTMwOWE3ZTNhYzEmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.8TyAM7FciiwuKpt3lBvgsJePyfMSWpT4V8jfzKQocWA">

- 얻는 것
    - 알고리즘을 사용하는 클라이언트와는 독립적으로 알고리즘을 변경할 수 있다.
    - 즉, 새로운 전략을 추가해도 기존 코드를 변경하지 않는다.
- 잃는 것
    - 사용자(인터페이스를 멤버변수로 선언한 클래스)는 내부 알고리즘이 어떻게 동작하는지 알지 못한다.
    - 사용자는 전략 인터페이스에 대한 구현체에 대해 알고 있어야 한다.
