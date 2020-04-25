# SOPT_Lab1

※ 과제는 해당하는 branch에 업로드 했습니다.

▶ 기본과제1

가이드라인에 맞춰 연결점 연결해주고 그안에 꽉채워 작성할수있도록 match constraint 해준다
가로를 350dp 세로를 0dp로 해주면 가로길이에 맞춰서 1:1이 적용된다


▶ 기본과제2

참고 : https://blog.naver.com/rkdwnsdud555/220293816131

run/debug configurations-launch options에서 launch:를 specified activity로 변경해주고 
처음 실행시 메인화면으로 할 액티비티를 추가해줘야 login화면이 메인으로 뜬다.

.kt파일을 임의로 추가해줬을 경우 androidmanifest.xml 파일에 선언해줘야 한다.
선언해줄때는 main으로 하고싶은 액티비티에 <action android:name="android.intent.action.MAIN" /> 붙여주고
추가되는 액티비티에 공통적으로 <category android:name="android.intent.category.LAUNCHER" />가 있어야 한다.
이것들은 모두 <intent-filter>의 내용으로 넣어준다. (intent-filter없으면 오류)


▶ 성장과제1


▶ 성장과제2

앱이 시작될 때 prefs에 대해 적용될 수 있도록 manifest.xml에 android:name=".App" 해준다.
위치는 <application> 뒤 <activity> 앞 => label, icon 있는 곳에 선언해준다.

참고 : https://blog.naver.com/rain483/220812563378 (전체적인 흐름)
https://blog.yena.io/studynote/2017/12/18/Android-Kotlin-SharedPreferences.html (프리퍼런스 사용방법)

mainEt.setText(App.prefs.myEditText) => editText에 프리퍼런스 내용(값) 넣겠다, 설정하겠다
App.prefs.myEditText = mainEt.text.toString() => 프리퍼런스에 editText 값 넣겠다
