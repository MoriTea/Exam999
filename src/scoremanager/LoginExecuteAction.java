package scoremanager;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.School;
import bean.Teacher;
import tool.Action;

public class LoginExecuteAction extends Action{

	@Override
	public void execute(HttpServletRequest req, HttpServletResponse res) throws Exception {
		//ローカル変数の宣言 1
		String url = "";

		Teacher teacher = new Teacher();
		School school = new School();

		//リクエストパラメータ―の取得 2
		String id = req.getParameter("id");
		String password = req.getParameter("password");
		String name = req.getParameter("namae");
		String school_cd = req.getParameter("school_cd");

		//DBからデータ取得 3
		//なし
		//ビジネスロジック 4

		teacher.setId(id);
		teacher.setPassword(password);
		teacher.setName(name);

		school.setCd(school_cd);
		school.setName("大宮校");

		teacher.setSchool(school);//School型

		// 認証済みフラグを立てる
		teacher.setAuthenticated(true);

		//Sessionを有効にする
		HttpSession session = req.getSession(true);
		//セッションに"user"という変数名で値はTeacher変数の中身
		session.setAttribute("user", teacher);

		//DBへデータ保存 5
		//なし
		//レスポンス値をセット 6
		//なし
		//JSPへフォワード 7
		//req.getRequestDispatcher("main/Menu.action").forward(req, res);

		//リダイレクト
		url = "main/Menu.action";
		res.sendRedirect(url);
	}

}
