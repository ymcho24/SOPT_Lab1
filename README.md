# SOPT_Lab1_성장과제2(수정)

▶ RegisterActivity에서 가입 완료 인텐트를 보낼 때, startActivity를 사용하지 않고 setResult를 통해 인텐트를 전달하는 것으로 수정하면서
회원가입 후 바로 자동로그인 되지 않고 로그인 창에 머무르는 오류 발생

해결방법 : 

onActivityResult 메소드에 
if ((resultCode == Activity.RESULT_OK) && (App.prefs.myEditText != "")) {
            Toast.makeText(this, "자동 로그인", Toast.LENGTH_LONG).show()
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2) 
            }
구문 추가

참고 : https://blog.naver.com/shin_soosoo/221483248205
