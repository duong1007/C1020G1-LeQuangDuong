package model.bean;

public class Contract {
    private Integer id;
    private String startDate;
    private String endDate;
    private String deposit;
    private String total;
    private String employee;
    private String customer;
    private String service;

    public Contract(String startDate, String endDate, String deposit, String total,
                    String employee, String customer, String service) {
        this.startDate = startDate;
        this.endDate = endDate;
        this.deposit = deposit;
        this.total = total;
        this.employee = employee;
        this.customer = customer;
        this.service = service;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDeposit() {
        return deposit;
    }

    public void setDeposit(String deposit) {
        this.deposit = deposit;
    }

    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public String getEmployee() {
        return employee;
    }

    public void setEmployee(String employee) {
        this.employee = employee;
    }

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public String getService() {
        return service;
    }

    public void setService(String service) {
        this.service = service;
    }
}
