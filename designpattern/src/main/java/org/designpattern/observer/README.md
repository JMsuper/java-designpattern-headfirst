### 옵저버(Pub-Sub) 패턴

한 객체의 상태가 바뀌면 그 객체에 의존하는 다른 객체들한테 연락이 가고,

자동으로 내용이 갱신되는 방식으로 일대다(one-to-many) 의존성을 정의한다.

<image src="https://private-user-images.githubusercontent.com/80041449/293572478-4420ca84-3a2b-46e6-9f61-6867bc69462b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTI4OTAsIm5iZiI6MTcwNDA5MjU5MCwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzI0NzgtNDQyMGNhODQtM2EyYi00NmU2LTlmNjEtNjg2N2JjNjk0NjJiLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA3MDMxMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWIyODQwYTU4M2M5Mjg1OTQ4ZTZkZmU3YTM2N2FlNTE4NTE0ZmUyOTdkOWU5ZmNmYWEyYmQ5MmIzNDAyNmFjODgmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.VnqwIXxAOIq8zlgwHyRaeeF-1ToCwxNDlWX32ArTb80">

- 얻는 것
    - Publisher에서는 옵저버(Subscriber)들이 인터페이스를 구현했다는 것을 제외하면 옵저버에 대해 전혀 모르기 때문에, 이들 사이의 느슨한 결합이 가능하다.
- 잃는 것
    - 다수의 옵저버 객체 등록이 후 해지하지 않을 경우, 메모리 누수가 발생할 수 있다.
    - 옵저버들한테 연락을 돌리는 순서에 절대로 의존해서는 안된다.
