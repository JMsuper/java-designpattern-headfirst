### 스테이트

객체의 내부 상태가 바뀜에 따라서 객체의 행동을 바꿀 수 있다. 

마치 객체의 클래스가 바뀐 것 같은 결과를 얻을 수 있다. 

각 상태를 클래스로 캡슐화함으로써 나중에 변경시켜야 하는 내용을 국지화할 수 있다.

<image width=700 height=300 src="https://private-user-images.githubusercontent.com/80041449/293579107-9c813510-5243-4e52-887c-8cf655da2866.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQxMDM0NTMsIm5iZiI6MTcwNDEwMzE1MywicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzkxMDctOWM4MTM1MTAtNTI0My00ZTUyLTg4N2MtOGNmNjU1ZGEyODY2LnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA5NTkxM1omWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTU1MmY4MDZiZDk0YjIzY2JiYzZkZGY4N2E4OTg2ZjFhYTFiYTIyNmI2NTA5MzEzZmZkM2VkZmVjZTZkMjc4MjYmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.qcgovcVi0AwrT8_PbsfC4mbjPBwMn8d70lk9L-tXT6s">

- 얻는 것
    - 실제 동작은 런타임에 결정되며, 쉽게 변경될 수 있다.
    - 상태 확장에 용이하다.
- 잃는 것
    - 각 상태별로 클래스가 필요하여, 관리할 대상이 많아진다.
    - 많은 객체가 있을 때 메모리를 과도하게 사용할 여지가 있다. 이 경우 싱글턴 객체를 생성하여 우회가능하다.
