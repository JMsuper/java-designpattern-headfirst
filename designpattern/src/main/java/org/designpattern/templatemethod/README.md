### 템플릿 메서드
메소드에서 알고리즘의 골격을 정의한다. 

알고리즘의 여러 단계 중 일부는 서브클래스에서 구현할 수 있다. 

템플릿 메소드를 이용하면 알고리즘의 구조는 그대로 유지하면서 서브클래스에서 특정 단계를 재정의할 수 있다.

예제 소스코드는 Comparable 인터페이스의 compareTo를 재정의한 것이다.

<image width=400 height=400 src="https://private-user-images.githubusercontent.com/80041449/293577812-7daa07f8-04ab-4165-825d-09a3ede30e43.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQxMDE0NjAsIm5iZiI6MTcwNDEwMTE2MCwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1Nzc4MTItN2RhYTA3ZjgtMDRhYi00MTY1LTgyNWQtMDlhM2VkZTMwZTQzLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA5MjYwMFomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTI1NmUxNGZlOGNmNWRjODQ3MjlmMjQ5Njk3MTc4NWMxMGE4NGQ0ZmE4ZTU3MjgyM2NiODYwYTRjNjI5ZWFhY2UmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.wxInBXiLJ2RzQYCgZDCJqdj4Dhd0Y5W8Ua5DoXX_x9o">

- 얻는 것
    - 템플릿 코드를 변경하지 않고, 내부의 특정 부분의 구체적인 알고리즘만 변경할 수 있다.
    - 즉, 템플릿 메서드에 있는 내부 메서드들의 순서는 유지하면서 변경 가능하다.
- 잃는 것
    - 구조가 복잡해질 수록 템플릿 메서드의 형식을 유지하기 어려워진다.
