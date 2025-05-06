//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
      try {
          EmployeeDao employeeDao= new EmployeeProxy();
          employeeDao.get("CLIENT",123);
          System.out.println("fetching full created");
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }
    }
}