//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Hello {
    public static void main(String[] args) {
        System.out.println("Hello world");
        MemberDAO dao = new MemberDAO();
        dao.insert();
        dao.update();

        DeptDAO dDao = new DeptDAO();
        dDao.insert();
        dDao.update();
    }
}