package classes;

public class Cookie {
    private String color;

    public Cookie(String color) {
        this.color = color;
    }
    public String getColor() {
        return color;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public static void main(String[] args) {
        Cookie cookie = new Cookie("Brown");
        System.out.println(cookie.getColor());

        Cookie cookie1 = new Cookie("Red");
        System.out.println(cookie1.getColor());
    }
    
}
