package application;

import javafx.scene.control.Label;
import javafx.event.ActionEvent;

public class Player {

	int maxCustomers = 1;
	


	private int money = 0;


    public void setMoney(int money) {
        this.money = money;
    }
    public int getMoney() {
        return money;
    }

    public void increaseMoney()
    {
        setMoney(getMoney() + 5);
    }
    
    public int getMaxCustomers() {
		return maxCustomers;
	}
	public void setMaxCustomers(int maxCustomers) {
		this.maxCustomers = maxCustomers;
	}
}
