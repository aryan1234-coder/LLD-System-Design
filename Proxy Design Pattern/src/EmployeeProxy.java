public class EmployeeProxy implements EmployeeDao{

    EmployeeDao employeeDao;

    EmployeeProxy() {
        employeeDao = new EmployeeDaoImpl();
    }

    public void create(String client,EmployeeDo employeeDo) throws Exception{

        if(client.equals("ADMIN")) {
            employeeDao.create(client, employeeDo);
            return;
        }
        throw new Exception("Access denied");
    }
    public void delete(String client,int employeeId) throws Exception{
        if(client.equals("ADMIN")) {
            employeeDao.delete(client, employeeId);
            return;
        }
        throw new Exception("Access denied");
    }
    public EmployeeDo get(String client, int employeeId) throws Exception{
        if(client.equals("ADMIN") || client.equals("EMPLOYEE")) {
            return employeeDao.get(client, employeeId);
        }
        throw new Exception("Access denied");
    }

}
