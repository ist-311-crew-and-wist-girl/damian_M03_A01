package ist311.usecases;

public class CheckBusiness {

    private String businessName = "";
    private String businessAddress = "";
    private String phoneNumber = "";
    private String timeOpen = "";
    private String timeClosed = "";
    private String businessBio = "";
    private String covidProtocols = "";

    public CheckBusiness(String businessName, String businessAddress, String phoneNumber,
                         String timeOpen, String timeClosed, String businessBio, String covidProtocols){
        this.businessName = businessName;
        this.businessAddress = businessAddress;
        this.phoneNumber = phoneNumber;
        this.timeOpen = timeOpen;
        this.timeClosed = timeClosed;
        this.businessBio = businessBio;
        this.covidProtocols = covidProtocols;

    }

    public String getBusinessName() {
        return businessName;
    }

    public void setBusinessName(String businessName) {
        this.businessName = businessName;
    }

    public String getBusinessAddress() {
        return businessAddress;
    }

    public void setBusinessAddress(String businessAddress) {
        this.businessAddress = businessAddress;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getTimeOpen() {
        return timeOpen;
    }

    public void setTimeOpen(String timeOpen) {
        this.timeOpen = timeOpen;
    }

    public String getTimeClosed() {
        return timeClosed;
    }

    public void setTimeClosed(String timeClosed) {
        this.timeClosed = timeClosed;
    }

    public String getBusinessBio() {
        return businessBio;
    }

    public void setBusinessBio(String businessBio) {
        this.businessBio = businessBio;
    }

    public String getCovidProtocols() {
        return covidProtocols;
    }

    public void setCovidProtocols(String covidProtocols) {
        this.covidProtocols = covidProtocols;
    }

    @Override
    public String toString() {
        return "Business{" +
                "businessName='" + businessName + '\'' +
                ", businessAddress='" + businessAddress + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", timeOpen='" + timeOpen + '\'' +
                ", timeClosed='" + timeClosed + '\'' +
                ", businessBio='" + businessBio + '\'' +
                ", covidProtocols='" + covidProtocols + '\'' +
                '}';
    }
}

