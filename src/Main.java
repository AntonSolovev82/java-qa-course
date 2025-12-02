public class Main {
    public static void main(String[] args) {
        System.out.println("🚀 Java QA Course Started!");
        System.out.println("📅 Start Date: " + java.time.LocalDate.now());
        System.out.println("🎯 Goal: Java Automation Engineer in 8 weeks");

        displayCourseInfo();
    }

    public static void displayCourseInfo() {
        String[] topics = {
                "Week 1-2: Java Fundamentals & OOP",
                "Week 3-4: Selenium WebDriver",
                "Week 5-6: Advanced Framework",
                "Week 7-8: CI/CD & Real Project"
        };

        System.out.println("\n📚 Course Structure:");
        for (String topic : topics) {
            System.out.println("✅ " + topic);
        }
    }
}
