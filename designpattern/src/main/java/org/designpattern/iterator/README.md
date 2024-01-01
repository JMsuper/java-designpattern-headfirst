### 이터레이터
컬렉션 구현 방법을 노출시키지 않으면서도, 

그 집합체 안에 들어있는 모든 항목에 접근할 수 있게 해주는 방법을 제공한다.

<image width=600 height=400 src="https://private-user-images.githubusercontent.com/80041449/293578247-9bab3147-540d-4d35-a4ef-9ef4a504cc4e.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQxMDIxMDgsIm5iZiI6MTcwNDEwMTgwOCwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzgyNDctOWJhYjMxNDctNTQwZC00ZDM1LWE0ZWYtOWVmNGE1MDRjYzRlLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA5MzY0OFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTJjOWNmY2QzNDFhYzE1NmE5OTA0MTNmMmI4ZjUzMDU1ZjkwYThmMWVhNjk1MGZjYmQyNzQyYTZjMGJiYTMwMWUmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.zGb02AJd8wPTyFucTCBhVDcmEASHBWRZxoPlr6ftINg">

- 얻는 것
    - 클래스 내부 컬렉션 구현체를 알 필요가 없으며, OCP 원칙을 얻는다.
    - 내부 컬렉션이 변경되어도, 반복자를 사용하는 코드는 변경되지 않는다.
- 잃는 것
    - 정말 필요한 것인지 고민해봐야 하며, 필요하다면 java api를 활용하자.
    - 작은 어플리케이션에서는 과도한 설계일 수 있다.
