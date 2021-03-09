package snackbar;


public class Snack {
    public static int maxId = 0;

    private int id;
    private String name;
    private int quantity;
    private double cost;
    private int machineId;

    public Snack(String name, int quantity, double cost, int machineId)
    {
        maxId++;
        id = maxId;
        this.name = name;
        this.quantity = quantity;
        this.cost = cost;
        this.machineId = machineId;
    }

    public int getId() 
    {
        return id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;
    }

    public double getCost()
    {
        return cost;
    }
    
    public void setCost(double cost)
    {
        this.cost = cost;
    }

    public int getMachineId()
    {  
        return machineId;
    }

    public void setMachineId(int machineId)
    {
        this.machineId = machineId;
    }

    public int getQuantity()
    {
        return quantity;
    }

    public int addQuantity(int quantityNumber)
    {
        return quantity = quantity+quantityNumber;
    }

    public void buySnack(int snackQuantity){
        quantity = quantity-snackQuantity;
    }

    public double totalCost(int quantityNumber){
        return quantityNumber*cost;
    }
}









