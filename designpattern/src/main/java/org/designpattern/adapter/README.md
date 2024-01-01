### 어댑터
한 클래스의 인터페이스를 클라이언트에서 사용하고자 하는 다른 인터페이스로 변환한다. 

어댑터를 이용하면 인터페이스 호환성 문제 떄문에 같이 쓸 수 없는 클래스들을 연결해서 쓸 수 있다.

<image width=700 height=400 src="https://private-user-images.githubusercontent.com/80041449/293576296-85c655aa-196a-4579-94c3-b486411c23bd.png?jwt=eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc3MiOiJnaXRodWIuY29tIiwiYXVkIjoicmF3LmdpdGh1YnVzZXJjb250ZW50LmNvbSIsImtleSI6ImtleTUiLCJleHAiOjE3MDQwOTkzMjksIm5iZiI6MTcwNDA5OTAyOSwicGF0aCI6Ii84MDA0MTQ0OS8yOTM1NzYyOTYtODVjNjU1YWEtMTk2YS00NTc5LTk0YzMtYjQ4NjQxMWMyM2JkLnBuZz9YLUFtei1BbGdvcml0aG09QVdTNC1ITUFDLVNIQTI1NiZYLUFtei1DcmVkZW50aWFsPUFLSUFWQ09EWUxTQTUzUFFLNFpBJTJGMjAyNDAxMDElMkZ1cy1lYXN0LTElMkZzMyUyRmF3czRfcmVxdWVzdCZYLUFtei1EYXRlPTIwMjQwMTAxVDA4NTAyOVomWC1BbXotRXhwaXJlcz0zMDAmWC1BbXotU2lnbmF0dXJlPTFlMDE0MzM3M2E5ZTg1MjRlODk5OWQzYmUxODY0MTgyZGY2NDY5Njg5NzU3ZjRhNDI5OTFhMzVhNjEzMGI5NGMmWC1BbXotU2lnbmVkSGVhZGVycz1ob3N0JmFjdG9yX2lkPTAma2V5X2lkPTAmcmVwb19pZD0wIn0.MjGdnXdO8SMHjQ3_Qe2FicCA_zLRtqls76GKWsSRoX8">

- 얻는 것
    - 기존 코드를 변경하지 않고, 다른 인터페이스에 적용될 수 있게 한다.
    - 기존 코드의 동작과 다른 인터페이스 지원을 분리한다.
- 잃는 것
    - 잘못 사용할 경우, 기존 코드를 수정하지 않고, 굳이 클래스를 추가하는 꼴이 될 수 있다.
