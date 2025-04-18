public class EmployeeDo {

    int employeeId;
    String EMployeeName;
    String email;
    String phone;

    public EmployeeDo(int employeeId, String EMployeeName, String email, String phone) {
        this.employeeId = employeeId;
        this.EMployeeName = EMployeeName;
        this.email = email;
        this.phone = phone;
    }

    public EmployeeDo() {

    }

    public int getEmployeeId() {
        return employeeId;
    }
    public void setEmployeeId(int employeeId) {
        this.employeeId = employeeId;
    }

    public String getEMployeeName() {
        return EMployeeName;
    }
    public void setEMployeeName(String EMployeeName) {
        this.EMployeeName = EMployeeName;
    }
    public String getEmail() {
        return email;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public String getPhone() {
        return phone;
    }
    public void setPhone(String phone) {
        this.phone = phone;
    }
}

