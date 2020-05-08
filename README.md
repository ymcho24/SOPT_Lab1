# SOPT_Lab1_성장과제2(수정)

▶ 성장과제2 수정

1) 로그인 창이 더이상 필요없어지는 부분에서 해당 창을 finish()하여 종료했습니다.

2) RegisterActivity에서의 가입완료 인텐트를 setResult를 통해 전달할 수 있도록 수정했습니다.

▶ RegisterActivity에서 가입 완료 인텐트를 보낼 때, startActivity를 사용하지 않고 setResult를 통해 인텐트를 전달하는 것으로 수정하면서 회원가입 후 바로 자동로그인이 되지 않고 로그인 창에 머무르는 오류가 발생했습니다.

해결방법 : 

onActivityResult 메소드에 
if ((resultCode == Activity.RESULT_OK) && (App.prefs.myEditText != "")) {
            Toast.makeText(this, "자동 로그인", Toast.LENGTH_LONG).show()
            val intent2 = Intent(this,MainActivity::class.java)
            startActivity(intent2) 
            }
            
구문을 추가하여 해결했습니다.

참고 : https://blog.naver.com/shin_soosoo/221483248205

감사합니다!
