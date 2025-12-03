public class TestDataGenerator {
    public static void main(String[] args) {
        System.out.println("=== 🧪 ГЕНЕРАТОР ТЕСТОВЫХ ДАННЫХ ===\n");

        // 1. Базовые переменные (как в реальных тестах)
        String testUser = "qa_tester_" + System.currentTimeMillis();
        String testEmail = testUser + "@testmail.com";
        String testPassword = "Test@Pass123" ; // new password 
        String testPhoneNumber = "+79999999999" // new 
        int userAge = 25;
        int loginAttempts = 3; // new (task)
        boolean isPremiumUser = true;
        double accountBalance = 1500.75;
      
        // 2. Выводим тестовые данные
        System.out.println("📋 БАЗОВЫЕ ТЕСТОВЫЕ ДАННЫЕ:");
        System.out.println("👤 Логин: " + testUser);
        System.out.println("📧 Email: " + testEmail);
        System.out.println("🔒пароль :"+testPassword);
        System.out.println("🚪Количество  попыток входов :"+testPassword);
        System.out.println("📱телефон :"+testPhoneNumber);
        System.out.println("🎂 Возраст: " + userAge + " лет");
        System.out.println("⭐ Премиум: " + (isPremiumUser ? "Да" : "Нет"));
        System.out.println("💰 Баланс: $" + accountBalance);

        // 3. Генерация случайных данных (имитация тестов)
        System.out.println("\n🎲 СЛУЧАЙНЫЕ ТЕСТОВЫЕ ДАННЫЕ:");
        generateRandomTestData();

        // 4. Валидация данных (проверка правильности)
        System.out.println("\n✅ ВАЛИДАЦИЯ ДАННЫХ:");
        validateTestData(testUser, userAge);
    }

    // Метод для генерации случайных тестовых данных
    public static void generateRandomTestData() {
        // Симуляция разных тестовых сценариев
        String[] products = {"Laptop", "Phone", "Tablet", "Monitor"};
        int randomIndex = (int) (Math.random() * products.length);
        int quantity = (int) (Math.random() * 10) + 1;
        double price = 99.99 * quantity;

        System.out.println("🛒 Тестовый заказ:");
        System.out.println("   Товар: " + products[randomIndex]);
        System.out.println("   Количество: " + quantity);
        System.out.println("   Стоимость: $" + String.format("%.2f", price));
    }

    // Метод для валидации данных (как в автоматизированных тестах)
    public static void validateTestData(String username, int age) {
        boolean isUsernameValid = username.length() >= 5;
        boolean isAgeValid = age >= 18 && age <= 100;

        System.out.println("🔍 Проверка username: " +
                (isUsernameValid ? "✅ Валиден" : "❌ Слишком короткий"));
        System.out.println("🔍 Проверка возраста: " +
                (isAgeValid ? "✅ Валиден" : "❌ Недопустимый возраст"));

        if (isUsernameValid && isAgeValid) {
            System.out.println("\n🎉 Все тестовые данные прошли валидацию!");
        } else {
            System.out.println("\n⚠️ Обнаружены проблемы в тестовых данных!");
        }
    }
}
