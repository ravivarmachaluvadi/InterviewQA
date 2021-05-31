package sabre;


import java.util.List;

class Temparature {

    int temp;

    List<Customer> customers;

    Temparature(int temp, List<Customer> customers){
        this.temp=temp;
        this.customers=customers;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        int temp1 = this.temp;

            if ((this.temp != temp)) {
                 for (Customer customer : customers) {
                this.temp = temp;
                System.out.println("Hi " + customer.name + " temparature changed from " + temp1 + " to " + temp);
            }
        }
    }
}
