package ex17082024;

public enum APIconstants {

    BASE_URL("https://app.vwo.com"),
    LOGIN_PAGE("https://app.vwo.com/login"),
    DASHBOARD_PAGE("https://app.vwo.com/dasHboard"),
    CHATBOT_PAGE("https://app.vwo.com/chat");

    private String name;
    APIconstants(String name){
        this.name = name;
    }

    public String getvalue(){
        return name;
    }
}
