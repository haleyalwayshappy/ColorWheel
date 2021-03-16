# ColorWheel

안드로이드 스튜디오 여러가지 메뉴를 리스트 뷰가 휠 방식으로 만들었다. 

참고 :https://www.youtube.com/watch?v=qI3BGn62bZk
      https://github.com/LukeDeighton/Wheel 
      
   *본인은 xml의 width,height를 수정에 휠을 하단에 배치했다. 
   *예제이므로 가운데로 보이게 했지만 xml 수정을 조금만 한다면 원하는 위치에 배치 할 수 있음
      

컬러휠 사용 법
유튜브 봐라 이게 짱임 https://www.youtube.com/watch?v=qI3BGn62bZk
하지만 영어를 싫어하는 사람들이 있을테니 번역까지는 아니고 방법을 서술해논다.

1. build.gradle(App)로 이동 // 나는 이거도 찾기 힘들었음  app -> build.gradle

2. dependencies{ 에다가 
implementation 'com.github.lukedeighton:wheelview:0.4.1'
입력! 
<유튭에는 compile이라고 쓰여있지만 그사람 영상에 보면 무슨 유머영상? 영상 나오면서 implementation으로 변경해서 입력함 >
3. sync now 해주면 완료! [ 1단계]

이제 activity_main.xml로 와서 예제와 같이 작성 해주면된다!
MainActivity.java 에서도 코드 작성 하면 끝!! 
[주석 달아놨으니 코드 참고]

+ 터치시 진동 효과
후에 추가 업로드 함
