package emilapp;
//  Email Administration Application
public class Emailapp {    
    public static void main(String[] args) {
        email em = new email("pramod","mahajan");
         em.setAlternateEmail("pramod12@gmail.com");
        System.out.println(em.ShowInfo());
    }
}
