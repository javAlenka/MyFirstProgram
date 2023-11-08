package homework3;

public class Task3 {
    //    Парсим соцсети
//    У вас есть публикация в социальной сети, и вам необходимо определить индекс последнего появления
//    определенного хэштега #javaforever.
    public static void main(String[] args) {
        String post = "Это публикация с хэштегом #javaforever и другими словами #programming #javaforever";

        String hashtagToFind = "#javaforever";

        int lastIndex = -1;
        int startIndex = 0;

        while (true) {
            int index = post.indexOf(hashtagToFind, startIndex);
            if (index == -1) {
                break; // Если хэштег больше не найден
            }
            lastIndex = index;
            startIndex = index + 1;
        }

        if (lastIndex != -1) {
            System.out.println("Индекс последнего появления хэштега " + hashtagToFind + ": " + lastIndex);
        } else {
            System.out.println("Хэштег " + hashtagToFind + " не найден в публикации.");
        }
    }
}
