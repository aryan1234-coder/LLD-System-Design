public class EmployeeDaoImpl implements EmployeeDao {


    public void create(String client,EmployeeDo obj) throws Exception
    {
        System.out.println("Create ne wEmployee");
    }

    public void delete(String client,int employeeId) throws Exception{
        System.out.println("Delete ne wEmployee"+ employeeId);

    }
    public EmployeeDo  get(String client,int employeeId) throws Exception{
        System.out.println("Fetching data from employee" + employeeId);
        return new EmployeeDo(123,"Aryan","aryansachan2017@gmail.com","842395");

    }
}
