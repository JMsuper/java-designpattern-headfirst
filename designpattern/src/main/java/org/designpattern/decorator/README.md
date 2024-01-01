### 데코레이터
객체에 추가적인 요건을 동적으로 첨가한다. 

데코레이터는 서브클래스를 만드는 것을 통해서 기능을 유연하게 확장할 수 있는 방법을 제공함.

<image src = "https://private-user-images.githubusercontent.com/80041449/293572952-35bbd4d3-204a-4b78-924a-4c6ef053a69b.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTMzMTIsIm5iZiI6MTcwNDA5MzAxMiwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzI5NTItMzViYmQ0ZDMtMjA0YS00Yjc4LTkyNGEtNGM2ZWYwNTNhNjliLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA3MTAxMlomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPWRmYWI0ODZhYzNkYzljMjQ4ODk5ZWVlMGQxN2Y5Nzk0N2FmNjQ5M2EwMGJhOTE5M2NiZGVlYTdlODY2YzQzMzMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.JNYgDbNmHpH0Dd4hm7bsF07oDo3dRZKwZrnIT3uTy9s">

- 얻는 것
    - 상속을 사용하지 않고 위임을 사용하여, 디자인 유연성 면에서 좋다.
    - 새로운 클래스를 정의하지 않고, 기능을 (런타임에) 추가할 수 있다.
- 잃는 것
    - 특정 구상 구성요소(예제에서는 Beverage 추상 클래스의 구현체)의 타입을 활용하여 동작하는 코드에서는 데코레이터 패턴이 적절하지 않다.
    - 데코레이터가 너무 많으면 필요이상으로 복잡해질 수 있다.
