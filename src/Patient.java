public class Patient {

    private String firstName;
    private String lastName;
    private String phn;
    private String email;
    private String phone;
    private String address;
    private Pharmacist pharmacist;

    public Patient(String firstName, String lastName, String phn, String email, String phone, String address, Pharmacist pharmacist){
        this.firstName = firstName;
        this.lastName = lastName;
        this.phn = phn;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.pharmacist = pharmacist;

    }

    public String toString(){
        return this.firstName + " " + this.lastName;
    }

    public boolean equals(Patient otherPat){
        if(otherPat.phn.equals(this.phn)){
            return true;
        }else{
            return false;
        }
    }




}
