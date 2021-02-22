package model.bean;

public class ContractDetail {
    private Integer id;
    private String contractID;
    private String attackService;
    private int quantity;

    public ContractDetail(String contractID, String attackService, int quantity) {
        this.contractID = contractID;
        this.attackService = attackService;
        this.quantity = quantity;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getContractID() {
        return contractID;
    }

    public void setContractID(String contractID) {
        this.contractID = contractID;
    }

    public String getAttackService() {
        return attackService;
    }

    public void setAttackService(String attackService) {
        this.attackService = attackService;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}
